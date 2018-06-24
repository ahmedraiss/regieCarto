package ma.gov.ancfcc.regie.web.action;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.map.HashedMap;
import org.apache.struts2.interceptor.SessionAware;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import ma.gov.ancfcc.regie.applicatif.service.CarteAService;
import ma.gov.ancfcc.regie.applicatif.service.CarteTypeAService;
import ma.gov.ancfcc.regie.applicatif.service.CategoriecarteAService;
import ma.gov.ancfcc.regie.applicatif.service.DemandeAService;
import ma.gov.ancfcc.regie.applicatif.service.EchelleCarteAService;
import ma.gov.ancfcc.regie.applicatif.service.NatureCarteAService;
import ma.gov.ancfcc.regie.applicatif.service.SupportCarteAService;
import ma.gov.ancfcc.regie.business.dto.AgentDTO;
import ma.gov.ancfcc.regie.business.dto.CarteDTO;
import ma.gov.ancfcc.regie.business.dto.CarteTypeDTO;
import ma.gov.ancfcc.regie.business.dto.CategorieCarteDTO;
import ma.gov.ancfcc.regie.business.dto.DemandeDTO;
import ma.gov.ancfcc.regie.business.dto.EchelleCarteDTO;
import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;
import ma.gov.ancfcc.regie.business.dto.SupportCarteDTO;
import ma.gov.ancfcc.regie.dao.entity.CarteEntity;
import ma.gov.ancfcc.regie.dao.entity.CarteTypeEntity;
import ma.gov.ancfcc.regie.dao.entity.DemandeEntity;
import ma.gov.ancfcc.regie.web.bean.CarteBean;
import ma.gov.ancfcc.regie.web.bean.CarteTypeBean;
import ma.gov.ancfcc.regie.web.bean.CategorieCarteBean;
import ma.gov.ancfcc.regie.web.bean.DemandeBean;
import ma.gov.ancfcc.regie.web.bean.EchelleCarteBean;
import ma.gov.ancfcc.regie.web.bean.NatureCarteBean;
import ma.gov.ancfcc.regie.web.bean.SupportCarteBean;

