package ma.gov.ancfcc.regie.applicatif.service.impl;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.applicatif.service.ActiveDirectoryService;

@Service
public class ActiveDirectoryServiceImpl implements ActiveDirectoryService {

	// @Value("${auth.autor.ad.initialContextFactory}")
	private String initialContextFactory;

	// @Value("${auth.autor.ad.securityAuthentication}")
	private String securityAuthentication;

	// @Value("${auth.autor.ad.providerUrl}")
	private String providerUrl;

	// @Value("${auth.autor.ad.domaine}")
	private String domaine;

	/**
	 * {@inheritDoc}
	 */
	public boolean authenticate(String accountName, String password) throws NamingException {

		Hashtable<String, String> environment = new Hashtable<String, String>();
		environment.put(Context.INITIAL_CONTEXT_FACTORY, initialContextFactory);
		environment.put(Context.SECURITY_AUTHENTICATION, securityAuthentication);
		environment.put(Context.PROVIDER_URL, providerUrl);
		environment.put(Context.SECURITY_PRINCIPAL, accountName + domaine);
		environment.put(Context.SECURITY_CREDENTIALS, password);

		DirContext context = new InitialDirContext(environment);
		context.close();
		return true;

	}

}
