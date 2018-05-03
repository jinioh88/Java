import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// InputStream과 OutputStream으로 파일 복사를 해보자
public class CopyUtil {
	public static int copy(String srcPath, String destPath) throws FileNotFoundException {
		int count = 0;
		
		File srcFile = new File(srcPath);
		File destFile = new File(destPath);
		
		if(!srcFile.exists())
			throw new FileNotFoundException("path : "+srcFile.getAbsolutePath());
		
		if(srcFile.isFile()) {
			copyFile(srcFile,destFile);
			count++;
		} else if(srcFile.isDirectory()) {
			copyDirectory(srcFile,destFile);
		}
		return count;
	}
	
	private static void copyFile(File source, File dest) {
		long beginTime = System.currentTimeMillis();
		
		int count = 0;
		long totalSize = 0;
		byte[] b = new byte[128]; // 버퍼 크기
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			
			while((count=in.read(b))!=-1) {
				out.write(b, 0, count);
				totalSize += count;
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)
					in.close();
				if(out!=null)
					out.close();
			} catch(IOException ig) {
				
			}
			StringBuffer sb = new StringBuffer("CopyTime : ");
			sb.append(System.currentTimeMillis() - beginTime);
			sb.append("ms, FileSize : ");
			sb.append(totalSize);
			sb.append("byte");
			
		}
	}
	
	private static void copyDirectory(File source, File dest) {
		long beginTime = System.currentTimeMillis();
		
		if(!source.exists() || !source.isDirectory()) {
			throw new IllegalArgumentException("Source file is not directory : "+source.getAbsolutePath());
		}
		dest.mkdir();
		
		File[] fileList = source.listFiles();
		for(int i=0;i<fileList.length;i++) {
			File sourceFile = fileList[i];
			// 원본 파일과 같아야 해서
			File destFile = new File(dest, sourceFile.getName());
			copyFile(sourceFile,destFile);
		}
	}
}
