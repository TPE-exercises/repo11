package de.hsMannheim.informatik.tpe.ss17.uebung03.gruppe1;

import java.io.File;
import java.io.IOException;

public interface IFileEncryptor {
	
	public File encrypt(File sourceDirectory) throws IOException;
	
//	public File decrypt(File sourceDirectory)throws IOException;

}
