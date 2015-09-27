package de.androvdr;


public interface IFileLogger {
	String getLogFileName();
	void setLogFileName(String logFileName);
	int getLogLevel();
	void setLogLevel(int loglevel);
	void initLogFile(String logFileName, boolean append);
}
