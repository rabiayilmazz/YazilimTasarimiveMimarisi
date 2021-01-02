# YAZILIM TASARIMI VE MİMARİSİ

<hr></hr>

## SOLID PRENSİPLER

<hr></hr>

### Single Responsibility Prensibi (***S***)

* Single Responsibility ***(Tek Sorumluluk)*** prensibi geliştirilen sınıfların tek bir görevi olması gerektiğini önermektedir.
  * Yani geliştirilen bir sınıfın tek bir amacı olmalı ve o amaç doğrultusunda özellik ve fonksiyonlar barındırmalıdır.
* Geliştirilen bir sınıfta farklı amaç ve görevler var ise bu prensibe aykırı bir geliştirme süreci olduğu ortaya çıkmaktadır.
  * Bunu engellemek için geliştirilen sınıf uygun şekilde görevlere uygun şekilde parçalanmalıdır.
* Bir sınıfın birden fazla sorumluluk alması sınıflar arası bağlılığı artırmaktadır.
* Sınıflar arası bağlılık arttıkça kod karmaşıklığı artmaktadır.
* Uygulama geliştirme sürecinde gereksinimler değiştiği zaman bu gereksinimi karşılayacak kod bloğunda değişiklik yapmak yeterli olmalıdır. Ancak sınıflar arası bağlılık fazla olursa gereksinimi karşılamak yeterli olmayacaktır. Ek olarak bu değişimden etkilenen kod bloklarını da değiştirmek gerekecektir. ***Ancak eğer uygulama tek sorumluluk ilkesine uygun olarak tasarlanırsa gereksinim değişiklikleri diğer bölümleri etkilemeyecektir.***
* Tek sorumluluk ilkesi test, bağlılık ve anlışabilirlik özelliklerinde kolaylıklar sağlar.
* Tek sorumluluğu olan bir sınıfın test durumları ve sınıflar arası bağlılığı daha az olacaktır.
* Sınıfların tek bir görevi olduğu için daha yalın bir yapıda olacak ve bu kodun anlaşılabilirliğini artıracaktır.
* ***Özet olarak sorumluluğun azaltılması değişime daha kolay adapte olması anlamına gelmektedir.***
<hr></hr>

### Open-Closed Prensibi (***O***)

* Open-Closed ***(Açık-Kapalı)*** prensibi geliştirilen sınıfların __gelişime açık değişime kapalı olması__ gerektiğini önermektedir.
* ***Açık*** özelliği sınıfların yeni özellik ve davranışları kolay bir şekilde kazanabilmesini sağlar. Gereksinimler değiştiğinde bu ihtiyacı karşılayacak yeni bloklar eklenebilmelidir.
* ***Kapalı*** özelliği ise mevcut sınıf için yazılan özellik ve davranışların değişmemesi gerektiğini söylemektedir.
* Açık kapalı prensibi yazılan kodun tekrar kullanılabilirliğini ve sürdürebilir bir proje geliştirmenin temelini oluşturmaktadır.
* Geliştirilen yazılım üzerinde değişim yapmak ortaya yazılım hataları ve maliyet çıkarmaktadır. Bazı durumlarda uygulama geliştirme sürecinden uzun bir süre sonra yeni gereksinimler ortaya çıkabilir. Bu durumda değişim yapmak oldukça zor bir süreçtir. Bunun önüne geçebilmek için uygulama açık-kapalı prensibi düşünülerek geliştirilmelidir. Uygulamada geliştirilen sınıfların gerçek dünyadaki karşılıklarına göre ortaya çıkabilecek yeni özellik ve davranışlara göre tasarlanmalıdır. ***Bu şekilde geliştirilen uygulamada değişim olmaz iken gelişim mümkün olmaktadır.***

<hr></hr>

### Liskov Substitution Prensibi (***L***)

