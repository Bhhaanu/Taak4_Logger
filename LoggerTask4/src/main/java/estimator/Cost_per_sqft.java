package estimator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Cost_per_sqft {
	private static final Logger LOGGER= LogManager.getLogger(Cost_per_sqft.class);
	public double cost_estimator(int standard,double area) {
		LOGGER.error("checking range");
        if(standard>4) throw new StandardInvalidException("Standard should range from 1 to 4 only");
        LOGGER.error("estimating cost");
        int[] standards={
                1200,1500,1800,2500
        };
        LOGGER.error("Calculation cost of house");
        return standards[standard-1]*area;
    }
}
