package startcoding.springbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	
	/*@Bean(name="taxCalculationService")
	@Conditional(USTaxCalculationCondition.class)
	public TaxCalculationService usTaxCalculationService() {
		System.out.println("Initializing USTaxCalculation Service");
		return new USTaxCalculationService();
	}
	
	@Bean(name="taxCalculationService")
	@Conditional(CATaxCalculationCondition.class)
	public TaxCalculationService caTaxCalculationService() {
		System.out.println("Initializing CATaxCalculation Service");
		return new CATaxCalculationService();
	}*/
}
