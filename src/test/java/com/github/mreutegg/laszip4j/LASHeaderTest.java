package com.github.mreutegg.laszip4j;

import java.io.File;



public class LASHeaderTest {
	private static final String LAS_NAME = "lt_srs_rt.las";
	private static final String BASE_PATH = "D:/Education/Master/Thesis/Data Files";

	public void read(File lasFile) throws Exception {
		LASReader reader = new LASReader(lasFile);
		LASHeader header = reader.getHeader();
		
		String fileSignature = header.getFileSignature();
		char fileSourceID = header.getFileSourceID();
		char globalEncoding = header.getGlobalEncoding();
		int projectID_GUIDData1 = header.getProjectID_GUIDData1();
		char projectID_GUIDData2 = header.getProjectID_GUIDData2();
		char projectID_GUIDData3 = header.getProjectID_GUIDData3();
		byte[] projectID_GUIDData4 = header.getProjectID_GUIDData4();
		byte versionMajor = header.getVersionMajor();
		byte versionMinor = header.getVersionMinor();
		String systemIdentifier = header.getSystemIdentifier();
		int numofpoints = header.getLegacyNumberOfPointRecords();
		String generatingSW = header.getGeneratingSoftware();
		char fileCreationDayOfYear = header.getFileCreationDayOfYear();
		char fileCreationYear = header.getFileCreationYear();
		char headerSize = header.getHeaderSize();
		int offsetToPointData = header.getOffsetToPointData();
		int numberOfVariableLengthRecords = header.getNumberOfVariableLengthRecords();
		byte pointDataRecordFormat = header.getPointDataRecordFormat();
		char pointDataRecordLength = header.getPointDataRecordLength();
		int[] legacyNumberOfPointsByReturn = header.getLegacyNumberOfPointsByReturn();
		double xScaleFactor = header.getXScaleFactor();
		double yScaleFactor = header.getYScaleFactor();
		double zScaleFactor = header.getZScaleFactor();
		double xOffset = header.getXOffset();
		double yOffset = header.getYOffset();
		double zOffset = header.getZOffset();
		double maxX = header.getMaxX();
		double minX = header.getMinX();
		double maxY = header.getMaxY();
		double minY = header.getMinY();
		double maxZ = header.getMaxZ();
		double minZ = header.getMinZ();
		long startOfWaveformDataPacketRecord = header.getStartOfWaveformDataPacketRecord();
		long startOfFirstExtendedVariableLengthRecord = header.getStartOfFirstExtendedVariableLengthRecord();
		int numberOfExtendedVariableLengthRecords = header.getNumberOfExtendedVariableLengthRecords();
		long numberOfPointRecords = header.getNumberOfPointRecords();
		long[] numberOfPointsByReturn = header.getNumberOfPointsByReturn();
		
		System.out.println("fileSignature: " + fileSignature);
		System.out.println("fileSourceID: "+fileSourceID);
		System.out.println("globalEncoding: "+globalEncoding);
		System.out.println("projectID_GUIDData1: " + projectID_GUIDData1);
		System.out.println("projectID_GUIDData2: "+projectID_GUIDData2);
		System.out.println("projectID_GUIDData3: "+projectID_GUIDData3);
		System.out.println("projectID_GUIDData4: " + projectID_GUIDData4.length);
		System.out.println("versionMajor: "+versionMajor);
		System.out.println("versionMinor: "+versionMinor);
		System.out.println("systemIdentifier: " + systemIdentifier);
		System.out.println("numofpoints: "+numofpoints);
		System.out.println("generatingSW: "+generatingSW);
		
		System.out.println("fileCreationDayOfYear: "+fileCreationDayOfYear);
		System.out.println("fileCreationYear: "+fileCreationYear);
		System.out.println("headerSize: "+headerSize);
		System.out.println("offsetToPointData: "+offsetToPointData);
		System.out.println("numberOfVariableLengthRecords: "+numberOfVariableLengthRecords);
		System.out.println("pointDataRecordFormat: "+pointDataRecordFormat);
		System.out.println("pointDataRecordLength: "+pointDataRecordLength);
		System.out.println("legacyNumberOfPointsByReturn: "+legacyNumberOfPointsByReturn.length);
		System.out.println("xScaleFactor: "+xScaleFactor);
		System.out.println("yScaleFactor: "+yScaleFactor);
		System.out.println("zScaleFactor: "+zScaleFactor);
		System.out.println("xOffset: "+xOffset);
		System.out.println("yOffset: "+yOffset);
		
		System.out.println("zOffset: "+zOffset);
		System.out.println("maxX: "+maxX);
		System.out.println("minX: "+minX);
		System.out.println("maxY: "+maxY);
		System.out.println("minY: "+minY);
		System.out.println("maxZ: "+maxZ);
		System.out.println("minZ: "+minZ);
		System.out.println("startOfWaveformDataPacketRecord: "+startOfWaveformDataPacketRecord);
		System.out.println("startOfFirstExtendedVariableLengthRecord: "+startOfFirstExtendedVariableLengthRecord);
		System.out.println("numberOfExtendedVariableLengthRecords: "+numberOfExtendedVariableLengthRecords);
		System.out.println("numberOfPointRecords: "+numberOfPointRecords);
		System.out.println("numberOfPointsByReturn: "+numberOfPointsByReturn.length);
		
	}

	public static void main(String[] args) {
		File las = new File(BASE_PATH, LAS_NAME);
		LASHeaderTest lasHeaderTest = new LASHeaderTest();
		try {
			lasHeaderTest.read(las);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
