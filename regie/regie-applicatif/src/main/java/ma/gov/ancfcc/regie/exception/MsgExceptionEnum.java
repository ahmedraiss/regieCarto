package ma.gov.ancfcc.regie.exception;

public enum MsgExceptionEnum {

	MSG_COMMUNICATION_EXCEPTION(
			"يتعذر الاتصال بالخادم. المرجو الاتصال بمصلحة المستخدمين", "Impossible de contacter le serveur AD. Veuillez contacter le service de support."
	), MSG_AUTHENTICATION_EXCEPTION(
			"اسم الحساب أو كلمة المرور غير صحيحة", "Le nom du compte ou le mot de passe est incorrect."
	), MSG_NOTAUTORIZED_EXCEPTION(
			"اسم الحساب غير مخول لإستعمال التطبيق", "Le nom du compte n'est pas autorisé à utiliser l'application."
	), MSG_NAMING_EXCEPTION(
			"حدث مشكل أثناء الاتصال بالخادم. المرجو الاتصال بمصلحة المستخدمين",
			"Un problème est survenu lors de la connexion au serveur AD. Veuillez contacter le service de support."
	);

	private String arMsg;
	private String frMsg;

	private MsgExceptionEnum(String arMsg, String frMsg) {
		this.arMsg = arMsg;
		this.frMsg = frMsg;
	}

	public String getArMsg() {
		return arMsg;
	}

	public String getFrMsg() {
		return frMsg;
	}

}
