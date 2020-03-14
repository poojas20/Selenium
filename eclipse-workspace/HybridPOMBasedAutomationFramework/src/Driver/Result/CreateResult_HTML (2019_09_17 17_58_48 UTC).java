package Result;

import java.io.PrintWriter;
import java.util.Map;

import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.internal.Utils;
import org.testng.xml.XmlTest;

public class CreateResult_HTML {
	private PrintWriter summarywriter;
	private int totalpassedTestCases=0;
	private int totalfailedTestCases=0;
	private int totalTestCases=0;
	public CreateResult_HTML(PrintWriter summarywriter)
	{
		this.summarywriter= summarywriter;
	}
	
	public void generateSummaryReportFile(ISuite suite)
	{
		StartHTML();
		SummaryTable(suite);
		addResultTable(suite);
		endHtml(summarywriter);
		summarywriter.flush();
		summarywriter.close();
	}
	private void StartHTML()
	{
		summarywriter.println("<html>");
		summarywriter.println("<head>");
		summarywriter.println("</head>");
		summarywriter.println("<body>");
		summarywriter.println("<h1><center>iGuru Test Results</center></h1>");
	}
	
	private void SummaryTable(ISuite suite)
	{
		summarywriter.println("</br>");
		summarywriter.println("<table border='1' align='center'>");
		summarywriter.println("<tr>");
		summarywriter.println("<td colspan='2'> <div align='center'><b><u>Test Execution Summary </u></b></div></td>");
		summarywriter.println("</tr>");
		GetTestscount(suite);
		Map<String, ISuiteResult> tests = suite.getResults();
		AddTableRow("Start Time", tests.values().iterator().next().getTestContext().getStartDate().toString());
		AddTableRow("End Time", tests.values().stream().findFirst().get().getTestContext().getEndDate().toString());
		AddTableRow("Total Test Execution", String.valueOf(totalTestCases));
		AddTableRow("Total Passed Tests", String.valueOf(totalpassedTestCases));
		AddTableRow("Total Failed Tests", String.valueOf(totalfailedTestCases));
		summarywriter.println("</table>");
		summarywriter.println("</br>");
		
		
	}
	
	private void AddTableRow(String Label,String Value)
	{
		summarywriter.println("<tr>");
		summarywriter.println("<td> <font color='blue'>"+Label+"</font></td>");
		summarywriter.println("<td><font color='blue'>"+Value+"</font></td>");
		summarywriter.println("</tr>");
	}
	
	private void endHtml(PrintWriter out) {
		out.println("<center> TestNG Report </center>");
		out.println("</body></html>");
	}
	
	private void GetTestscount(ISuite suite)
	{
		for (ISuiteResult re : suite.getResults().values()) {
			 totalpassedTestCases=totalpassedTestCases+re.getTestContext().getPassedTests().size();
			 totalfailedTestCases=totalfailedTestCases+re.getTestContext().getFailedTests().size();
			 totalTestCases= totalTestCases+re.getTestContext().getAllTestMethods().length;
		}
		
	}
	
	private void AddResultTableRow(IResultMap map)
	{
		
		  for (ITestResult user : map.getAllResults())
		  {
			  summarywriter.println("<td> <font color='blue'>"+user.getName()+"</font></td>");
			  summarywriter.println("<td><font color='blue'>"+GetStsus(user.getStatus())+"</font></td>");
			  if(user.getStatus()==2)
			  {
				  summarywriter.println("<td><font color='Green'><b>"+Utils.stackTrace(user.getThrowable(), true)[0]+"</b></font></td>");
			  }
			  else
			  {
				  summarywriter.println("<td><font color='Green'><b></b></font></td>");
			  }
			  summarywriter.println("<td><font color='Green'><b></b></font></td>");
			  summarywriter.println("</tr>");
		}
	}
	
	
	private void addResultTable(ISuite Suite)
	{
		summarywriter.println("</br>");
		summarywriter.println("<table border='1' align='center'>");
		summarywriter.println("<tr>");
		summarywriter.println("<td colspan='4'> <div align='center'><b><u>Test Execution Results </u></b></div></td>");
		summarywriter.println("</tr>");
		summarywriter.println("<tr class='headerRow'>");
		summarywriter.println("<th>MethodName</th>");
		summarywriter.println("<th>Status</th>");
		summarywriter.println("<th>Exception</th>");
		summarywriter.println("<th>screen Shot</th>");
		summarywriter.println("</tr>");
		for (XmlTest test : Suite.getXmlSuite().getTests()) {
			summarywriter.println("<tr>");
			summarywriter.println("<td colspan='4'> <div align='center'><b><u>"+test.getName()+"</u></b></div></td>");
			summarywriter.println("</tr>");
			AddResultTableRow(Suite.getResults().get(test.getName()).getTestContext().getPassedTests());
			AddResultTableRow(Suite.getResults().get(test.getName()).getTestContext().getFailedTests());
		}
		summarywriter.println("</table>");
		summarywriter.println("</br>");
	}
	
	public String GetStsus(int Status)
	{
		String Result="N/A";
		switch(Status)
		{
		case 1:
			Result="Passed";
			break;
		case 2:
			Result="Failed";
			break;
		}
		return Result;
	}
}
