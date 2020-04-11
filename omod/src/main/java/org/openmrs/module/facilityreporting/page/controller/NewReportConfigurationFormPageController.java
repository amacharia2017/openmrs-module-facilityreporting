package org.openmrs.module.facilityreporting.page.controller;

import org.openmrs.module.facilityreporting.FacilityReportingConstant;
import org.openmrs.module.kenyaui.annotation.AppPage;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

@AppPage(FacilityReportingConstant.APP_FALICITY_REPORTING)
public class NewReportConfigurationFormPageController {
	
	public void controller(@RequestParam("returnUrl") String url, PageModel model) {
		model.addAttribute("returnUrl", url);
		
	}
}
