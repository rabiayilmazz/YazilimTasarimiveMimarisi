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

### L

<hr></hr>
### I

<hr></hr>
### D

<hr></hr>
## TASARIM DESENLERİ

1. Yaratıcı Tasarım Desenleri
**Bu sınıfta yer alan tasarım desenleri, nesnelerin uygun ve verimli bir şekilde yaratılma yollarıyla ilgilenirler. Nesne yaratma sorumluluklarını, farklı sınıf düzenlerinde soyutlayarak yaparlar. Başlıca yaratıcı tasarım desenleri: Tek Nesne, Fabrika Yordam, Soyut Fabrika, Kopya Nesne, Kurulum Nesnesi.**
<hr></hr>
  * Tek Nesne ( Singleton )

  * Fabrika Yordam ( Factory Method )

  * Soyut Fabrika ( Abstract Factory )

  * Kopya Nesne ( Prototype )

  * Kurucu ( Builder )

2. Yapısal Tasarım Desenleri
**Bu sınıfta yer alan tasarım desenleri, sınıflar arasındaki ilişkileri belirleyerek, tasarımı kolaylaştırırlar. Sınıflar arası ilişkiler nasıl olmalı? Türetme, soyutlama, nesnesini içerme? Hangi yol ile sınıflar birbirlerine bağlı olmalı. Bu soruların yanıtlarını açıklarlar. Başlıca yapısal tasarım desenleri: Adaptör, Ağaç Yapısı, Dekorasyon, Hafif Ağırlık, Köprü, Ön Yüz, Özdeş Nesne.**
<hr></hr>
  * Adaptör ( Adapter )

  * Ağaç Yapısı ( Composite )

  * Dekorasyon ( Decorator )

  * Hafif Ağırlık ( Flyweight )

  * Köprü ( Bridge )

  * Ön Yüz ( Facade )

  * Özdeş Nesne ( Proxy )

3. Davranışsal Tasarım Desenleri
**Bu sınıfta yer alan tasarım desenleri, sınıflar arasındaki haberleşmelerin nasıl olması gerektiğini belirler. Çalışma zamanında sınıflar, nasıl haberleşme yöntemleri ile sistemin akışını belirlerler? Bu sınıftaki tasarım desenleri bu soruya yanıtı verirler. Başlıca davranışsal tasarım desenleri: Arabulucu, Durum, Gözlemci, Hatırlayıcı, Kalıp Yordam, Komut, Sorumluluk Zinciri, Strateji, Yorumlayıcı, Ziyaretçi.**
<hr></hr>
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
