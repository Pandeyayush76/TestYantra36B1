package production;

import org.testng.annotations.Test;

public class OrganizationModuleTest {
	@Test
	public void createOrgTest() {
		System.out.println("createOrgTest executed");
		System.out.println("done");
		String browser=System.getProperty("BROWSER");
		String url=System.getProperty("URL");
		System.out.println(browser);
		System.out.println(url);
	}
	@Test
	public void createOrganizationAndDeleteTest() {
		System.out.println("createOrganizationAndDeleteTest executed");
		System.out.println("done");
		System.out.println("Verifying");
	}
		}

