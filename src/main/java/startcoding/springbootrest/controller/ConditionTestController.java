//package startcoding.springbootrest.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import startcoding.springbootrest.ax.TaxCalculationService;
//
//@RestController
//@RequestMapping("/condition")
//public class ConditionTestController {
//
//	@Qualifier("taxCalculationService")
//	@Autowired	
//	TaxCalculationService taxCalculationService;
//	
//	
//	@GetMapping(value="/bean")
//	public void checkBean() {
//		System.out.println("Testing Bean" + taxCalculationService.getTaxRate());
//	}
//}
