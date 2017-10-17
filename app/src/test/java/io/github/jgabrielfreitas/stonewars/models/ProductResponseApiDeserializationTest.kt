package io.github.jgabrielfreitas.stonewars.models

import com.google.gson.Gson
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by JGabrielFreitas on 16/10/2017.
 */
class ProductResponseApiDeserializationTest {

    val productResonseApi: String = "[{\"title\":\"Blusa do Imperio\",\"price\":7990,\"zipcode\":\"78993-000\",\"seller\":\"Jou00e3o da Silva\",\"thumbnailHd\":\"https://cdn.awsli.com.br/600x450/21/21351/produto/3853007/f66e8c63ab.jpg\",\"date\":\"26/11/2015\"},{\"title\":\"Blusa Han Shot First\",\"price\":7990,\"zipcode\":\"13500-110\",\"seller\":\"Joana\",\"thumbnailHd\":\"https://cdn.awsli.com.br/1000x1000/21/21351/produto/7234148/55692a941d.jpg\",\"date\":\"26/11/2015\"},{\"title\":\"Sabre de luz\",\"price\":150000,\"zipcode\":\"13537-000\",\"seller\":\"Mario Mota\",\"thumbnailHd\":\"http://www.obrigadopelospeixes.com/wp-content/uploads/2015/12/kalippe_lightsaber_by_jnetrocks-d4dyzpo1-1024x600.jpg\",\"date\":\"20/11/2015\"},{\"title\":\"Replica de BB-8\",\"price\":250000,\"zipcode\":\"21212-121\",\"seller\":\"Luigi Augusto\",\"thumbnailHd\":\"http://tf3dm.com/imgd/l29421-bb8-35865.jpg\",\"date\":\"29/10/2015\"},{\"title\":\"Blusa C3-PO\",\"price\":2990,\"zipcode\":\"20521-110\",\"seller\":\"Marcio Lima\",\"thumbnailHd\":\"http://images.shirts.com/products/16425/14-14-40600/womens-star-wars-i-am-cp3o-costume-tshirt-logo.jpg\",\"date\":\"26/10/2015\"},{\"title\":\"Boneco de StormTrooper\",\"price\":8900,\"zipcode\":\"20511-170\",\"seller\":\"Ana Julia\",\"thumbnailHd\":\"https://dyn0.media.forbiddenplanet.com/products/2329451.jpg.square-true_maxheight-285_size-285.jpg\",\"date\":\"26/10/2015\"},{\"title\":\"Capacete de StormTrooper\",\"price\":30000,\"zipcode\":\"21212-121\",\"seller\":\"Edu Guimaru00e3es\",\"thumbnailHd\":\"https://cmkt-image-prd.global.ssl.fastly.net/0.1.0/ps/760104/300/200/m1/fpnw/wm0/clean_tt_v001.0001-.png?1446786887&s=dcba72825ebb6982f69cd9aeeddcf9ca\",\"date\":\"25/10/2015\"},{\"title\":\"Moletom Trooper\",\"price\":80000,\"zipcode\":\"13500-110\",\"seller\":\"Matheus\",\"thumbnailHd\":\"http://mlb-s1-p.mlstatic.com/moletom-star-wars-stormtrooper-12754-MLB20066273702_032014-F.jpg\",\"date\":\"22/10/2015\"},{\"title\":\"Moletom Jedi\",\"price\":5000,\"zipcode\":\"20260-160\",\"seller\":\"John Sitiou\",\"thumbnailHd\":\"http://mlb-s1-p.mlstatic.com/moletom-star-wars-jedi-knight-academy-em-silk-877011-MLB20470360774_112015-F.jpg\",\"date\":\"22/10/2015\"},{\"title\":\"Moletom Vader\",\"price\":8900,\"zipcode\":\"21212-121\",\"seller\":\"Nicolas\",\"thumbnailHd\":\"http://mlb-s2-p.mlstatic.com/blusa-moletom-star-wars-feminina-canguru-com-capuz-431311-MLB20508352592_122015-O.jpg\",\"date\":\"21/10/2015\"}]"
    var productList: ProductResponseApi? = null

    @Before
    fun init() { productList = deserialize_product() }

    @Test
    fun product_deserialization_not_null() {

        assertNotNull(productList)
    }

    @Test
    fun product_deserialization_not_empty() {

        assertTrue(!productList!!.isEmpty())
    }

    @Test
    fun product_deserialization_at_last_two_itens() {

        assertTrue(productList!!.size > 2)
    }

    @Test
    fun product_light_saber() {

        val lightSaberProduct = productList?.get(2)
        val expected: String  = "Sabre de luz"
        val actual  : String  = lightSaberProduct?.title ?: "fail"
        assertEquals(expected, actual)
    }

    private fun deserialize_product() : ProductResponseApi? {

        return Gson().fromJson(productResonseApi, ProductResponseApi::class.java)
    }
}
