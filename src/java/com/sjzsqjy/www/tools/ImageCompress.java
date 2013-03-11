package com.sjzsqjy.www.tools;

/** 
 * ImageCompress 

 * Please refer to: <BR> 
 * http://blog.csdn.net/feng_sundy/archive/2008/08/05/2769572.aspx 
 * <P> 
 * @author feng_sunddy <sundysea@hotmail.com> 
 * @version 1.0 
 * @see java.awt.image.BufferedImage 
 **/

import java.awt.Frame;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;


public class ImageCompress  {
	protected ImageWriter imgWrier;
	protected ImageWriteParam imgWriteParams;
	
	private int width=125;
	private int height=125;
	private float quality=0.8f;
	private static ImageCompress compress;
	
	
	private  ImageCompress() {
		
	}
	
	public static ImageCompress getImageCompress(){
		if(null==compress){
			compress=new ImageCompress();
		}
		return compress;
	}
	
	public  void compress(File src,File des) {
		try {
			
			if(!des.exists()){
				des.createNewFile();
			}
			if(des.exists()){
				des.delete();
			}				
			Image image = javax.imageio.ImageIO.read(src); 
			this.width=image.getWidth(null);
			this.height=image.getHeight(null);
		    BufferedImage tag=new BufferedImage(this.width,this.height ,BufferedImage.TYPE_INT_RGB);
			tag.getGraphics().drawImage(image, 0, 0, this.width, this.width, null); // 
			Iterator it = ImageIO.getImageWritersBySuffix("jpg");
			if (it.hasNext()) {
				FileImageOutputStream fileImageOutputStream = new FileImageOutputStream(
						des);
				ImageWriter iw = (ImageWriter) it.next();
				ImageWriteParam iwp = iw.getDefaultWriteParam();
				iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
				iwp.setCompressionQuality(quality);
				iw.setOutput(fileImageOutputStream);
				iw.write(null, new IIOImage(tag, null, null), iwp);
				iw.dispose();
				fileImageOutputStream.flush();
				fileImageOutputStream.close();
			}		
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			
		}
		
	}
	public  void compress(InputStream src,File des) {
		try {
			
			if(!des.exists()){
				des.createNewFile();
			}
			if(des.exists()){
				des.delete();
			}				
			Image image = javax.imageio.ImageIO.read(src); 
			this.width=image.getWidth(null);
			this.height=image.getHeight(null);
		    BufferedImage tag=new BufferedImage(this.width,this.height ,BufferedImage.TYPE_INT_RGB);
			tag.getGraphics().drawImage(image, 0, 0, this.width, this.width, null); // 
			Iterator it = ImageIO.getImageWritersBySuffix("jpg");
			if (it.hasNext()) {
				FileImageOutputStream fileImageOutputStream = new FileImageOutputStream(
						des);
				ImageWriter iw = (ImageWriter) it.next();
				ImageWriteParam iwp = iw.getDefaultWriteParam();
				iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
				iwp.setCompressionQuality(quality);
				iw.setOutput(fileImageOutputStream);
				iw.write(null, new IIOImage(tag, null, null), iwp);
				iw.dispose();
				fileImageOutputStream.flush();
				fileImageOutputStream.close();
			}		
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			
		}
		
	}
//	public static void main(String args[]){
//		ImageCompress press =new ImageCompress();
//		press.compress("e:/0.jpg", "e:/4.jpg");
//		System.out.println("OKOKO");
//	}
//	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public float getQuality() {
		return quality;
	}
	public void setQuality(float quality) {
		this.quality = quality;
	}

}
