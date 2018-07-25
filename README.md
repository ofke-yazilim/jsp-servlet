# jsp-servlet
Bu Projede Jsp ve Servlet konularından bahsedeceğim.

<html>
<h1>Servlet Nedir</h1>
<p>Servlet bir java sınıfıdır. Servlet konusunu anlayabilmek için <strong>Sunucu(Server)</strong> konusunda bilgi sahibi olmak gereklidir.</p>

<h2>A) Sunucu(Server) Nedir</h2>
<p>Sunucu basit şekilde içerisinde uygulama,veri, database vb. yapıları barındırabilen donanımdır. Sunucular bir ağa bağlı olarak çalışırlar.</p>

<h2>B) İstemci(Client) Nedir</h2>
<p> 
    Sunucu(Server) üzerinden veri talep eden uygulamalara verilen genel bir isimdir. 
    Örneğin : Bir sunucu üzerinde barınan bir web sitesinden <strong>Chorome</strong> browser ile yapmış olduğum istek durumunda 
    chrome client görevi görmüş oluyor.
</p>

<h2>C) Sunucu & Client Çalışma Mantığı</h2>
<p>
    Kendi local bilgisayarımızı üzerinde Apache çalışan bir Server olarak düşünelim. Sunucumuz üzerinde ayrıca bir web sitesi barındırdığımızı varsayalım. 
    Web Browserımızı açarak http://127.0.0.1/ adresini çalıştırdığımızda, local sunucumuza bir istek göndermiş olacağız işte bu isteğe <strong>Request</strong> denir.
    Sunucu(Server) üzerine göndermiş olduğumuz istek(Request) sunucudan bir <strong>kaynak(Resource)</strong> isteğinde bulunur. Sunucu istemciden gelen isteği <strong>karşılar(handle request)</strong> ve istemciye 
    <strong>cevap(Response)</strong> döner.
</p>
<h2>D) Servlet Çalışma Mantığı</h2>
<p>
    Servlet sınıfları server üzerinde çalışmaktadır. Sunucu istemciden gelen istekleri Servlet sınıfları ile işler ve istemciye cevap döner.
</p>
<div>
    <h1>2 - (Servlet - Jsp)  Servlet ve Servlet Container Genel Tanım ve Görevleri.</h1>
</div>
<p>
    Bir önceki konuda Sunucu - İstemci çalışma mantığından bahsetmiştim. Bu mantık doğrultusunda
    Sunucu üzerine client tarafından gönderilen istekler eğer dinamik düzenlenmesi gereken içerikler ise, sunucu tarafından 
    gönderilecek cevaplar <strong>Servlet Container</strong> tarafından yönetilen <strong>Servlet</strong>lar tarafından düzenlenip işlenerek hazırlanmaktadır.
    Yani sunucumuzu bir lokanta olarak düşünürsek :  Müşterilerimiz <strong>istemci(client)</strong> , verien siparişler <strong>Request</strong> , siparişi alan garsonlar <strong>Handle Request</strong>, 
    Lokanta müdürü <strong>Servlet Container</strong> , aşçılarımız <strong>Servlet</strong> olurken hazırlanmış olan yemekler 
    <strong>cevap(response)</strong> olur. 
</p>
<div>
    <h1>3 - (Servlet - Jsp)  Netbeans Derleyicisi İle Web Projesi Oluşturma</h1>
</div>
<p>
    <ul>
        <li style="padding: 10px;">Öncelikle <a href="https://netbeans.org/">https://netbeans.org/</a> adresine gidilerek En son Netbeans Sürümü İndirilir Bilgisayar Üzerine Yüklenir.</li>
        <li style="padding: 10px;">Yükleme tamamlandıktan sonra Netbeans açılır. Üst menülerden File Sekmesi takip edilerek New Project tıklanır </li>
        <li style="padding: 10px;">Açılan Pencerede Categories kısmından Java Web ve Projects kısmından Web Aplication seçilir ve next tıklanır  </li>
        <li style="padding: 10px;">Açılan Pencerede Proje ismimizi ve local bilgisayarımızda dosyaların saklanacağı alanı belirliyoruz ve next diyoruz.  </li>
        <li style="padding: 10px;">Açılan Pencerede Java EE versiyonunu ve server uygulamamızı belirliyor ve Finish diyoruz.  </li>
        <li style="padding: 10px;">Uygulamamız Ekranın Sol kısmında oluşmuş olacak. </li>
        <li style="padding: 10px;">Son olarak Java Web Uygulamalarımızda konfigirasyon işlemleri için kullanmakta olduğumuz web.xml dosyamızı oluşturuyoruz. 
            Dosyayı oluşturmak için sol kısımda oluşan projemizin ismine sağ tıklıyoruz. New->Other sekmesini takip ediyoruz. 
            Açılan Pencerenin Categories Kısmından Web seçilirken Projects kısmından web.xml seçiyoruz. 
            Next dediğimiz anda bize bir pencere açılacak ve web.xml dosyasını oluşturacağımız dosya yolunu gösterecek Finish diyoruz ve web.xml oluşturulmuş oluyor.
        </li>
        </ul>