* Liskov Substitution ***(Yerine Geçme)*** prensibi alt sınıfların üst sınıfın özelliklerini ve fonksiyonlarını aynı işlevi gösterecek şekilde kullanabilmesidir.
* Üst sınıf referansına ihtiyaç duyan bir fonksiyona gönderilen alt sınıfın fonksiyonun gereklerini yerine getirebilmesi gerekmektedir. Ayrıca üst sınıfta tanımlı olan özellik ve fonksiyonlar alt sınıf için gereksiz olmamalıdır.
* Yerine geçme prensibinin sağlanmaması durumunda genellikle üst sınıfta ortak olmayan özellik ve fonksiyonlar yeni bir sınıfa aktarılır. ***Bu şekilde alt sınıf ihtiyacı olan sınıflardan özellik ve fonksiyonları miras alabilmektedir.***

<hr></hr>

### Interface Segregation Prensibi (***I***)

* Inteface Segregation ***(Arayüz Ayrımı)**** prensibi sorumlulukların hepsini bir arayüze toplamak yerine sorumluluklara özgü birçok arayüz oluşturmayı önermektedir.
* Bu prensip büyük olan arayüzleri daha küçük ve daha özel arayüzlere böler, böylece alt sınıflar sadece ilgili arayüzü uygularlar. Böylelikle kod karmaşıklığı ve bağımlılığı da azaltılmış olur.

<hr></hr>

### Dependency Inversion Prensibi (***D***)

* Dependency Inversion ***(Bağımlılığı Ters Çevirme)*** prensibi sınıflar arası bağımlılığın olabildiğince az olmasını ve üst seviye sınıfların alt seviye sınıflara bağımlı olmaması gerektiğini önermektedir.
* Yüksek seviyeli bir sınıfta gereksinimden doğan değişimler alt seviye sınıfları bunu uymaya zorlamaktadır. Ancak alt seviyeli bir sınıftaki değişimler yüksek seviyeli bir sınıfı hiçbir şekilde etkilememesi gerekmektedir.
* Sınıflar arası bağımlılığın azaltılması için uygulamanın prensiplere uygun olarak tasarlanmasını gerektirir. Eğer bağımlılık olacak ise bu bağımlılık alt seviye sınıfların üst seviye sınıflara bağımlılığı şeklinde olmalıdır.

<hr></hr>

## TASARIM DESENLERİ

<hr></hr>

1. ***Yaratıcı Tasarım Desenleri***

