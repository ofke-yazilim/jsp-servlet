# JSP & SERVLET Döküman ve Örnekler
Bu Projede Jsp ve Servlet konularından bahsedeceğim.
<pre>
<code>
<a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet#1">1.Servlet Nedir </a>
<a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet#2">2.Servlet ve Servlet Container Genel Tanım ve Görevleri </a>
<a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet#3">3.Netbeans Derleyicisi İle Web Projesi Oluşturma </a>
<a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet#4">4.Netbeans İlk Servlet Uygulaması </a>
<a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet#5">5.Web.xml Ayrıntılı İnceleme </a>
<a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet#6">6.ServletConfig </a>
<a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet#7">7.ServletContext </a>
<a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet#8">8.Türkçe Karakter Sorunu </a>
</code>
</pre>

<html>
<h1 id='1'>Servlet Nedir</h1>
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
    <h1 id='2'>2 - (Servlet - Jsp)  Servlet ve Servlet Container Genel Tanım ve Görevleri.</h1>
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
    <h1 id='3'>3 - (Servlet - Jsp)  Netbeans Derleyicisi İle Web Projesi Oluşturma</h1>
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
    <h1 id='4'>4 - (Servlet - Jsp)  Netbeans İlk Servlet Uygulaması</h1>
</div>
<p>
    <h2>A) Netbeans Servlet Oluşturma</h2>
    <ul>
        <li style="padding: 10px;">
            Oluşturmuş olduğumuz projemizin içerisinde bulunan "Source Packages" üzerine sağ click yaparak "New->Folder" sekmesini takip ederek "ornek" adında bir paket(klasör) oluşturalım.
        </li>
        <li style="padding: 10px;" rel="">
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
    <li>doGet => Get ile gönderilen dataların işlemesini sağlar. Get verileri link üzerinden gönderilmektedir.</li>
    <li>doPost => Form üzernden gönderilen dataların işlenmesini sağlar. Form aracılığı ile gönderilen veriler POST adı ile geçer.</li>
    <li>init => Servlet çağrıldığında ilk çağrılan methodumuzdur.</li>
    <li>destroy => service() methodu çalıştıktan sonra çalışır. Yani doGet,doPost vb. methodlar çalışmasını bitirdikten sonra destroy methodu devreye girer.</li>
    <li>
        Oluşturulan first adındaki servlet için oluşan örnek web.xml yapısı için : <a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/web/WEB-INF/web.xml">İncele</a>
    </li>
</p>
<div>
    <h1 id='5'>5 - (Servlet - Jsp)  Web.xml Ayrıntılı İnceleme</h1>
</div>
<p>
    <h2>A) web.xml Nedir ne işe yarar.</h2>
    <ul>
        <li style="padding: 10px;">
            Java web projelerinin konfigirasyonlarının yapıldığı dosyanın adıdır. WEB-INF klasörü altında bulunmaktadır. Bu dosya üzerinde url linkleri için rewrate yapısını belirleyebilir.
            Session süresini tanımlayabilir. Çeşitli kütüphanelere ait bilgileri tanımlayabiliriz. Örneğin ben database bağlantı bilglerimi bu dosya içerisinde tanımlayabilir.
        </li>
    </ul>
    <h2>B) Şimdi Dosyayı inceleyelim.</h2>
    <ul>
    <li> web.xml incelemesini <a target="_blank" href="http://okesmez.com/jsp-servlet/5_web.xml_incele.html">http://okesmez.com/jsp-servlet/5_web.xml_incele.html</a> adresinde mevcutur.</li>
    </ul>
</p>
<div>
    <h1 id="6">6 - (Servlet - Jsp)   ServletConfig</h1>
</div>
<p>
    <h2>A) Nedir Bu ServletConfig.</h2>
    <ul>
        <li style="padding: 10px;">
           Daha önce tanımlamasını yapmış olduğumuz web.xml konfigirasyon dosyasını okumamızı sağlayan interfacedir. ServletConfig sadece ilgili servlet için 
           tanımlanmış olan konfigirasyonlara ulaşmaızı sağlar.
        </li>
    </ul>
    <h2>B) ServletConfig Methodlarına Bakalım.</h2>
    <pre>
    <code>
public String getServletName(); ==> <strong>Çalışmakta olan servlet adını alır.</strong> <br> 
public String getInitParameter(String name); ==> <strong>Adı gönderilen parametrenin değerini döndürür.</strong>  <br>
public Enumeration<String> getInitParameterNames(); ==> <strong>Parametre adını almamızı sağlar</strong>  <br>
    </code>
    </pre>
    <h2>B) Örnek Kullanım.</h2>
    Fonksiyon örnekleri için  : <a target="_blank" href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/src/java/ornek/two.java">
        https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/src/java/ornek/two.java</a><br>
    Anlatım için : <a target="_blank" href="http://okesmez.com/jsp-servlet/6_servlet_config.html">
        http://okesmez.com/jsp-servlet/6_servlet_config.html</a>
    <h3>Aşağıda oluşturulan bir servlet içerisinde servletconfig arabirimine ait fonksiyon kullanımları verilmiştir.</h3>
    <pre><code>
    <div style="width: 100%;float: left;margin-bottom: 15px;">
<strong>mime type hazırlanıyor</strong><br>
response.setContentType("text/html;charset=UTF-8");<br>

<br><strong>Response yazma nesnemiz hazırlanıyor </strong> <br>
PrintWriter pw = response.getWriter();  <br>

<br><strong>ServletConfig interface bağlanıyor </strong> <br>
ServletConfig config = getServletConfig();  <br>