</p>
<div>
    <h1>4 - (Servlet - Jsp)  Netbeans İlk Servlet Uygulaması</h1>
</div>
<p>
    <h2>A) Netbeans Servlet Oluşturma</h2>
    <ul>
        <li style="padding: 10px;">
            Oluşturmuş olduğumuz projemizin içerisinde bulunan "Source Packages" üzerine sağ click yaparak "New->Folder" sekmesini takip ederek "ornek" adında bir paket(klasör) oluşturalım.
        </li>
        <li style="padding: 10px;">
            Oluşturulan "ornek" adlı paket üzerine sağ tıklayarak "New->Other" sekmesini takip edelim açılan pencerede Categories alanında "web" , File Types alanından ise "servlet" kısımlarını seçerek next diyelim. 
            <a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/web/images/i7.png">Görsel Gör</a>
        </li>
        <li style="padding: 10px;">
            Açılan pencerede oluşturmak istediğimiz "Servlet" için bir isim belirleyelim (Ben first dedim) ardından next diyelim. 
             <a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/web/images/i8.png">Görsel Gör</a>
        </li>
        <li style="padding: 10px;">
            Açılan pencerede oluşturmak istediğimiz "Servlet" için bir isim belirleyelim (Ben first dedim) ardından next diyelim. 
             <a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/web/images/i9.png">Görsel Gör</a>
        </li>
        <li style="padding: 10px;">
            Gelen ekranda "Add information to deployment descriptor .." parametresini aktif edelim bu parametre oluşturmuş olduğumuz servlet ile alakalı bilgilerin web.xml dosyamıza otomotik oluşmasını sağlar.
            Ayrıca ekranda "URL Pattern" alanı url rewrate bilgisini temsil eder. Servletin çalışmasını sağlayacak url adresini tremsil eder.Tüm ayarlamalar yapıldıktan sonra Finish tıklanır 
            first adında servletimiz artık oluştu.  Örneğin benim jsp-servlet adında web projem için 
            first servleti http://localhost:8080/jsp-servlet/first adresine çalışmaktadır. 
            <a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/web/images/i10.png">Görsel Gör</a>
        </li>
        <li>
            Oluşturulan first adındaki servleti incelemek için : <a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/src/java/ornek/first.java">İncele</a>
        </li>
        <li>
            Oluşturulan first adındaki servlet için oluşan örnek web.xml yapısı için : <a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/web/WEB-INF/web.xml">İncele</a>
        </li>
    </ul>
    <h2>B) Oluşturduğumuz Servlet Fonksiyonlarını Tanıyalım.</h2>
    Servlet içersinde doGet,doPost..,init,destroy şeklinde önemli methodlarımız bulunmaktadır. Netbeans üzerinde servlet oluşturduğumuz zaman init ve destroy methodları otomotik oluşmaz bu 
    methodları el ile eklememiz gerekmektedir. 
    <li>doGet => Get ile gönderilen dataların işlemesini sağlar. Get verileri link üzerinden gönderilmektedir.<li>
    <li>doPost => Form üzernden gönderilen dataların işlenmesini sağlar. Form aracılığı ile gönderilen veriler POST adı ile geçer.<li>
    <li>init => Servlet çağrıldığında ilk çağrılan methodumuzdur.</li>
    <li>destroy => service() methodu çalıştıktan sonra çalışır. Yani doGet,doPost vb. methodlar çalışmasını bitirdikten sonra destroy methodu devreye girer.</li>
    <li>
        Oluşturulan first adındaki servlet için oluşan örnek web.xml yapısı için : <a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/web/WEB-INF/web.xml">İncele</a>
    </li>
</p>
</body>
</html>