**Bu sınıfta yer alan tasarım desenleri, nesnelerin uygun ve verimli bir şekilde yaratılma yollarıyla ilgilenirler. Nesne yaratma sorumluluklarını, farklı sınıf düzenlerinde soyutlayarak yaparlar. Başlıca yaratıcı tasarım desenleri: Tek Nesne, Fabrika Yordam, Soyut Fabrika, Kopya Nesne, Kurulum Nesnesi.**

  * Tek Nesne ( Singleton )

    * Bu tasarım deseninde, bir sınıfın içinde yalnızca bir tane nesnesi oluşturulabilir.
    * Tekrar oluşturulmasına izin verilmemeli.
    * Tek bir arayüz sunularak, bu nesneye yalnızca buradan erişim sağlanılmalı.
    * Direk nesne oluşturmaya erişim izni olmamalıdır.
    * Bu desen kullanıldığında, proje de değerinin değişmesi gerekmeyen durumlarda kullanılabilir. Mesela veritabanı.
    * Sistemde tek nesne oluşturabilme, statik değişkenler ve fonksiyonlar sayesinde olur.


  * Fabrika Yordam ( Factory Method )

    * Fabrika yordam tasarım deseni, nesne yaratma sorumluluğunun bir metoda verilmesidir.
    * oluşturulan nesne, belli bir sınıf kademelerindeki alt sınıflardan herhangi biridir.
    * Hangi alt sınıfın oluşturulacağı fabrika metodu içinde karar verilir.
    * Bu metod ile belirli bir sınıf hiyerarşisindeki alt nesnelerden birinin oluşturulma sorumluluğu belirli bir arayüz sınıfına verilerek sistemden tamamen soyutlanmış olur.
    * Böylece nesneleri oluşturulma kodlarında, gereksiz kod tekrarlarından kaçınılmış olur.
    * Sistem içinde sınıfların oluşturulacağı yer tek olduğu için, ilgili fonksiyonlar tek bir yerde toplanabilir.

  * Soyut Fabrika ( Abstract Factory )

    * Yaratılma sorumluluklarının çeşitli sınıf hiyerarşileri ile sağlandığı bir tasarım desenidir.
    * İstemci sınıf, çeşitli kategorideki sınıflara ihtiyaç duyar.
    * Bu sınıflar, sistemde alt/üst sınıf hiyerarşileri şeklinde bulunurlar.
    * "Soyut Fabrika" tasarım deseni bu karmaşık ve farklı hiyerarşideki sınıfların yaratılma sorumluluğunu çeşitli fabrika sınıflarına verir.
    * İstemci ilk önce verdiği kriterlere göre uygun bir fabrika sınıfını seçer.
    * Ardından seçtiği fabrika nesnesi, istemcinin ihtiyaç duyduğu sınıfları yaratıp istemciye döner.
    * İstemci sınıf, kullandığı sınıfların sadece üst sınıflarını, yani soyut sınıflarını bilir.
    * Bu sınıfları ona yaratıp döndüren fabrika sınıfının da sadece soyut sınıfını içerir.
    * Alttaki detaylar istemci sınıftan gizlenmiş, sorumluluk "Soyut Fabrika" tasarım deseni ile fabrika sınıflarına verilmiştir.
    * Bu tasarım deseni Fabrika Yordam tasarım desenine benzer.
    * Fakat bu tasarım deseninde yaratılacak birden fazla sınıf hiyerarşisi tipi bulunur.
    * Fakat "fabrika yordam" tasarım deseninde tek tip nesne yaratılması ihtiyacı bulunur.
    * Kısaca bu tasarım deseni ile birden fazla sınıf hiyerarşisi nesneleri, kurulacak birden fazla fabrika nesneleri ile yaratılır.
    * İstemci kendisine uygun fabrika nesnesini yarattırır. İhtiyacı olan nesnelerin yaratılma sorumluluğunu fabrika nesnelerine bırakır.

  * Kopya Nesne ( Prototype )

    * Var olan bir nesneden, kopyalama yöntemi ile yeni nesne yaratmak için bu tasarım deseni kullanılır.
    * Nesne yaratmak için "new" operatörü kullanılmaz.
    * Yazılım dillerindeki "clone" gibi, nesne kopyalama yordamlarından faydalanılır.
    * Örneğin java programlama dilinde, bir nesnenin kopyalanabilmesi için, nesnenin "Cloneable" arayüzünden türemiş olması gereklidir.
    * Bazı nesneler çok büyük olup, çok kaynak harcıyor olabilir.
    * Bu nesnelerin yeniden yaratılması yerine, kolonlanması performans ve kaynak kullanımı açısından tasarruf edilmesine yarar.
    * Bu durumlarda "Kopya Nesne" tasarım deseni kullanılabilir.

  * Kurucu ( Builder )

     * Bu tasarım deseni ile bir nesneyi, bir sınıfı, aşama aşama farklı özellikleri ile oluşturabiliriz.
     * Nesneyi farklı özellikler ile oluşturmaya yarayan bu sınıfa Kurucu nesne ismi verilir.
     * Kurucu nesneden farklı özelliklerde alt sınıflar da türeyebilir.
     * Kurucunun oluşturduğu nesneye ihtiyaç duyan istemci sınıf, istediği özelliklerde nesneyi oluşturabilecek kurucu oluşturur ve kurucuya istediği nesnenin oluşması için isteklerde bulunur.
     * En sonunda da bu nesneyi alır ve kullanır.
     * İstemci böylece nesne yaratma sorumluluğunu kurucu nesneye bırakmış olur.
     * Tabi her basit nesnenin, bir de kurucusunu oluşturmaya gerek yoktur.
     * Kurucu nesne genelde, içinde çok özellik barındıran, karmaşık nesnelerin oluşumunda görev alması daha yerindedir.

