
package Video40;


public class MediaDownloader {
    
    public interface DownloadListener{
        void onmediaDownloaded (String contenido);
    }
    
    public static void download(String mediatitulo, DownloadListener downloadListener){
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Descargando "+mediatitulo);
                try {
                    Thread.sleep(5000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                System.out.println(mediatitulo + "DEscargado!");
                String contenido = "Un tipo le matan su perrito y va y se desquita con todos";
                downloadListener.onmediaDownloaded(contenido);
            }
        });
        thread.start();
    }
    
}
