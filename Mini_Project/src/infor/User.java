package infor;

public class User {
	static String username;
	public static String userId;
	public static String userPassword;
	
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		User.username = username;
	}
	public static String getUserId() {
		return userId;
	}
	public static void setUserId(String userId) {
		User.userId = userId;
	}
	public static String getUserPassword() {
		return userPassword;
	}
	public static void setUserPassword(String userPassword) {
		User.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