<hr></hr>

2. ***Yapısal Tasarım Desenleri***

**Bu sınıfta yer alan tasarım desenleri, sınıflar arasındaki ilişkileri belirleyerek, tasarımı kolaylaştırırlar. Sınıflar arası ilişkiler nasıl olmalı? Türetme, soyutlama, nesnesini içerme? Hangi yol ile sınıflar birbirlerine bağlı olmalı. Bu soruların yanıtlarını açıklarlar. Başlıca yapısal tasarım desenleri: Adaptör, Ağaç Yapısı, Dekorasyon, Hafif Ağırlık, Köprü, Ön Yüz, Özdeş Nesne.**

  * Adaptör ( Adapter )

    * Mevcut bir sınıfı veya arayüz sınıfını, eldeki farklı bir arayüz sınıfına uygun hale getirerek tekrar kullanmak amacıyla uygulanır.
    * Çoğu zaman işe yarayacağını düşündüğümüz mevcut bir sınıfı kendi sistemimizde tekrar kullanmak isteriz.
    * Fakat mevcut sınıf, tam beklediğimiz gibi olmayabilir.
    * Bu durumda araya bir tane adaptör yazarak, mevcut sınıfı kendi sistemimize uygun hale getirebiliriz.
    * Böylece adapte edilen nesnede kod değişikliği olmadan benzer bir arayüzü destekler hale getiririz.
    * Ayrıca adaptasyon işlemi sırasında, adapte edilen nesnenin desteklemediği özellikler de adaptör tarafından gerçekleştirilebilir.

  * Ağaç Yapısı ( Composite )

    * Bu tasarım deseninin amacı, nesneleri ağaç yapısına göre düzenleyerek, ağaç yapısındaki alt üst ilişkisini kurmaktır.
    * Bu tasarım desenine göre, ağaç yapısındaki üst ve alt nesneler aynı arayüz sınıfından türeyerek, birbirlerine benzerler.
    * Yani istemci, yaprak nesneye de üst nesneye de aynı şekilde davranır.
    * Böylece hiyerarşiyi ifade etmek ve hiyerarşi üzerinde işlem yapmak kolaylaşır.
    * Hiyerarşiye yeni nesneler eklemek de kolay hale gelir.

  * Dekorasyon ( Decorator )

    * Bu desen, nesneye ek özellikler eklemek için kullanılır.
    * Bu özellikler eklenirken, esas nesnenin bundan haberi yoktur, bu nesnede kod değişikliği gerekmez.
    * Ayrıca nesnenin özeliklerini arttırmak için, temel nesneden türetilip de, yeni nesneler yaratılmasına gerek olmaz.
    * Yani bu desen, bir nesneye alt sınıflar yaratılmaksızın, dinamik olarak yeni özellikler kazandırmak için kullanılır.

  * Hafif Ağırlık ( Flyweight )

    * Çok sayıda nesnenin sistemde olduğu durumlarda, nesne sayısının sistemde problemlere neden olmaması için kullanılan tasarım desenidir.
    * Çünkü çok sayıda nesne kullanmanın maliyeti yüksektir. Yeni nesneler oluşturmadan mevcut nesneleri kullanma mantığına göre çalışır.
    * Hafif ağırlık nesnelerini bir koleksiyonda tutmak gerekir.
    * Tutulan nesnelerin durumları az ise, ortak nesnelerin sayısı azalır.
    * Böylece bu koleksiyonun büyüklüğü de azalmış olur.

  * Köprü ( Bridge )

    * Bu tasarım deseni, soyutlama ile gerçekleştirmeyi ayrı sınıf hiyerarşisi içinde ayırmak için kullanılır.
    * Sınıflara daha fazla bir soyutlama ve genişleme imkanı tanır. Desende hem soyutlama kısmı, hem de gerçekleştirme kısmında bir üst sınıfı bulunur.
    * Bu üst sınıfların altındaysa belirli bir sınıf hiyerarşisi bulunur. Bu iki hiyerarşi de birbirlerine bağlıdır.
    * İşte desen, iki kısım arasında köprü gibi bir yapı olarak duran bu bağdan ismini almıştır. Soyutlama kısmında, sistemin daha üst düzey işlemleri bulunur.
    * Gerçekleştirme kısmında ise, bu soyutlama kısmındaki üst düzey işlemlere bağlı daha basit ve bu üst düzey işlemleri detaylandıran işlemler bulunur.
    * Sistemin gerçekleştirme ve soyutlama kısmında kalıcı bir bağlılık istemiyorsak, bu iki kısmında birbirlerinden bağımsız olarak alt sınıflarla genişlemesine imkan vermek istiyorsak, gerçekleştirme kısmını istemciden tamamen saklamak istiyorsak bu deseni kullanabiliriz.

  * Ön Yüz ( Facade )

    * Bu tasarım deseni, sistemin detaylarını saklayarak, istemcinin dışarıdan sisteme ulaşabilmesi için tek bir ön yüz sunar.
    * Sistemdeki alt sınıflara, bu ön yüz sınıfı ile ulaşılır.
    * İstemci yanlızca sistemdeki bu ön yüz sınıfını bilir.
    * Yani kısaca ön yüz sınıfı, sistemin dışarıya açılmış bir kapısı gibidir.

  * Özdeş Nesne ( Proxy )

    * Yaratılması pahalı bir çok işlem yapan bir nesneyi taklit eden bir başka nesnenin kullanılmasıdır.
    * Örneğin bir nesne yarattığımızda veya bir nesnenin bir yordamını çağırdığımızda, bu çağırım bellekte çok yer tutan daha başka bir çok nesne yaratabilir veya ağa bağlanma, veritabanından büyük bir veri alma gibi pahalı işlemler yapabilir.
    * Fakat uygulamanın akışına göre, bu işlemleri gerçekten yapmaya ihtiyaç olmayabilir.
    * İşte bu durumlarda, bu pahalı işlemlerden doğan zaman ve kaynak kayıplarını önlemek için özdeş nesne kullanılır.
    * Gerçekten bu pahalı işlem çağırılırsa, gerçek nesne oluşturulup, bu pahalı işlemler ihtiyaç olduğunda yapılır.
    * Bu tasarım deseni kullanılarak, sisteme yük getiren gereksiz pahalı işlemler önlenir, böylece sistem daha hızlı ve sağlıklı hale gelir.

<hr></hr>

3. ***Davranışsal Tasarım Desenleri***

**Bu sınıfta yer alan tasarım desenleri, sınıflar arasındaki haberleşmelerin nasıl olması gerektiğini belirler. Çalışma zamanında sınıflar, nasıl haberleşme yöntemleri ile sistemin akışını belirlerler? Bu sınıftaki tasarım desenleri bu soruya yanıtı verirler. Başlıca davranışsal tasarım desenleri: Arabulucu, Durum, Gözlemci, Hatırlayıcı, Kalıp Yordam, Komut, Sorumluluk Zinciri, Strateji, Yorumlayıcı, Ziyaretçi.**

  * Arabulucu ( Mediator )

  * Durum ( State )

  * Gözlemci ( Observer )

  * Hatırlayıcı ( Memento )

  * Kalıp Yordam ( Template Method )

  * Komut ( Command )

  * Sorumluluk Zinciri ( Chain of Res. )

  * Strateji ( Strategy )

  * Yorumlayıcı ( Interpreter )

  * Ziyaretçi ( Visitor )
