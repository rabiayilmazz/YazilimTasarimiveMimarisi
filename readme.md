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
