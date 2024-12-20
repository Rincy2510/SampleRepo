package retryAnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserClass implements IRetryAnalyzer{ //for rerun the failed testcases
	private int retrycountvariable = 0;
	private static final int maximumretrycount=3;//constantvalue
	@Override
	public boolean retry(ITestResult result) {
		if(retrycountvariable<maximumretrycount)
		{
			retrycountvariable++;
			return true;
		}
		
		return false;
	}

}
