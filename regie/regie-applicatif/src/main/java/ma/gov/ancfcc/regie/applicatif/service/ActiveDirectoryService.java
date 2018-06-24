package ma.gov.ancfcc.regie.applicatif.service;

import javax.naming.NamingException;

import ma.gov.ancfcc.regie.exception.NotAutorizedException;

/**
 * Service d'authentification Windows (Active Directory)
 */
public interface ActiveDirectoryService {

	/**
	 * Authentifier un agent auprès de l'AD.
	 * 
	 * @param accountName
	 *            compte Windows
	 * @param password
	 *            mot de passe Windows
	 * 
	 * @return
	 * @throws NamingException
	 * @throws NotAutorizedException
	 */
	boolean authenticate(String accountName, String password) throws NotAutorizedException, NamingException;
}
