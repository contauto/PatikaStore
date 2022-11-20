
<h1 class="code-line" data-line-start=0 data-line-end=1><a id="Patika_Store_0"></a>Patika Store</h1>
<p class="has-line-data" data-line-start="2" data-line-end="3">Bu proje Kağan Berke ebebek Java &amp; QA &amp; SAP Spartacus Practicum için hazırlanmış final projesidir. Katmanlı mimariyle oluşturulmuş ve SOLID prensiplerine uygun davranılmıştır.</p>
<hr>
<h2 class="code-line" data-line-start=7 data-line-end=8><a id="zellikler_7"></a>Özellikler</h2>
<ul>
<li class="has-line-data" data-line-start="9" data-line-end="10">Markaların alfabetik olarak listelenmesi</li>
<li class="has-line-data" data-line-start="10" data-line-end="11">Farklı ürün gruplarının eklenebilir olması</li>
<li class="has-line-data" data-line-start="11" data-line-end="12">Kategori bazlı ürün listeleme</li>
<li class="has-line-data" data-line-start="12" data-line-end="13">Ürün ekleme</li>
<li class="has-line-data" data-line-start="13" data-line-end="14">Ürün silme</li>
<li class="has-line-data" data-line-start="14" data-line-end="15">Markaya göre filtreleme</li>
<li class="has-line-data" data-line-start="15" data-line-end="17">ID’ye göre filtreleme</li>
</ul>
<hr>
<h2 class="code-line" data-line-start=19 data-line-end=20><a id="Projenin_alma_Prensibi_19"></a>Projenin Çalışma Prensibi</h2>
<pre><code class="has-line-data" data-line-start="22" data-line-end="24" class="language-sh">brandManager.getAll() //Markaları alfabetik sırayla döndüren metot
</code></pre>
<pre><code class="has-line-data" data-line-start="26" data-line-end="28" class="language-sh">Printer.printBrand(Brand b) //Markaları ekrana bastıran metot
</code></pre>
<pre><code class="has-line-data" data-line-start="30" data-line-end="32" class="language-sh">categoryManager.addCategory(String categoryName) //Kategori ekleyen metot
</code></pre>
<pre><code class="has-line-data" data-line-start="34" data-line-end="36" class="language-sh">productManager.addProduct(Product p) //Ürün ekleyen metot
</code></pre>
<pre><code class="has-line-data" data-line-start="38" data-line-end="40" class="language-sh">productManager.deleteProduct(int id) //Ürün silen metot
</code></pre>
<pre><code class="has-line-data" data-line-start="42" data-line-end="44" class="language-sh">productManager.getProductById(int id) //Ürün idsine göre ürün listesi <span class="hljs-built_in">return</span> eden metot
</code></pre>
<pre><code class="has-line-data" data-line-start="46" data-line-end="48" class="language-sh">productManager.getProductByCategory(int id) //Ürün idsine göre ürün listesi <span class="hljs-built_in">return</span> eden metot
</code></pre>
<pre><code class="has-line-data" data-line-start="50" data-line-end="52" class="language-sh">productManager.getProductByBrand(String brand) //Marka ismine göre ürün listesi <span class="hljs-built_in">return</span> eden metot
</code></pre>
<pre><code class="has-line-data" data-line-start="54" data-line-end="56" class="language-sh">Printer.printProduct(Product p) //Ürün listesi ekrana bastıran metot
</code></pre>
</body></html>
