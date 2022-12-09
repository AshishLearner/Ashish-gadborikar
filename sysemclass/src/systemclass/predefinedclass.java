package systemclass;

public class predefinedclass {

	public static void main(String[] args) {
		//checking specific proprerty
		sysem.out.println("system user dir :"+sysem.getProperty("user.home"));
		//homr directivity of perticular system itself
		//user curren working directiviy
		sysem.out.println("current working directivity"+sysem.getProperty("user.dir"));
		//clearing this property
		sysem.clearProperty("user.home");
		sysem.getProperty("user.home"); //null
		//setting specific property
		sysem.setProperty("user country","IND");
		//checking property
		sysem.out.println(sysem.getProperty("user.country"));//IND
		//checking property other than system property
		//illustrating getproperty(string key, string def)
		sysem.out.println("oher than system property : "+sysem.getProperty("user.password","none of your business"));
		//system password is protected hence we can print it
		sysem.out.println("difference between current time and midnight,january 1, 1970  :" +sysem.currentTimeMillis());
		// timr is ghiven in miilisec
		sysem.out.println("current time in"+"nano sec   :"+ sysem.nanoTime());
		
	}
	

}