public interface iFileManager {
    public void createFolder(String dirname);
    public void deleteFolder(String dirname);
    public void createFile(String path,String filename);
    public void deleteFile(String path,String filename);
    public void readFile(String path,String filename);
    public void writeFile(String path,String filename,String data);
}