<br><strong>web.xml içerisine tanımlanmış user değeri alınıyor</strong>  <br>
String user = config.getInitParameter("user");  <br>

<br><strong>web.xml içerisine tanımlanmış olan password değeri alınıyor</strong>  <br>
String password = config.getInitParameter("password");  <br>

<br><strong>şuan çalışan servlet ismnini alıyoruz. </strong> <br>
String servletName = config.getServletName();  <br>

<br><strong>Almış olduğumuz değerleri sayfa üzerine basıyoruz.</strong>  <br>
pw.print("<html><body>");  <br>
pw.print(servletName);  <br>
pw.print(user);  <br>
pw.print(password);  <br>
pw.print("</body></html>");  <br>

<br><strong>yukarıda parametrelerin değerlerini aldık  </strong>
<br><strong>Aşağıdaki  web.xml içerisine bu servlet için tanımlanmış değerleri alıyoruz. </strong> <br>
Enumeration<String> enm = config.getInitParameterNames();  <br>
while (enm.hasMoreElements()) {  <br>
&nbsp;&nbsp;System.out.println(enm.nextElement());  <br>
}  <br>
    </div>
    </code></pre>
</p>
    <div>
    <h1 id='7'>7 - (Servlet - Jsp)   ServletConfig</h1>
</div>
<p>
    <h2>A) ServletContext Nedir </h2>
    <ul>
        <li style="padding: 10px;">
           web.xml içerisindeki parametrelere sadece ilgili servlet içerisinde ulaşmamızı sağlayan interface <strong>ServletConfig</strong>ti. Eğer biz web.xml içerisindeki parametrelere
           tanımlamış olduğumuz tüm servlet ve jsp sayfalarından ulaşmak istiyorsa iş ozaman kullanmamız gereken arabirim <strong>ServletContext</strong> oluyor.
        </li>
    </ul>
    <h2>B) ServletContext Parametreleri web.xml içerisine nasıl tanımlanır</h2>
    Aşağıda ServletContext ile ulaşabileceğimiz parametrelerin web.xml içerisinde örnek bir kullanımını oluşturdum.
    email ve nick adında olan bu parametreler belirtilen değerleri taşırlar.
    <div style="width: 100%;float: left;margin-bottom: 15px;">
<pre>
<code style="background-color: #ddd;padding: 10px;float: left;padding-top: 0px;">
    &lt;context-param>
        &lt;param-name>email&lt;/param-name>
        &lt;param-value>info@ofkeyazilim.com&lt;/param-value>
    &lt;/context-param>
    &lt;context-param>
        &lt;param-name>nick&lt;/param-name>
        &lt;param-value>ofke&lt;/param-value>
    &lt;/context-param>
</code>
</pre>
    </div>
    <h2>C) Hadi ServletContext Fonksiyonları Tanıyalım</h2>
    <div style="width: 100%;float: left;margin-bottom: 15px;">
<pre>
<code style="background-color: #ddd;padding: 10px;float: left;padding-top: 0px;"> 
public String getInitParameter(String name); ==> <strong>Adı verilen parametre değerini döndürür.</strong>
public Enumeration<String> getInitParameterNames(); ==> <strong>Tanımlı parametreleri içerir.</strong>
public void setAttribute(String name, Object object); ==> <strong>Bir obje tanımlıyoruz ve objeye değer atıyoruz. Tanımladığımız bu obje tüm uygulamada geçerli olacaktır. (Aplication Scope)</strong>
public Object getAttribute(String name); ==> <strong>Tanımladığımız objeye ait değeri alıyoruz.</strong>
public void removeAttribute(String name); ==> <strong>Tanımladığımız objeyi siliyoruz.</strong>
public Enumeration<String> getAttributeNames(); ==> <strong>Tanımladığımız objelerin adlarını içerir.</strong>
public int getMajorVersion();  ==> <strong>Java Servlet Api Versiyon bilgisi alınıyor</strong>
public String getServerInfo();   ==> <strong>Kullandığımız server bilgisini verir</strong>
public String getRealPath(String path); ==> <strong>Vermiş olduğumuz dosyanın gerçek dosya yolunu gösterir.</strong>
public String getServletContextName();  ==> <strong>Context name ismini verir.</strong>
public String getContextPath(); ==> <strong>Bulunduğumuz dizini döndürür.</strong>
public InputStream getResourceAsStream(String path); ==> <strong>Dizini verilen dosyanın içeriğini almamızı sağlar.</strong>
Yukarıda tanımlanan Fonksiyon kullanım Örnekleri  : <a href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/src/java/ornek/three.java">https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/src/java/ornek/three.java</a>
public RequestDispatcher getRequestDispatcher(String path); ==> <strong>Servlet içerisinden jsp sayfasına ulaşmamızı sağlar forward ile kullanılırsa tanımlı objeleride taşır.</strong>
<strong>getResourceAsStream</strong> ve getResource örneği  : <a href="https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/src/java/ornek/three.java">https://github.com/ofke-yazilim/jsp-servlet/blob/master/jsp-servlet/src/java/ornek/three.java</a>
</code>
</pre>
    </div>
</p>
<div>
    <h1 id='8'>8 - (Servlet - Jsp)   Türkçe Karakter Sorunu </h1>
</div>
Oluşturmuş olduğumuz servlet içerisine aşağıdaki karakter seti tanımlamasını yaparsak Türkçe karakter hatası almayız.
<p>
<pre>
<code>
response.setCharacterEncoding("ISO-8859-9");
</code>
</pre>
</p>
</body>
</html>
