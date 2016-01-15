package com.eden.logistics.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

public class FtpUtil {
	private static Logger logger = Logger.getLogger(FtpUtil.class);
	// public final static String FTP_HTTP_BASE_URL =
	// "http://123.56.182.44:8080/ftp/";
	public final static String FTP_HTTP_BASE_URL = "http://192.168.1.104:8080/ftp/";
	public final static String FTP_URL = "127.0.0.1";
	public final static int FTP_PORT = 21;
	public final static String FTP_USER_NAME = "ftpuser";
	public final static String FTP_PASSWORD = "ftpuser";

	public static void upload(InputStream fileInputStream, String path, String fileName) throws Exception {
		/*FTPClient ftpClient = new FTPClient();
		try {

			ftpClient.connect(FTP_URL, FTP_PORT);
			boolean isLoginSuccess = ftpClient.login(FTP_USER_NAME, FTP_PASSWORD);
			if (!isLoginSuccess) {
				throw new Exception("ftp login failure.");
			}
			ftpClient.enterLocalPassiveMode();

			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			ftpClient.setControlEncoding("UTF-8");

			ftpClient.makeDirectory(path);

			boolean done = ftpClient.storeFile(path + "/" + fileName, fileInputStream);
			if (done) {
				logger.info("The file is uploaded successfully.");
			}

		} catch (Exception ex) {
			logger.error("Error: " + ex.getMessage(), ex);
		} finally {
			try {
				if (ftpClient.isConnected()) {
					ftpClient.logout();
					ftpClient.disconnect();
				}
				try {
					if (fileInputStream != null) {
						fileInputStream.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}*/
		
		try {
			FTPClient ftpClient = connectToFtp();

			ftpClient.makeDirectory(path);

			boolean done = ftpClient.storeFile(path + "/" + fileName, fileInputStream);
			if (done) {
				logger.info("The file is uploaded successfully.");
			}
		} catch (Exception e) {
			logger.error("上传ftp失败",e);
			throw new Exception("上传ftp失败",e);
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static FTPClient connectToFtp() throws Exception {
		try {
			logger.info("ftp 客户端未连接,尝试连接");
		
			FTPClient ftpClient = new FTPClient();
			ftpClient.connect(FTP_URL, FTP_PORT);
			boolean isLoginSuccess = ftpClient.login(FTP_USER_NAME, FTP_PASSWORD);
			if( !isLoginSuccess ){
	        	throw new Exception("ftp 登录失败.");
	        }
	
			ftpClient.enterLocalPassiveMode();
			 
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			ftpClient.setControlEncoding("UTF-8");
			
			return ftpClient;
		} catch (Exception e) {
			logger.error("链接ftp失败",e);
			throw new Exception("连接ftp失败",e);
		}		
	}

	public static void appendFile(String filePath, InputStream is) throws Exception {
		/*FTPClient ftpClient = new FTPClient();
		try {

			ftpClient.connect(FTP_URL, FTP_PORT);
			boolean isLoginSuccess = ftpClient.login(FTP_USER_NAME, FTP_PASSWORD);
			if (!isLoginSuccess) {
				throw new Exception("ftp login failure.");
			}
			ftpClient.enterLocalPassiveMode();

			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			ftpClient.setControlEncoding("UTF-8");

			boolean done = ftpClient.appendFile(filePath, is);
			if (done) {
				logger.info("The file is uploaded successfully.");
			}
		} catch (Exception ex) {
			logger.error("Error: " + ex.getMessage(), ex);
		} finally {
			try {
				if (ftpClient.isConnected()) {
					ftpClient.logout();
					ftpClient.disconnect();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

			try {
				if (is != null) {
					is.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		
		try {
			FTPClient ftpClient = connectToFtp();

			boolean done = ftpClient.appendFile(filePath, is);
			if (done) {
				logger.info("追加文件成功.");
			}
		} catch (Exception e) {
			
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static String getAbsPath(String relativePath) {
		return FTP_HTTP_BASE_URL + relativePath;
	}

	public static String generatePath() {
		Date now = new Date();
		return DateUtil.getYear(now) + "/" + DateUtil.getMonth(now);
	}

	public static String generateFileName() {
		return UUIDUtil.getUUID();
	}

	public static String readFileContent(String filePath) throws Exception {
		InputStream in = null;
        
		try {
			FTPClient ftpClient = connectToFtp();

            in = ftpClient.retrieveFileStream(filePath); 

            if (in != null) {  
            	StringBuffer resultBuffer = new StringBuffer();  
                BufferedReader br = new BufferedReader(new InputStreamReader(in));  
                String data = null;  
                try {  
                    while ((data = br.readLine()) != null) {  
                        resultBuffer.append(data + "\n");  
                    }  
                } catch (IOException e) {  
                    logger.error("文件读取错误",e);  
                    throw new Exception("文件读取错误");
                }
                return resultBuffer.toString();  
            }else{  
            	logger.error("in为空，不可读�?");  
                throw new Exception("in为空，不可读�?");
            }  
		} catch (Exception e) {
			logger.error("从Ftp读取文件失败. " + filePath,e);
			throw new Exception("从Ftp读取文件失败. " + filePath , e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
