
package Video41;


public class MediaDownloader {
    
    public interface DownloadListener{
        void onmediaDownloaded (Media media, String contenido);
    }
    
    public static void download(Media media, DownloadListener downloadListener){
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Descargando "+media.getTitulo());
                try {
                    Thread.sleep(5000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                System.out.println(media.getTitulo() + " Descargado!");
                String contenido = "Un tipo le matan su perrito y va y se desquita con todos";
                downloadListener.onmediaDownloaded(media, contenido);
            }
        });
        thread.start();
    }
    
}
