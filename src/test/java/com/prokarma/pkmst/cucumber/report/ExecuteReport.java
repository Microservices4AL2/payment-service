package com.prokarma.pkmst.cucumber.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ExecuteReport {

  public static void main(String[] args) {
    generateReport();
  }

  private static void generateReport() {
    String buildNumber = "1";
    String projectName = "Spring-micro-sample";
    boolean runWithJenkins = false;
    boolean parallelTesting = false;

    File reportOutputDirectory = null;
    List<String> jsonFiles = null;
    Configuration configuration = null;
    ReportBuilder reportBuilder = null;
    reportOutputDirectory = new File("./report/payments-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/payments-report-json/payments.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();

  }
}