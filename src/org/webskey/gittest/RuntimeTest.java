package org.webskey.gittest;

import java.io.File;

public class RuntimeTest {

	public static void main(String[] args) {
		try {   
			File dir = new File("C:/users/lukasz/desktop");
			File dir1 = new File("C:/users/lukasz/desktop/"/*eclipse*/);
			Runtime.getRuntime().exec("java -jar q.jar", null, dir);				
			Runtime.getRuntime().exec("\"C:/Program Files (x86)/VideoLAN/VLC/vlc.exe\" Moozyka.xspf", null, dir);
			Runtime.getRuntime().exec("\"C:\\Program Files\\Mozilla Firefox\\firefox.exe\" http://magiafutbolu.pl/ http://www.blaugrana.pl/");
			Runtime.getRuntime().exec("\"C:/users/lukasz/desktop/eclipse-jee/eclipse/eclipse.exe -data C:/users/lukasz/workspace");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
