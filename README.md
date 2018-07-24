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
</body>
</html>