public class SaisieAffaireInitAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	@Autowired
	private CategoriecarteAService categoriecarteAService;

	@Autowired
	private EchelleCarteAService echelleCarteAService;

	@Autowired
	private NatureCarteAService natureCarteAService;

	@Autowired
	private SupportCarteAService supportCarteAService;

	@Autowired
	private CarteTypeAService carteTypeAService;

	@Autowired
	private CarteAService carteAService;

	@Autowired
	private DemandeAService demandeAService;

	@Autowired
	private Mapper mapper;

	private List<CategorieCarteBean> categorieCarteBean = new ArrayList<>();
	private List<EchelleCarteBean> echelleCarteBean = new ArrayList<>();
	private List<NatureCarteBean> natureCarteBean = new ArrayList<>();
	private List<SupportCarteBean> supportCarteBean = new ArrayList<>();
	private List<CarteTypeBean> carteTypeBean = new ArrayList<>();
	private CarteBean carteBean;
	private CarteTypeBean carteTypeBeansingle;
	private DemandeBean demandeBean;

	private List<CategorieCarteDTO> categorieCarteDTO;
	private List<EchelleCarteDTO> echelleCarteDTO;
	private List<NatureCarteDTO> natureCarteDTO;
	private List<SupportCarteDTO> supportCarteDTO;
	private List<CarteTypeDTO> carteTypeDTO;
	private List<CarteDTO> carteDTOs;
	private Map<Integer, CarteDTO> carteDTOMap;
	private Map<Integer, CarteDTO> carteDTOSave;

	private String yourCategorieCarte;
	private String yourEchelleCarte;
	private String yourSupportCarte;
	private String yourCarteType;
	private int cmpt;
	private String SelectednatureCarte;
	private float total=0;
	
	private InputStream inputStream;

	public String init() throws Exception {

		String Error = null;

		try {
			// recupere les informations de categoriecarteDTO

			List<CategorieCarteDTO> carteCategorierecuperer = categoriecarteAService
					.afficheListeCategorie(categorieCarteDTO);

			// mapper la liste categorie DTO to BEAN

			for (CategorieCarteDTO element : carteCategorierecuperer) {
				categorieCarteBean.add(mapper.map(element, CategorieCarteBean.class));
			}
			session.put("categorieCarteBean", categorieCarteBean);

			// recuppere les informatrions de NaturecarteDTO

			List<NatureCarteDTO> natureCarterecupere = natureCarteAService.afficheListenature(natureCarteDTO);

			// mapper la liste nature DTO to BEAN

			for (NatureCarteDTO element : natureCarterecupere) {

				natureCarteBean.add(mapper.map(element, NatureCarteBean.class));

			}
			session.put("natureCarteBean", natureCarteBean);

			return SUCCESS;
		} catch (Exception ex) {
			Error = ex.toString();
		}

		session.put("Error", Error);
		return ERROR;

	}

	public String support() throws Exception {

		String Error = null;
		String chiane = "";
		String chaineLabell = "";
		int chaineID;

		try {

			// recupere id de la nature selectoinne
			NatureCarteDTO natureCarteDTO = mapper.map(natureCarteBean, NatureCarteDTO.class);
			natureCarteDTO.setNatureLabell(getSelectednatureCarte());

			// charger la liste support en fonctionne de l id de nature
			List<SupportCarteDTO> supportCarterecupere = supportCarteAService.afficheListenature(natureCarteDTO);

			// mapper la liste support DTO to BEAN
			for (SupportCarteDTO element : supportCarterecupere) {
				chaineLabell = element.getSupportlabell();
				chaineID = element.getId();

				supportCarteBean.add(mapper.map(element, SupportCarteBean.class));
				chiane = chiane + chaineID + "|" + chaineLabell + ";";

			}
			inputStream = new ByteArrayInputStream(chiane.getBytes("UTF-8"));

			return SUCCESS;
		} catch (Exception ex) {
			Error = ex.toString();
		}

		session.put("Error", Error);
		return ERROR;

	}

	public String carte() throws Exception {

		String Error = null;
		float chianeprix;
		String chaineLabell = "";
		int chaineID;
		String chaine = "";

		try {

			// recupere id de la categorie et la nature selectoinne
			NatureCarteDTO natureCarteDTO = mapper.map(natureCarteBean, NatureCarteDTO.class);
			natureCarteDTO.setNatureLabell(getSelectednatureCarte());

			CategorieCarteDTO categorieCarteDTO = mapper.map(categorieCarteBean, CategorieCarteDTO.class);
			categorieCarteDTO.setLabelleCategorie(getYourCategorieCarte());

			// charger la liste carte en fonctionne de id de nature et categorie
			List<CarteTypeDTO> carteTyperecupere = carteTypeAService.afficheListcarte(categorieCarteDTO,
					natureCarteDTO);

			// mapper la liste support DTO to BEAN
			for (CarteTypeDTO element : carteTyperecupere) {

				chaineLabell = element.getCartelabell();
				chianeprix = element.getPrixunitaire();
				chaineID = element.getId();

				carteTypeBean.add(mapper.map(element, CarteTypeBean.class));
				chaine = chaine + chaineID + "|" + chaineLabell + "|" + chianeprix + ";";

			}
			// charger le prix de la carte en fonctionne de id de nature et categorie

			// CarteTypeDTO carteTypeDTO =
			// carteTypeAService.affichePrixCarte(categorieCarteDTO, natureCarteDTO);

			// carteTypeBeansingle = mapper.map(carteTypeDTO, CarteTypeBean.class);
			inputStream = new ByteArrayInputStream(chaine.getBytes("UTF-8"));

			//

			return SUCCESS;
		} catch (Exception ex) {
			Error = ex.toString();
		}

		session.put("Error", Error);
		return ERROR;

	}

	public String echelle() throws Exception {

		String Error = null;
		String chiane = "";
		String chaineLabell = "";
		int chaineID;

		try {

			// recupere id de la carte selectoinne
			CarteTypeDTO carteTypeDTO = mapper.map(carteTypeBean, CarteTypeDTO.class);
			carteTypeDTO.setCartelabell(getYourCarteType());

			// charger la liste support en fonctionne de l id de nature
			List<EchelleCarteDTO> echelleCarterecupere = echelleCarteAService.afficheListeEchelle(carteTypeDTO);

			// mapper la liste support DTO to BEAN
			for (EchelleCarteDTO element : echelleCarterecupere) {
				chaineLabell = element.getLabelleEchell();
				chaineID = element.getId();

				echelleCarteBean.add(mapper.map(element, EchelleCarteBean.class));
				chiane = chiane + chaineID + "|" + chaineLabell + ";";

			}
			inputStream = new ByteArrayInputStream(chiane.getBytes("UTF-8"));

			return SUCCESS;
		} catch (Exception ex) {
			Error = ex.toString();
		}

		session.put("Error", Error);
		return ERROR;

	}

	public String cartePrix() throws Exception {

		String Error = null;
		float chianeprix;
		String chaineLabell = "";
		int chaineID;
		String chain = "";

		try {

			// charger le prix de la carte en fonctionne du nom du carte selectionne

			CarteTypeDTO carteTypeDTO = mapper.map(carteTypeBean, CarteTypeDTO.class);
			carteTypeDTO.setCartelabell(getYourCarteType());

			// System.out.println(getYourCarteType());

			CarteTypeDTO carteTypeDTOPrix = carteTypeAService.affichePrixCarte(carteTypeDTO);

			carteTypeBeansingle = mapper.map(carteTypeDTOPrix, CarteTypeBean.class);
			chaineLabell = carteTypeBeansingle.getCartelabell();
			// System.out.println(chaineLabell);
			chianeprix = carteTypeBeansingle.getPrixunitaire();
			chaineID = carteTypeBeansingle.getId();
			
			session.put("chianeprix", chianeprix);

			chain = chaineID + "|" + chaineLabell + "|" + chianeprix;
			// chain ="2" + "|" + "aaa" + "|" + "20";

			inputStream = new ByteArrayInputStream(chain.getBytes("UTF-8"));

			return SUCCESS;
		} catch (Exception ex) {
			Error = ex.toString();
		}

		session.put("Error", Error);
		return ERROR;

	}

	public String achat() {

		String Error = null;
		int chaineId;
		int chainenbr;
		String chaineRef;
		String chaineDesc;
		String chaine = null;

		// tester est ce que la session est vide
		// sinon on va recuperer les anciennes valeurs qui se trouve dans la session et
		// on l'ajout dans la nouvelle liste

		try {

			if (session.get("carteDTOMap") != null) {
				carteDTOMap = (Map<Integer, CarteDTO>) session.get("carteDTOMap");
			} else {
				carteDTOMap = new HashMap<>();
			}
			
			if (session.get("total")!=null) {
				total= (float) session.get("total");
			}

			// enregister chaque panier dans une List

			CarteDTO carteDTO = mapper.map(carteBean, CarteDTO.class);
			carteDTOMap.put(cmpt, carteDTO);

			// enregistrer la liste dans une session

			session.put("carteDTOMap", carteDTOMap);

			// aficher les donnes qui se trouve dans la session dans la table

			chaineId = cmpt;
			chaineDesc = carteDTO.getDescription();
			chaineRef = carteDTO.getRefProduit();
			chainenbr = carteDTO.getNombre();
			
			CarteTypeDTO selectedCarte = new CarteTypeDTO();
			selectedCarte.setCartelabell(getYourCarteType());
			carteDTO.setCarteTypeDTO(selectedCarte);

			float prix = (float) session.get("chianeprix");
				total = total + prix*chainenbr;
				
			chaine = getYourCategorieCarte() + "|" + getSelectednatureCarte() + "|" + getYourCarteType() + "|"
					+ getYourEchelleCarte() + "|" + getYourSupportCarte() + "|" + chaineId + "|" + chaineDesc + "|"
							+ chaineRef + "|" + chainenbr + "|" + total;
			//System.out.println(total);
			
			session.put("total", total);
			
			inputStream = new ByteArrayInputStream(chaine.getBytes("UTF-8"));

			return SUCCESS;

		} catch (Exception ex) {
			ex.printStackTrace();
			Error = ex.toString();
		}

		return Error;

	}

	public String removeAchat() throws Exception  {
		String Error = null;
		
			
			if (session.get("carteDTOMap") != null) {

				carteDTOMap = (Map<Integer, CarteDTO>) session.get("carteDTOMap");
				
				
				for (Integer key : carteDTOMap.keySet()) {
					System.out.print(key+":");
				}
				
				System.out.println();
				System.out.println(cmpt);
				
				int nombre = carteDTOMap.get(cmpt).getNombre();
				
				
				CarteTypeDTO carteTypeDTOPrix = carteTypeAService.affichePrixCarte(carteDTOMap.get(cmpt).getCarteTypeDTO());
				
				float prix = carteTypeDTOPrix.getPrixunitaire();
				
				
				total= (float) session.get("total");
				System.out.println("ancienne"+total);
				
				total = total - nombre*prix;
				System.out.println("nouveau"+total);
				
				session.put("total", total);
				
				carteDTOMap.remove(cmpt);

				String chaine =null;
				
				chaine = Float.toString(total);
				
				inputStream = new ByteArrayInputStream(chaine.getBytes("UTF-8"));
			
			
			}
		return SUCCESS;

	}

	public void enregisterAchat() {
		// enregistrer demande
		DemandeDTO demandeDTO = mapper.map(demandeBean, DemandeDTO.class);
		carteDTOSave = (Map<Integer, CarteDTO>) session.get("carteDTOMap");
		
		demandeAService.ajouterDemande(demandeDTO, carteDTOSave);
		
	}

	public int getCmpt() {
		return cmpt;
	}

	public void setCmpt(int cmpt) {
		this.cmpt = cmpt;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public CategoriecarteAService getCategoriecarteAService() {
		return categoriecarteAService;
	}

	public void setCategoriecarteAService(CategoriecarteAService categoriecarteAService) {
		this.categoriecarteAService = categoriecarteAService;
	}

	public EchelleCarteAService getEchelleCarteAService() {
		return echelleCarteAService;
	}

	public void setEchelleCarteAService(EchelleCarteAService echelleCarteAService) {
		this.echelleCarteAService = echelleCarteAService;
	}

	public NatureCarteAService getNatureCarteAService() {
		return natureCarteAService;
	}

	public void setNatureCarteAService(NatureCarteAService natureCarteAService) {
		this.natureCarteAService = natureCarteAService;
	}

	public SupportCarteAService getSupportCarteAService() {
		return supportCarteAService;
	}

	public void setSupportCarteAService(SupportCarteAService supportCarteAService) {
		this.supportCarteAService = supportCarteAService;
	}

	public Mapper getMapper() {
		return mapper;
	}

	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}

	public List<CategorieCarteBean> getCategorieCarteBean() {
		return categorieCarteBean;
	}

	public void setCategorieCarteBean(List<CategorieCarteBean> categorieCarteBean) {
		this.categorieCarteBean = categorieCarteBean;
	}

	public List<EchelleCarteBean> getEchelleCarteBean() {
		return echelleCarteBean;
	}

	public void setEchelleCarteBean(List<EchelleCarteBean> echelleCarteBean) {
		this.echelleCarteBean = echelleCarteBean;
	}

	public List<NatureCarteBean> getNatureCarteBean() {
		return natureCarteBean;
	}

	public void setNatureCarteBean(List<NatureCarteBean> natureCarteBean) {
		this.natureCarteBean = natureCarteBean;
	}

	public List<SupportCarteBean> getSupportCarteBean() {
		return supportCarteBean;
	}

	public void setSupportCarteBean(List<SupportCarteBean> supportCarteBean) {
		this.supportCarteBean = supportCarteBean;
	}

	public List<CategorieCarteDTO> getCategorieCarteDTO() {
		return categorieCarteDTO;
	}

	public void setCategorieCarteDTO(List<CategorieCarteDTO> categorieCarteDTO) {
		this.categorieCarteDTO = categorieCarteDTO;
	}

	public List<EchelleCarteDTO> getEchelleCarteDTO() {
		return echelleCarteDTO;
	}

	public void setEchelleCarteDTO(List<EchelleCarteDTO> echelleCarteDTO) {
		this.echelleCarteDTO = echelleCarteDTO;
	}

	public List<NatureCarteDTO> getNatureCarteDTO() {
		return natureCarteDTO;
	}

	public void setNatureCarteDTO(List<NatureCarteDTO> natureCarteDTO) {
		this.natureCarteDTO = natureCarteDTO;
	}

	public List<SupportCarteDTO> getSupportCarteDTO() {
		return supportCarteDTO;
	}

	public void setSupportCarteDTO(List<SupportCarteDTO> supportCarteDTO) {
		this.supportCarteDTO = supportCarteDTO;
	}

	public CarteTypeBean getCarteTypeBeansingle() {
		return carteTypeBeansingle;
	}

	public void setCarteTypeBeansingle(CarteTypeBean carteTypeBeansingle) {
		this.carteTypeBeansingle = carteTypeBeansingle;
	}

	public String getYourCategorieCarte() {
		return yourCategorieCarte;
	}

	public void setYourCategorieCarte(String yourCategorieCarte) {
		this.yourCategorieCarte = yourCategorieCarte;
	}

	public String getYourEchelleCarte() {
		return yourEchelleCarte;
	}

	public void setYourEchelleCarte(String yourEchelleCarte) {
		this.yourEchelleCarte = yourEchelleCarte;
	}

	public String getYourSupportCarte() {
		return yourSupportCarte;
	}

	public CarteTypeAService getCarteTypeAService() {
		return carteTypeAService;
	}

	public void setCarteTypeAService(CarteTypeAService carteTypeAService) {
		this.carteTypeAService = carteTypeAService;
	}

	public List<CarteTypeBean> getCarteTypeBean() {
		return carteTypeBean;
	}

	public void setCarteTypeBean(List<CarteTypeBean> carteTypeBean) {
		this.carteTypeBean = carteTypeBean;
	}

	public List<CarteTypeDTO> getCarteTypeDTO() {
		return carteTypeDTO;
	}

	public void setCarteTypeDTO(List<CarteTypeDTO> carteTypeDTO) {
		this.carteTypeDTO = carteTypeDTO;
	}

	public String getYourCarteType() {
		return yourCarteType;
	}

	public void setYourCarteType(String yourCarteType) {
		this.yourCarteType = yourCarteType;
	}

	public void setYourSupportCarte(String yourSupportCarte) {
		this.yourSupportCarte = yourSupportCarte;
	}

	public String getSelectednatureCarte() {
		return SelectednatureCarte;
	}

	public void setSelectednatureCarte(String selectednatureCarte) {
		SelectednatureCarte = selectednatureCarte;
	}

	public CarteAService getCarteAService() {
		return carteAService;
	}

	public void setCarteAService(CarteAService carteAService) {
		this.carteAService = carteAService;
	}

	public CarteBean getCarteBean() {
		return carteBean;
	}

	public void setCarteBean(CarteBean carteBean) {
		this.carteBean = carteBean;
	}

	public List<CarteDTO> getCarteDTOs() {
		return carteDTOs;
	}

	public void setCarteDTOs(List<CarteDTO> carteDTOs) {
		this.carteDTOs = carteDTOs;
	}

	public Map<Integer, CarteDTO> getCarteDTOMap() {
		return carteDTOMap;
	}

	public void setCarteDTOMap(Map<Integer, CarteDTO> carteDTOMap) {
		this.carteDTOMap = carteDTOMap;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public Map<Integer, CarteDTO> getCarteDTOSave() {
		return carteDTOSave;
	}

	public void setCarteDTOSave(Map<Integer, CarteDTO> carteDTOSave) {
		this.carteDTOSave = carteDTOSave;
	}

	public DemandeAService getDemandeAService() {
		return demandeAService;
	}

	public void setDemandeAService(DemandeAService demandeAService) {
		this.demandeAService = demandeAService;
	}

	public DemandeBean getDemandeBean() {
		return demandeBean;
	}

	public void setDemandeBean(DemandeBean demandeBean) {
		this.demandeBean = demandeBean;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

}
