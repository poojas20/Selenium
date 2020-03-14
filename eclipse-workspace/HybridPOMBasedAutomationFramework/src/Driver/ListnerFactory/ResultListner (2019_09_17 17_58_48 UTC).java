package ListnerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import Result.CreateResult_HTML;

public class ResultListner implements IReporter {
	private String summaryreportFileName = "IgurubatchCustomReport.html";
	private PrintWriter writer_summary;
	
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		try {
			
			writer_summary=createWriter(outputDirectory, summaryreportFileName);
		} catch (IOException e) {
			System.err.println("Unable to create output file");
			e.printStackTrace();
			return;
		}
		CreateResult_HTML sumResult= new CreateResult_HTML(writer_summary);
		sumResult.generateSummaryReportFile(suites.get(0));
	}
	
	protected PrintWriter createWriter(String outdir,String FileName) throws IOException {
		new File(outdir).mkdirs();
		return new PrintWriter(new BufferedWriter(new FileWriter(new File(outdir, FileName))));
	}
}
