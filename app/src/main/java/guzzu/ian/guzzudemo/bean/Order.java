package guzzu.ian.guzzudemo.bean;

import java.util.List;

/**
 * Created by Ian on 2018/3/12.
 */

public class Order {

    /**
     * total : 30
     * results : [{"_id":"5aab841d8f0b8358b622bb39","createdAt":"2018-03-16T08:45:17.759Z","updatedAt":"2018-03-21T13:54:24.799Z","refId":"30904","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","clientType":"web","nonce":"1519459637216","type":"default","shippingType":"regular","note":"","paymentStatus":"paid","shippingStatus":"unshipped","__v":1,"paidAt":"2018-03-16T08:45:33.485Z","paymentType":"wxpay","isArchived":false,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":4,"totalCost":4,"affiliateCost":0,"serviceCost":0,"subtotal":4,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"productId":"57c4ed25cc4f36bc2c12ab2b","product":{"slug":"test-1","name":{"en":"Test Product A","zh":"測試商品A（不发货，不退款）"},"description":{"en":"<p><strong>Notes to merchant<\/strong><\/p>\n<p>1. This is a Test Product. It will not be shipped or refunded.<\/p>\n<p>2. You can update the details or safely delete this item from your catalog.<\/p>\n<p><strong>【特别提醒】<\/strong><\/p>\n<p>1. 测试商品，不发货，不退款。<\/p>\n<p>2. 该商品可直接修改价格上架销售，或删除。<\/p>\n<p>&nbsp;<\/p>","zh":"<p><strong>Notes to merchant<\/strong><\/p>\n<p>1. This is a Test Product. It will not be shipped or refunded.<\/p>\n<p>2. You can update the details or safely delete this item from your catalog.<\/p>\n<p><strong>【特别提醒】<\/strong><\/p>\n<p>1. 测试商品，不发货，不退款。<\/p>\n<p>2. 该商品可直接修改价格上架销售，或删除。<\/p>"},"metaDescription":{"en":"Test 1","zh":"Test 1"},"weixinShareTitle":{"en":"測試商品（测试商品，不发货，不退款）","zh":"測試商品（测试商品，不发货，不退款）"},"weixinShareDescription":{"en":"測試商品（测试商品，不发货，不退款）","zh":"測試商品（测试商品，不发货，不退款）"},"gallery":[{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3.jpg","size":76493,"format":"JPEG","colorspace":"RGB","orientation":""}}],"productOptions":[],"inOrders":[],"shippingCosts":[{"country":"CHN","price":0,"_id":"5a966e5814d20f1f9184d8d7"}],"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"isArchived":false,"shippingRateTable":"5a010ca2c5cd406501a15710","shippingType":"default","sku":"TESTPRODUCT001","isDiscounted":true,"maxQuantity":0,"weight":499,"oneBuyPerCustomer":false,"groups":["5833f81bd499f8256e5ec795"],"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5.jpg","size":88166,"format":"JPEG","colorspace":"RGB","orientation":""}},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"price":1,"originalPrice":1000,"status":"published","tags":[],"materials":[],"categories":[],"inventoryPolicy":"unlimited","quantity":0,"type":"default","purchased":95,"translationStatus":"draft","liked":0,"commented":0,"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"store":"57c4ed03cc4f36bc2c12ab29","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2018-03-01T09:37:15.136Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"quantity":1,"price":1,"_id":"5aab841d8f0b8358b622bb3b","name":{"en":"Test Product A","zh":"測試商品A（不发货，不退款）"}},{"productId":"57fc5bc263468d542306e7de","product":{"slug":"test-2","name":{"en":"Test Product B","zh":"测试商品B，仅供测试"},"description":{"en":"<p><img id=\"57fc5b3d63468d542306e7da\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg 780w\" width=\"780\" height=\"772\" /><img id=\"57fc5b3e63468d542306e7db\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg 780w\" width=\"780\" height=\"1009\" /><\/p>","zh":"<p><img id=\"57fc5b3d63468d542306e7da\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg 780w\" width=\"780\" height=\"772\" /><img id=\"57fc5b3e63468d542306e7db\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg 780w\" width=\"780\" height=\"1009\" /><\/p>"},"metaDescription":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"weixinShareTitle":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"weixinShareDescription":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"gallery":[{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","size":79872,"format":"JPEG","colorspace":"RGB","orientation":""}}],"productOptions":[],"inOrders":[],"shippingCosts":[{"country":"CHN","price":0,"_id":"5a6824613670bb78d5d34b4a"}],"reviewCount":4,"ratingTotal":{"positive":4,"moderate":0,"negative":0},"isArchived":false,"shippingRateTable":"5a010ca2c5cd406501a15710","productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","weight":0,"isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","oneBuyPerCustomer":false,"image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","size":91034,"format":"JPEG","colorspace":"RGB","orientation":""}},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"price":1,"originalPrice":200,"status":"published","tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":109,"type":"default","campaignStatus":"started","liked":1,"commented":0,"imageDescription":[],"store":"57c4ed03cc4f36bc2c12ab29","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2018-03-09T01:44:29.481Z","_id":"57fc5bc263468d542306e7de"},"quantity":3,"price":1,"_id":"5aab841d8f0b8358b622bb3a","name":{"en":"Test Product B","zh":"测试商品B，仅供测试"}}],"shippingAddress":{"name":"Calvin","mobilePhone":"13268183361","country":"CHN","province":"广东省","provinceId":"440000","city":"东莞市","cityId":"441900","district":"东莞市","districtId":"441900","address":"223創客谷516-2世界贷","mobilePhoneCountry":"+86","postalCode":"","street":"东城街道","streetId":"441900003"},"status":"open"},{"_id":"5a991762f2d8d712f0067009","createdAt":"2018-03-02T09:20:34.112Z","updatedAt":"2018-03-02T09:21:09.423Z","refId":"30864","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","clientType":"web","nonce":"1519982421041","type":"default","shippingType":"regular","note":"","paymentStatus":"paid","shippingStatus":"unshipped","__v":1,"paidAt":"2018-03-02T09:21:09.408Z","paymentType":"wxpay","pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":1,"totalCost":1,"affiliateCost":0,"serviceCost":0,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"productId":"57fc5bc263468d542306e7de","product":{"slug":"test-2","name":{"en":"Test Product B","zh":"测试商品B，仅供测试"},"description":{"en":"<p><img id=\"57fc5b3d63468d542306e7da\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg 780w\" width=\"780\" height=\"772\" /><img id=\"57fc5b3e63468d542306e7db\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg 780w\" width=\"780\" height=\"1009\" /><\/p>","zh":"<p><img id=\"57fc5b3d63468d542306e7da\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg 780w\" width=\"780\" height=\"772\" /><img id=\"57fc5b3e63468d542306e7db\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg 780w\" width=\"780\" height=\"1009\" /><\/p>"},"metaDescription":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"weixinShareTitle":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"weixinShareDescription":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"gallery":[{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","size":79872,"format":"JPEG","colorspace":"RGB","orientation":""}}],"productOptions":[],"inOrders":[],"shippingCosts":[{"country":"CHN","price":0,"_id":"5a6824613670bb78d5d34b4a"}],"reviewCount":4,"ratingTotal":{"positive":4,"moderate":0,"negative":0},"isArchived":false,"shippingRateTable":"5a010ca2c5cd406501a15710","productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","weight":0,"isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","oneBuyPerCustomer":false,"image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","size":91034,"format":"JPEG","colorspace":"RGB","orientation":""}},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"price":1,"originalPrice":200,"status":"published","tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":98,"type":"default","campaignStatus":"started","liked":1,"commented":0,"imageDescription":[],"store":"57c4ed03cc4f36bc2c12ab29","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2018-02-13T09:05:01.003Z","_id":"57fc5bc263468d542306e7de"},"quantity":1,"price":1,"_id":"5a991762f2d8d712f006700a","name":{"en":"Test Product B","zh":"测试商品B，仅供测试"}}],"shippingAddress":{"name":"Calvin","mobilePhone":"13268183361","country":"CHN","province":"广东省","provinceId":"440000","city":"东莞市","cityId":"441900","district":"东莞市","districtId":"441900","address":"223創客谷516-2世界贷","mobilePhoneCountry":"+86","postalCode":"","street":"东城街道","streetId":"441900003"},"status":"open"},{"_id":"59cdbbcda9ce64050d560099","updatedAt":"2017-09-29T03:20:00.163Z","createdAt":"2017-09-29T03:19:41.016Z","refId":"30306","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"5912c57ac0e51e10813fdd44","clientType":"web","nonce":"1506655165199","type":"default","shippingType":"regular","note":"","paymentStatus":"paid","shippingStatus":"unshipped","__v":2,"paidAt":"2017-09-29T03:20:00.132Z","paymentType":"app-wxpay","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":1,"totalCost":1,"affiliateCost":0,"serviceCost":0,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"59cdbbcda9ce64050d56009a","price":1,"quantity":1,"product":{"description":{"html":"<h1 id=\"abc\">&nbsp;<\/h1>","md":"<h1 id=\"abc\">&nbsp;<\/h1>"},"price":1,"originalPrice":200,"status":"published","weight":0,"tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":16,"type":"default","liked":1,"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":79872,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"}],"imageDescription":[],"rafflePurchasedTickets":[],"productOptions":[],"inOrders":[],"shippingCosts":[{"_id":"59ccb4763108bf6a310638a9","country":"CHN","price":0}],"productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","metaDescription":"Test product for testing only 测试商品，仅供测试","weixinShareTitle":"Test product for testing only 测试商品，仅供测试","weixinShareDescription":"Test product for testing only 测试商品，仅供测试","oneBuyPerCustomer":false,"image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":91034,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"campaignStatus":"started","commented":0,"store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"slug":"test-2","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2017-09-29T03:17:49.686Z","_id":"57fc5bc263468d542306e7de"},"productId":"57fc5bc263468d542306e7de","name":{"zh":"Test product for testing only 测试商品，仅供测试","en":"Test product for testing only 测试商品，仅供测试"}}],"shippingAddress":{"name":"ryan","mobilePhone":"18819761311","country":"CHN","province":"北京市","provinceId":"110000","city":"市辖区","cityId":"110100","district":"东城区","districtId":"110101","address":"123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"59cdbb47a9ce64050d560091","updatedAt":"2017-09-29T03:17:49.678Z","createdAt":"2017-09-29T03:17:27.632Z","refId":"30305","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"5912c57ac0e51e10813fdd44","clientType":"web","nonce":"1506655014226","type":"default","shippingType":"regular","note":"","paymentStatus":"paid","shippingStatus":"unshipped","__v":2,"paidAt":"2017-09-29T03:17:49.649Z","paymentType":"app-wxpay","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":1,"totalCost":1,"affiliateCost":0,"serviceCost":0,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"59cdbb47a9ce64050d560092","price":1,"quantity":1,"product":{"description":{"html":"<h1 id=\"abc\">&nbsp;<\/h1>","md":"<h1 id=\"abc\">&nbsp;<\/h1>"},"price":1,"originalPrice":200,"status":"published","weight":0,"tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":15,"type":"default","liked":1,"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":79872,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"}],"imageDescription":[],"rafflePurchasedTickets":[],"productOptions":[],"inOrders":[],"shippingCosts":[{"_id":"59ccb4763108bf6a310638a9","country":"CHN","price":0}],"productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","metaDescription":"Test product for testing only 测试商品，仅供测试","weixinShareTitle":"Test product for testing only 测试商品，仅供测试","weixinShareDescription":"Test product for testing only 测试商品，仅供测试","oneBuyPerCustomer":false,"image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":91034,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"campaignStatus":"started","commented":0,"store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"slug":"test-2","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2017-09-29T03:15:00.203Z","_id":"57fc5bc263468d542306e7de"},"productId":"57fc5bc263468d542306e7de","name":{"zh":"Test product for testing only 测试商品，仅供测试","en":"Test product for testing only 测试商品，仅供测试"}}],"shippingAddress":{"name":"ryan","mobilePhone":"18819761311","country":"CHN","province":"北京市","provinceId":"110000","city":"市辖区","cityId":"110100","district":"东城区","districtId":"110101","address":"123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"59cdaad1a9ce64050d56006e","updatedAt":"2017-09-29T02:07:13.965Z","createdAt":"2017-09-29T02:07:13.965Z","refId":"30302","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"5912c57ac0e51e10813fdd44","clientType":"web","nonce":"1506650825680","type":"default","shippingType":"regular","note":"","paymentStatus":"paid","shippingStatus":"unshipped","__v":0,"paymentType":"wxpay","paidAt":"2017-09-29T02:07:26.560Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":1,"totalCost":1,"affiliateCost":0,"serviceCost":0,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"59cdaad1a9ce64050d56006f","price":1,"quantity":1,"product":{"description":{"html":"<h1 id=\"abc\">&nbsp;<\/h1>","md":"<h1 id=\"abc\">&nbsp;<\/h1>"},"price":1,"originalPrice":200,"status":"published","weight":0,"tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":14,"type":"default","liked":1,"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":79872,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"}],"imageDescription":[],"rafflePurchasedTickets":[],"productOptions":[],"inOrders":[{"_id":"59cda7bed22fbb5e2ea26023","order":"59cda7bed22fbb5e2ea26020","quantity":1,"createdAt":"2017-09-29T01:54:06.658Z","customer":"5912c57ac0e51e10813fdd44"}],"shippingCosts":[{"_id":"59ccb4763108bf6a310638a9","country":"CHN","price":0}],"productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","metaDescription":"Test product for testing only 测试商品，仅供测试","weixinShareTitle":"Test product for testing only 测试商品，仅供测试","weixinShareDescription":"Test product for testing only 测试商品，仅供测试","oneBuyPerCustomer":false,"image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":91034,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"campaignStatus":"started","commented":0,"store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"slug":"test-2","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2017-09-28T10:10:00.539Z","_id":"57fc5bc263468d542306e7de"},"productId":"57fc5bc263468d542306e7de","name":{"zh":"Test product for testing only 测试商品，仅供测试","en":"Test product for testing only 测试商品，仅供测试"}}],"shippingAddress":{"name":"ryan","mobilePhone":"18819761311","country":"CHN","province":"北京市","provinceId":"110000","city":"市辖区","cityId":"110100","district":"东城区","districtId":"110101","address":"123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"59cdaa3e047ba404d205b23d","updatedAt":"2017-09-29T02:04:46.919Z","createdAt":"2017-09-29T02:04:46.919Z","refId":"30301","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"5912c57ac0e51e10813fdd44","clientType":"web","nonce":"1506650655374","type":"default","shippingType":"regular","note":"","paymentStatus":"paid","shippingStatus":"unshipped","__v":0,"paymentType":"wxpay","paidAt":"2017-09-29T02:04:59.566Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":1,"totalCost":1,"affiliateCost":0,"serviceCost":0,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"59cdaa3e047ba404d205b23e","price":1,"quantity":1,"product":{"description":{"html":"<h1 id=\"abc\">&nbsp;<\/h1>","md":"<h1 id=\"abc\">&nbsp;<\/h1>"},"price":1,"originalPrice":200,"status":"published","weight":0,"tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":13,"type":"default","liked":1,"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":79872,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"}],"imageDescription":[],"rafflePurchasedTickets":[],"productOptions":[],"inOrders":[{"_id":"59cda7bed22fbb5e2ea26023","order":"59cda7bed22fbb5e2ea26020","quantity":1,"createdAt":"2017-09-29T01:54:06.658Z","customer":"5912c57ac0e51e10813fdd44"}],"shippingCosts":[{"_id":"59ccb4763108bf6a310638a9","country":"CHN","price":0}],"productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","metaDescription":"Test product for testing only 测试商品，仅供测试","weixinShareTitle":"Test product for testing only 测试商品，仅供测试","weixinShareDescription":"Test product for testing only 测试商品，仅供测试","oneBuyPerCustomer":false,"image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":91034,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"campaignStatus":"started","commented":0,"store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"slug":"test-2","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2017-09-28T10:10:00.539Z","_id":"57fc5bc263468d542306e7de"},"productId":"57fc5bc263468d542306e7de","name":{"zh":"Test product for testing only 测试商品，仅供测试","en":"Test product for testing only 测试商品，仅供测试"}}],"shippingAddress":{"name":"ryan","mobilePhone":"18819761311","country":"CHN","province":"北京市","provinceId":"110000","city":"市辖区","cityId":"110100","district":"东城区","districtId":"110101","address":"123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"59cda91b7f86cd03ee6278e5","updatedAt":"2017-09-29T01:59:55.883Z","createdAt":"2017-09-29T01:59:55.883Z","refId":"30300","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"5912c57ac0e51e10813fdd44","clientType":"web","nonce":"1506650386433","type":"default","shippingType":"regular","note":"","paymentStatus":"paid","shippingStatus":"unshipped","__v":0,"paymentType":"wxpay","paidAt":"2017-09-29T02:00:08.772Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":1,"totalCost":1,"affiliateCost":0,"serviceCost":0,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"59cda91b7f86cd03ee6278e6","price":1,"quantity":1,"product":{"description":{"html":"<h1 id=\"abc\">&nbsp;<\/h1>","md":"<h1 id=\"abc\">&nbsp;<\/h1>"},"price":1,"originalPrice":200,"status":"published","weight":0,"tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":12,"type":"default","liked":1,"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":79872,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"}],"imageDescription":[],"rafflePurchasedTickets":[],"productOptions":[],"inOrders":[{"_id":"59cda7bed22fbb5e2ea26023","order":"59cda7bed22fbb5e2ea26020","quantity":1,"createdAt":"2017-09-29T01:54:06.658Z","customer":"5912c57ac0e51e10813fdd44"}],"shippingCosts":[{"_id":"59ccb4763108bf6a310638a9","country":"CHN","price":0}],"productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","metaDescription":"Test product for testing only 测试商品，仅供测试","weixinShareTitle":"Test product for testing only 测试商品，仅供测试","weixinShareDescription":"Test product for testing only 测试商品，仅供测试","oneBuyPerCustomer":false,"image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":91034,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"campaignStatus":"started","commented":0,"store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"slug":"test-2","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2017-09-28T10:10:00.539Z","_id":"57fc5bc263468d542306e7de"},"productId":"57fc5bc263468d542306e7de","name":{"zh":"Test product for testing only 测试商品，仅供测试","en":"Test product for testing only 测试商品，仅供测试"}}],"shippingAddress":{"name":"ryan","mobilePhone":"18819761311","country":"CHN","province":"北京市","provinceId":"110000","city":"市辖区","cityId":"110100","district":"东城区","districtId":"110101","address":"123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"59cccae6d22fbb5e2ea26010","updatedAt":"2017-09-28T10:11:58.078Z","createdAt":"2017-09-28T10:11:50.668Z","refId":"30298","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"5912c57ac0e51e10813fdd44","clientType":"web","nonce":"1506592471209","type":"default","shippingType":"regular","note":"","paymentStatus":"paid","shippingStatus":"unshipped","__v":1,"paymentType":"app-wxpay","paidAt":"2017-09-28T10:12:14.335Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":2,"totalCost":2,"affiliateCost":0,"serviceCost":0,"subtotal":2,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"59cccae6d22fbb5e2ea26011","price":1,"quantity":2,"product":{"description":{"html":"<h1 id=\"abc\">&nbsp;<\/h1>","md":"<h1 id=\"abc\">&nbsp;<\/h1>"},"price":1,"originalPrice":200,"status":"published","weight":0,"tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":10,"type":"default","liked":1,"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":79872,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"}],"imageDescription":[],"rafflePurchasedTickets":[],"productOptions":[],"inOrders":[],"shippingCosts":[{"_id":"59ccb4763108bf6a310638a9","country":"CHN","price":0}],"productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","metaDescription":"Test product for testing only 测试商品，仅供测试","weixinShareTitle":"Test product for testing only 测试商品，仅供测试","weixinShareDescription":"Test product for testing only 测试商品，仅供测试","oneBuyPerCustomer":false,"image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":91034,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"campaignStatus":"started","commented":0,"store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"slug":"test-2","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2017-09-28T10:10:00.539Z","_id":"57fc5bc263468d542306e7de"},"productId":"57fc5bc263468d542306e7de","name":{"zh":"Test product for testing only 测试商品，仅供测试","en":"Test product for testing only 测试商品，仅供测试"}}],"shippingAddress":{"name":"ryan","mobilePhone":"18819761311","country":"CHN","province":"北京市","provinceId":"110000","city":"市辖区","cityId":"110100","district":"东城区","districtId":"110101","address":"123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"59ccb416d22fbb5e2ea25fc5","updatedAt":"2017-09-28T08:34:30.196Z","createdAt":"2017-09-28T08:34:30.196Z","refId":"30286","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"5912c57ac0e51e10813fdd44","clientType":"web","nonce":"1506587660593","type":"default","shippingType":"regular","note":"","paymentStatus":"paid","shippingStatus":"unshipped","__v":0,"paymentType":"wxpay","paidAt":"2017-09-28T08:34:41.275Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":2,"totalCost":2,"affiliateCost":0,"serviceCost":0,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":1,"discountItem":{"itemIndexes":[]},"items":[{"_id":"59ccb416d22fbb5e2ea25fc6","price":1,"quantity":1,"product":{"description":{"html":"<h1 id=\"abc\">&nbsp;<\/h1>","md":"<h1 id=\"abc\">&nbsp;<\/h1>"},"price":1,"originalPrice":200,"status":"published","weight":0,"tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":9,"type":"default","liked":1,"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":79872,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"}],"imageDescription":[],"rafflePurchasedTickets":[],"productOptions":[],"inOrders":[{"_id":"59ccb061d22fbb5e2ea25f8c","order":"59ccb061d22fbb5e2ea25f89","quantity":1,"createdAt":"2017-09-28T08:18:41.348Z","customer":"5949d2c0c197a2174d426ec9"},{"_id":"59ccb387d22fbb5e2ea25fc2","order":"59ccb387d22fbb5e2ea25fbf","quantity":1,"createdAt":"2017-09-28T08:32:07.543Z","customer":"5949d2c0c197a2174d426ec9"}],"shippingCosts":[{"_id":"59ccb3815a8d0d6937cf7b5e","country":"CHN","price":1}],"productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","metaDescription":"Test product for testing only 测试商品，仅供测试","weixinShareTitle":"Test product for testing only 测试商品，仅供测试","weixinShareDescription":"Test product for testing only 测试商品，仅供测试","oneBuyPerCustomer":false,"image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":91034,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","height":800,"width":800},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"campaignStatus":"started","commented":0,"store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"slug":"test-2","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2017-09-28T08:32:01.973Z","_id":"57fc5bc263468d542306e7de"},"productId":"57fc5bc263468d542306e7de","name":{"zh":"Test product for testing only 测试商品，仅供测试","en":"Test product for testing only 测试商品，仅供测试"}}],"shippingAddress":{"name":"ryan","mobilePhone":"18819761311","country":"CHN","province":"北京市","provinceId":"110000","city":"市辖区","cityId":"110100","district":"东城区","districtId":"110101","address":"123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"5979a05d7a2edf33a8048b06","updatedAt":"2017-07-27T08:12:13.268Z","createdAt":"2017-07-27T08:12:13.268Z","refId":"30172","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"5912c57ac0e51e10813fdd44","clientType":"web","nonce":"1501143129501","type":"default","paymentStatus":"requested_refund","shippingStatus":"unshipped","__v":0,"paymentType":"alipay","paidAt":"2017-07-27T08:12:47.179Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":1,"totalCost":1,"affiliateCost":0,"serviceCost":0,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"5979a05d7a2edf33a8048b07","price":1,"productOption":{"_id":"59795b22fe105006138c74fa","description":"undefined","inventoryPolicy":"unlimited","name":{"en":"Option 2","zh":"Option 2"},"price":1,"status":"active","maxQuantity":-35},"productOptionId":"59795b22fe105006138c74fa","quantity":1,"product":{"description":{"html":"<p><img id=\"58fdfd43d26b3b533033fa26\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/0a25a4a6-3877-4ce8-abb5-3bc42ada7945.png\" width=\"234\" height=\"234\" /><\/p>\n<p><img id=\"58003f77f6f3f26eeca971a9\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95.jpg\" width=\"560\" height=\"560\" /><\/p>\n<p>&nbsp;<\/p>","md":"<p><img id=\"58fdfd43d26b3b533033fa26\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/0a25a4a6-3877-4ce8-abb5-3bc42ada7945.png\" width=\"234\" height=\"234\" /><\/p>\n<p><img id=\"58003f77f6f3f26eeca971a9\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95.jpg\" width=\"560\" height=\"560\" /><\/p>\n<p>&nbsp;<\/p>"},"price":5,"originalPrice":0,"status":"published","weight":0,"tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":62,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":328704,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/5e50c996-a048-48d6-b1a5-ef539fd79337.jpg","height":2600,"width":320},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/5e50c996-a048-48d6-b1a5-ef539fd79337-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/5e50c996-a048-48d6-b1a5-ef539fd79337-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":96,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/5e50c996-a048-48d6-b1a5-ef539fd79337-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":128,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/5e50c996-a048-48d6-b1a5-ef539fd79337-medium.jpg"},{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":180224,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/9d029a5e-efcb-4240-92b2-54279c4a1980.jpg","height":780,"width":610},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/9d029a5e-efcb-4240-92b2-54279c4a1980-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/9d029a5e-efcb-4240-92b2-54279c4a1980-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":610,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/9d029a5e-efcb-4240-92b2-54279c4a1980-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":813,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/9d029a5e-efcb-4240-92b2-54279c4a1980-medium.jpg"},{"original":{"orientation":"","colorspace":"RGB","format":"PNG","size":6308,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/0a25a4a6-3877-4ce8-abb5-3bc42ada7945.png","height":234,"width":234},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/0a25a4a6-3877-4ce8-abb5-3bc42ada7945-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/0a25a4a6-3877-4ce8-abb5-3bc42ada7945-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/0a25a4a6-3877-4ce8-abb5-3bc42ada7945-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/0a25a4a6-3877-4ce8-abb5-3bc42ada7945-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"_id":"59795b22fe105006138c74fb","description":"undefined","inventoryPolicy":"unlimited","name":"Option 1","price":5,"status":"active","maxQuantity":-23},{"_id":"59795b22fe105006138c74fa","description":"undefined","inventoryPolicy":"unlimited","name":"Option 2","price":1,"status":"active","maxQuantity":-35}],"inOrders":[],"shippingCosts":[{"_id":"59795b22fe105006138c74f9","country":"CHN","price":0}],"productSpec":null,"shippingType":"default","weixinShareDescription":"Test 1 Description","weixinShareTitle":"Test 1 Title","metaDescription":"Test 1","sku":"undefined","isDiscounted":false,"maxQuantity":0,"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":46285,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95.jpg","height":560,"width":560},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test 1","zh":"Test 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-07-27T03:16:50.988Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","name":{"zh":"Test 1","en":"Test 1"}}],"shippingAddress":{"name":"ryan","mobilePhone":"18819761311","country":"CHN","province":"北京市","provinceId":"110000","city":"市辖区","cityId":"110100","district":"东城区","districtId":"110101","address":"123","mobilePhoneCountry":"+86","postalCode":"","chinaIdNumber":"456","chinaIdFront":"images/2df38270-7e15-407f-b02f-fca9822eb6bb.jpg","chinaIdBack":"images/1e5aa552-5007-4cbe-84de-eec75338c49f.jpg","chinaIdHolding":"images/36242b1b-5271-4cff-96f5-8ff5976f4c96.jpg"},"status":"open"},{"_id":"58f96c5d69d5337630f9bc02","updatedAt":"2017-04-21T02:20:13.939Z","createdAt":"2017-04-21T02:20:13.939Z","refId":"30126","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1492741210184","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","discountItems":[],"__v":0,"paymentType":"wxpay","paidAt":"2017-04-21T02:20:25.701Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":2,"totalCost":2,"affiliateCost":0,"serviceCost":0,"subtotal":2,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58f96c5d69d5337630f9bc03","price":1,"productOption":{"_id":"57fc5b5563468d542306e7dc","name":{"en":"Option 2","zh":"Option 2"},"price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-24,"purchased":24},"productOptionId":"57fc5b5563468d542306e7dc","quantity":2,"product":{"price":5,"originalPrice":0,"status":"private","tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":37,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":55194,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73.jpg","height":466,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg","maxHeight":780,"maxWidth":780,"height":519,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-large.jpg","maxHeight":1040,"maxWidth":1040,"height":692,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"purchased":10,"_id":"57fc5b5563468d542306e7dd","name":"Option 1","price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-9},{"_id":"57fc5b5563468d542306e7dc","name":"Option 2","price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-24,"purchased":24}],"inOrders":[],"shippingCosts":[],"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":238592,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5.jpg","height":700,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test 1","zh":"Test 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-03-16T09:52:31.863Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","name":{"zh":"Test 1","en":"Test 1"}}],"shippingAddress":{"name":"陳振宇","mobilePhone":"13268183361","country":"CHN","province":"Guangxi Zhuang Autonomous Region","city":"Fangchenggang City","district":"Fangcheng","address":"Test street 123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"58f969e8eb75b6729f2ea0bd","updatedAt":"2017-04-21T02:09:44.310Z","createdAt":"2017-04-21T02:09:44.310Z","refId":"30125","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1492740580464","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","discountItems":[],"__v":0,"paymentType":"wxpay","paidAt":"2017-04-21T02:10:10.440Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":1,"totalCost":1,"affiliateCost":0,"serviceCost":0,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58f969e8eb75b6729f2ea0be","price":1,"productOption":{"_id":"57fc5b5563468d542306e7dc","name":{"en":"Option 2","zh":"Option 2"},"price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-23,"purchased":23},"productOptionId":"57fc5b5563468d542306e7dc","quantity":1,"product":{"price":5,"originalPrice":0,"status":"private","tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":36,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":55194,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73.jpg","height":466,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg","maxHeight":780,"maxWidth":780,"height":519,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-large.jpg","maxHeight":1040,"maxWidth":1040,"height":692,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"purchased":10,"_id":"57fc5b5563468d542306e7dd","name":"Option 1","price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-9},{"_id":"57fc5b5563468d542306e7dc","name":"Option 2","price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-23,"purchased":23}],"inOrders":[{"_id":"58f96854eb75b6729f2ea0ba","order":"58f96854eb75b6729f2ea0b7","quantity":2,"createdAt":"2017-04-21T02:03:00.528Z","customer":"57c4ecc8cc4f36bc2c12ab28","productOption":"57fc5b5563468d542306e7dc"}],"shippingCosts":[],"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":238592,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5.jpg","height":700,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test 1","zh":"Test 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-03-16T09:52:31.863Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","name":{"zh":"Test 1","en":"Test 1"}}],"shippingAddress":{"name":"陳振宇","mobilePhone":"13268183361","country":"CHN","province":"Guangxi Zhuang Autonomous Region","city":"Fangchenggang City","district":"Fangcheng","address":"Test street 123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"58f95d8ee394eb6a08739371","updatedAt":"2017-04-21T01:17:02.854Z","createdAt":"2017-04-21T01:17:02.854Z","refId":"30123","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1492737415821","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","discountItems":[],"__v":0,"paymentType":"wxpay","paidAt":"2017-04-21T01:20:26.355Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":5,"totalCost":5,"affiliateCost":0,"serviceCost":0,"subtotal":5,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58f95d8ee394eb6a08739372","price":5,"productOption":{"purchased":9,"_id":"57fc5b5563468d542306e7dd","name":{"en":"Option 1","zh":"Option 1"},"price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-8},"productOptionId":"57fc5b5563468d542306e7dd","quantity":1,"product":{"price":5,"originalPrice":0,"status":"private","tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":35,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":55194,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73.jpg","height":466,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg","maxHeight":780,"maxWidth":780,"height":519,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-large.jpg","maxHeight":1040,"maxWidth":1040,"height":692,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"purchased":9,"_id":"57fc5b5563468d542306e7dd","name":"Option 1","price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-8},{"_id":"57fc5b5563468d542306e7dc","name":"Option 2","price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-23,"purchased":23}],"inOrders":[],"shippingCosts":[],"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":238592,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5.jpg","height":700,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test 1","zh":"Test 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-03-16T09:52:31.863Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","name":{"zh":"Test 1","en":"Test 1"}}],"shippingAddress":{"name":"陳振宇","mobilePhone":"13268183361","country":"CHN","province":"Guangxi Zhuang Autonomous Region","city":"Fangchenggang City","district":"Fangcheng","address":"Test street 123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"58f8b9d3e908aa7fe06d1954","updatedAt":"2017-04-20T13:38:27.571Z","createdAt":"2017-04-20T13:38:27.571Z","refId":"30122","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1492695500759","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","discountItems":[],"__v":0,"paymentType":"wxpay","paidAt":"2017-04-20T13:38:39.704Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":5,"totalCost":5,"affiliateCost":0,"serviceCost":0,"subtotal":5,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58f8b9d3e908aa7fe06d1955","price":5,"productOption":{"purchased":8,"_id":"57fc5b5563468d542306e7dd","name":{"en":"Option 1","zh":"Option 1"},"price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-7},"productOptionId":"57fc5b5563468d542306e7dd","quantity":1,"product":{"price":5,"originalPrice":0,"status":"private","tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":34,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":55194,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73.jpg","height":466,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg","maxHeight":780,"maxWidth":780,"height":519,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-large.jpg","maxHeight":1040,"maxWidth":1040,"height":692,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"purchased":8,"_id":"57fc5b5563468d542306e7dd","name":"Option 1","price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-7},{"_id":"57fc5b5563468d542306e7dc","name":"Option 2","price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-23,"purchased":23}],"inOrders":[],"shippingCosts":[],"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":238592,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5.jpg","height":700,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test 1","zh":"Test 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-03-16T09:52:31.863Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","name":{"zh":"Test 1","en":"Test 1"}}],"shippingAddress":{"name":"陳振宇","mobilePhone":"13268183361","country":"CHN","province":"Guangxi Zhuang Autonomous Region","city":"Fangchenggang City","district":"Fangcheng","address":"Test street 123","mobilePhoneCountry":"+86","postalCode":""},"status":"open"},{"_id":"58bf7b33c6c0c20b22244198","updatedAt":"2017-03-08T03:32:03.394Z","createdAt":"2017-03-08T03:32:03.394Z","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1488943919582","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","refId":"30113","__v":0,"paymentType":"wxpay","paidAt":"2017-03-08T03:32:26.706Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":6,"totalCost":6,"affiliateCost":0,"serviceCost":0,"subtotal":6,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58bf7b33c6c0c20b2224419a","product":{"description":{"html":"<h1 id=\"abc\">ABC<\/h1>\n<ol>\n<li>one<\/li>\n<li>two<\/li>\n<li>three<\/li>\n<\/ol>\n<p>more more more<\/p>\n<p><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg\" width=\"100%\" /><\/p>\n<p><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg\" width=\"100%\" /><\/p>","md":"<h1 id=\"abc\">ABC<\/h1>\n<ol>\n<li>one<\/li>\n<li>two<\/li>\n<li>three<\/li>\n<\/ol>\n<p>more more more<\/p>\n<p><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg\" width=\"100%\" /><\/p>\n<p><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg\" width=\"100%\" /><\/p>"},"price":1,"originalPrice":2000,"status":"private","tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"limited","purchased":4,"type":"default","liked":1,"commented":0,"gallery":[],"imageDescription":[],"rafflePurchasedTickets":[],"productOptions":[],"inOrders":[],"shippingCosts":[],"isDiscounted":true,"maxQuantity":2,"onlineAt":"2016-11-21T16:00:43.544Z","metaDescription":"Haha","weixinShareTitle":"ttitle","weixinShareDescription":"body","oneBuyPerCustomer":false,"image":{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":46285,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95.jpg","height":560,"width":560},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg"},"publishedAt":"2016-10-14T02:13:05.613Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"campaignStatus":"started","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test 2","zh":"Test 2"},"slug":"test-2","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2017-03-03T06:46:54.843Z","_id":"57fc5bc263468d542306e7de"},"productId":"57fc5bc263468d542306e7de","price":1,"quantity":1,"name":{"zh":"Test 2","en":"Test 2"}},{"_id":"58bf7b33c6c0c20b22244199","productOption":{"maxQuantity":-4,"inventoryPolicy":"unlimited","status":"active","price":5,"name":{"en":"Option 1","zh":"Option 1"},"_id":"57fc5b5563468d542306e7dd","purchased":5},"productOptionId":"57fc5b5563468d542306e7dd","product":{"price":5,"originalPrice":0,"status":"private","tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":27,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":55194,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73.jpg","height":466,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg","maxHeight":780,"maxWidth":780,"height":519,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-large.jpg","maxHeight":1040,"maxWidth":1040,"height":692,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"maxQuantity":-4,"inventoryPolicy":"unlimited","status":"active","price":5,"name":"Option 1","_id":"57fc5b5563468d542306e7dd","purchased":5},{"purchased":19,"maxQuantity":-19,"status":"active","inventoryPolicy":"unlimited","price":1,"name":"Option 2","_id":"57fc5b5563468d542306e7dc"}],"inOrders":[],"shippingCosts":[],"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":238592,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5.jpg","height":700,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test 1","zh":"Test 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-03-03T06:30:02.218Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","price":5,"quantity":1,"name":{"zh":"Test 1","en":"Test 1"}}],"shippingAddress":{"name":"Calvin Chan","mobilePhone":"13268183361","country":"CHN","province":"Beijing Province","city":"City area","district":"Dongcheng District","address":"某小街678号","postalCode":"00000","mobilePhoneCountry":"+86"},"status":"open"},{"_id":"58b9124ec6c0c20b2224418d","updatedAt":"2017-08-15T08:59:07.500Z","createdAt":"2017-03-03T06:50:54.196Z","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1488523823622","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","refId":"30112","__v":0,"paymentType":"wxpay","paidAt":"2017-03-03T06:51:22.901Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":2,"totalCost":2,"affiliateCost":0,"serviceCost":0,"subtotal":2,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58b9124ec6c0c20b2224418e","product":{"description":{"html":"<h1 id=\"abc\">ABC<\/h1>\n<ol>\n<li>one<\/li>\n<li>two<\/li>\n<li>three<\/li>\n<\/ol>\n<p>more more more<\/p>\n<p><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg\" width=\"100%\" /><\/p>\n<p><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg\" width=\"100%\" /><\/p>","md":"<h1 id=\"abc\">ABC<\/h1>\n<ol>\n<li>one<\/li>\n<li>two<\/li>\n<li>three<\/li>\n<\/ol>\n<p>more more more<\/p>\n<p><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg\" width=\"100%\" /><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg\" width=\"100%\" /><\/p>\n<p><img src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg\" width=\"100%\" /><\/p>"},"price":1,"originalPrice":2000,"status":"private","tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"limited","purchased":2,"type":"default","liked":0,"commented":0,"gallery":[],"imageDescription":[],"rafflePurchasedTickets":[],"productOptions":[],"inOrders":[],"shippingCosts":[],"isDiscounted":true,"maxQuantity":4,"onlineAt":"2016-11-21T16:00:43.544Z","metaDescription":"Haha","weixinShareTitle":"ttitle","weixinShareDescription":"body","oneBuyPerCustomer":false,"image":{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":46285,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95.jpg","height":560,"width":560},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/2a533983-390b-42f6-8000-42140d963d95-medium.jpg"},"publishedAt":"2016-10-14T02:13:05.613Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"campaignStatus":"started","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test 2","zh":"Test 2"},"slug":"test-2","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2017-03-03T06:46:54.843Z","_id":"57fc5bc263468d542306e7de"},"productId":"57fc5bc263468d542306e7de","price":1,"quantity":2,"name":{"zh":"Test 2","en":"Test 2"}}],"shippingAddress":{"name":"Calvin Chan","mobilePhone":"13268183361","country":"CHN","province":"Beijing Province","city":"City area","district":"Dongcheng District","address":"某小街678号","postalCode":"00000","mobilePhoneCountry":"+86"},"status":"open"},{"_id":"58a8497c4338d87f7f70fad5","updatedAt":"2017-08-15T09:02:32.259Z","createdAt":"2017-02-18T13:17:48.533Z","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1487423866614","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","refId":"30087","__v":0,"paymentType":"wxpay","paidAt":"2017-02-18T13:17:59.289Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":3,"totalCost":3,"affiliateCost":0,"serviceCost":1,"subtotal":3,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58a8497c4338d87f7f70fad6","productOption":{"_id":"57fc5b5563468d542306e7dc","name":{"en":"Option 2","zh":"Option 2"},"price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-16,"purchased":16},"productOptionId":"57fc5b5563468d542306e7dc","product":{"price":5,"originalPrice":0,"status":"private","tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":24,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":55194,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73.jpg","height":466,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg","maxHeight":780,"maxWidth":780,"height":519,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-large.jpg","maxHeight":1040,"maxWidth":1040,"height":692,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"purchased":5,"_id":"57fc5b5563468d542306e7dd","name":"Option 1","price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-4},{"_id":"57fc5b5563468d542306e7dc","name":"Option 2","price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-16,"purchased":16}],"inOrders":[],"shippingCosts":[],"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":238592,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5.jpg","height":700,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test Product 1","zh":"Test Product 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-02-18T11:15:43.613Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","price":1,"quantity":3,"name":{"zh":"Test Product 1","en":"Test Product 1"}}],"shippingAddress":{"name":"Test 2","mobilePhone":"13268183361","country":"CHN","province":"安徽省","city":"合肥市","district":"瑶海区","address":"haha street","postalCode":"00000","mobilePhoneCountry":"+86"},"status":"open"},{"_id":"58a835a04338d87f7f70facc","updatedAt":"2017-08-15T09:02:23.318Z","createdAt":"2017-02-18T11:53:04.887Z","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1487418782375","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","refId":"30086","__v":0,"paymentType":"wxpay","paidAt":"2017-02-18T11:53:18.899Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":2,"totalCost":2,"affiliateCost":0,"serviceCost":1,"subtotal":2,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58a835a04338d87f7f70facd","productOption":{"_id":"57fc5b5563468d542306e7dc","name":{"en":"Option 2","zh":"Option 2"},"price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-14,"purchased":14},"productOptionId":"57fc5b5563468d542306e7dc","product":{"price":5,"originalPrice":0,"status":"private","tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":22,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":55194,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73.jpg","height":466,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg","maxHeight":780,"maxWidth":780,"height":519,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-large.jpg","maxHeight":1040,"maxWidth":1040,"height":692,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"purchased":5,"_id":"57fc5b5563468d542306e7dd","name":"Option 1","price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-4},{"_id":"57fc5b5563468d542306e7dc","name":"Option 2","price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-14,"purchased":14}],"inOrders":[],"shippingCosts":[],"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":238592,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5.jpg","height":700,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test Product 1","zh":"Test Product 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-02-18T11:15:43.613Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","price":1,"quantity":2,"name":{"zh":"Test Product 1","en":"Test Product 1"}}],"shippingAddress":{"name":"Test 2","mobilePhone":"13268183361","country":"CHN","province":"安徽省","city":"合肥市","district":"瑶海区","address":"haha street","postalCode":"00000","mobilePhoneCountry":"+86"},"status":"open"},{"_id":"58a831d74338d87f7f70fac3","updatedAt":"2017-08-15T09:02:10.114Z","createdAt":"2017-02-18T11:36:55.880Z","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1487417814808","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","refId":"30085","__v":0,"paymentType":"wxpay","paidAt":"2017-02-18T11:37:09.219Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":1,"totalCost":1,"affiliateCost":0,"serviceCost":1,"subtotal":1,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58a831d74338d87f7f70fac4","productOption":{"_id":"57fc5b5563468d542306e7dc","name":{"en":"Option 2","zh":"Option 2"},"price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-13,"purchased":13},"productOptionId":"57fc5b5563468d542306e7dc","product":{"price":5,"originalPrice":0,"status":"private","tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":21,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":55194,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73.jpg","height":466,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg","maxHeight":780,"maxWidth":780,"height":519,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-large.jpg","maxHeight":1040,"maxWidth":1040,"height":692,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"purchased":5,"_id":"57fc5b5563468d542306e7dd","name":"Option 1","price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-4},{"_id":"57fc5b5563468d542306e7dc","name":"Option 2","price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-13,"purchased":13}],"inOrders":[],"shippingCosts":[],"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":238592,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5.jpg","height":700,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test Product 1","zh":"Test Product 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-02-18T11:15:43.613Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","price":1,"quantity":1,"name":{"zh":"Test Product 1","en":"Test Product 1"}}],"shippingAddress":{"name":"Test 2","mobilePhone":"13268183361","country":"CHN","province":"安徽省","city":"合肥市","district":"瑶海区","address":"haha street","postalCode":"00000","mobilePhoneCountry":"+86"},"status":"open"},{"_id":"58a82e5fbdc6175f22b0511a","updatedAt":"2017-08-15T09:01:59.348Z","createdAt":"2017-02-18T11:22:07.174Z","store":{"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}},"customer":"57c4ecc8cc4f36bc2c12ab28","nonce":"1484883568340","type":"default","shippingType":"regular","note":"","paymentStatus":"failed_refund","shippingStatus":"unshipped","refId":"30084","__v":0,"paymentType":"wxpay","paidAt":"2017-02-18T11:28:59.075Z","ignoreCheck":true,"pickUpPlace":{"serviceHours":[],"images":[]},"totalRefunded":0,"totalPaid":5,"totalCost":5,"affiliateCost":0,"serviceCost":1,"subtotal":5,"discount":0,"credit":0,"taxRate":0,"taxCost":0,"shippingCost":0,"discountItem":{"itemIndexes":[]},"items":[{"_id":"58a82e5fbdc6175f22b0511b","productOption":{"purchased":4,"_id":"57fc5b5563468d542306e7dd","name":{"en":"Option 1","zh":"Option 1"},"price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-3},"productOptionId":"57fc5b5563468d542306e7dd","product":{"price":5,"originalPrice":0,"status":"private","tags":[],"materials":[],"categories":[],"groups":[],"inventoryPolicy":"unlimited","purchased":20,"type":"default","liked":0,"commented":0,"gallery":[{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":55194,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73.jpg","height":466,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg","maxHeight":780,"maxWidth":780,"height":519,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-large.jpg","maxHeight":1040,"maxWidth":1040,"height":692,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/dd728916-860f-40ec-b393-8fb388c46f73-medium.jpg"}],"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"rafflePurchasedTickets":[],"productOptions":[{"purchased":4,"_id":"57fc5b5563468d542306e7dd","name":"Option 1","price":5,"status":"active","inventoryPolicy":"unlimited","maxQuantity":-3},{"_id":"57fc5b5563468d542306e7dc","name":"Option 2","price":1,"inventoryPolicy":"unlimited","status":"active","maxQuantity":-13,"purchased":13}],"inOrders":[{"_id":"58a82db2bdc6175f22b05117","order":"58a82db2bdc6175f22b05114","quantity":1,"createdAt":"2017-02-18T11:19:14.869Z","customer":"57c4ecc8cc4f36bc2c12ab28","productOption":"57fc5b5563468d542306e7dd"}],"shippingCosts":[],"oneBuyPerCustomer":false,"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"original":{"orientation":"","colorspace":"RGB","format":"JPEG","size":238592,"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5.jpg","height":700,"width":700},"thumb":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-thumb.jpg","maxHeight":320,"height":320,"width":320,"format":"jpg","aspect":"1:1"},"medium":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg","maxHeight":780,"maxWidth":780,"height":780,"width":780,"format":"jpg"},"large":{"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-large.jpg","maxHeight":1040,"maxWidth":1040,"height":1040,"width":1040,"format":"jpg"},"url":"https://s3-ap-southeast-1.amazonaws.com/sjhuo-ecomm-resources-1/images/929a39c8-7954-4228-9cf5-27d3cdf8fff5-medium.jpg"},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"quantity":0,"translationStatus":"draft","store":"57c4ed03cc4f36bc2c12ab29","name":{"en":"Test Product 1","zh":"Test Product 1"},"slug":"test-1","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2017-02-18T11:15:43.613Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"productId":"57c4ed25cc4f36bc2c12ab2b","price":5,"quantity":1,"name":{"zh":"Test Product 1","en":"Test Product 1"}}],"shippingAddress":{"name":"Test 2","mobilePhone":"13268183361","country":"CHN","province":"安徽省","city":"合肥市","district":"瑶海区","address":"haha street","postalCode":"00000","mobilePhoneCountry":"+86"},"status":"open"}]
     * currentPage : 1
     * totalPages : 2
     * pages : [1,2]
     * previous : false
     * next : 2
     * first : 1
     * last : 20
     */

    private int total;
    private int currentPage;
    private int totalPages;
    private int previous;
    private int next;
    private int first;
    private int last;
    private List<Results> results;
    private List<Integer> pages;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int isPrevious() {
        return previous;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public List<Integer> getPages() {
        return pages;
    }

    public void setPages(List<Integer> pages) {
        this.pages = pages;
    }

    public static class Results {
        /**
         * _id : 5aab841d8f0b8358b622bb39
         * createdAt : 2018-03-16T08:45:17.759Z
         * updatedAt : 2018-03-21T13:54:24.799Z
         * refId : 30904
         * store : {"_id":"57c4ed03cc4f36bc2c12ab29","slug":"guzzu","name":{"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}}
         * customer : 57c4ecc8cc4f36bc2c12ab28
         * clientType : web
         * nonce : 1519459637216
         * type : default
         * shippingType : regular
         * note :
         * paymentStatus : paid
         * shippingStatus : unshipped
         * __v : 1
         * paidAt : 2018-03-16T08:45:33.485Z
         * paymentType : wxpay
         * isArchived : false
         * pickUpPlace : {"serviceHours":[],"images":[]}
         * totalRefunded : 0
         * totalPaid : 4
         * totalCost : 4
         * affiliateCost : 0
         * serviceCost : 0
         * subtotal : 4
         * discount : 0
         * credit : 0
         * taxRate : 0
         * taxCost : 0
         * shippingCost : 0
         * discountItem : {"itemIndexes":[]}
         * items : [{"productId":"57c4ed25cc4f36bc2c12ab2b","product":{"slug":"test-1","name":{"en":"Test Product A","zh":"測試商品A（不发货，不退款）"},"description":{"en":"<p><strong>Notes to merchant<\/strong><\/p>\n<p>1. This is a Test Product. It will not be shipped or refunded.<\/p>\n<p>2. You can update the details or safely delete this item from your catalog.<\/p>\n<p><strong>【特别提醒】<\/strong><\/p>\n<p>1. 测试商品，不发货，不退款。<\/p>\n<p>2. 该商品可直接修改价格上架销售，或删除。<\/p>\n<p>&nbsp;<\/p>","zh":"<p><strong>Notes to merchant<\/strong><\/p>\n<p>1. This is a Test Product. It will not be shipped or refunded.<\/p>\n<p>2. You can update the details or safely delete this item from your catalog.<\/p>\n<p><strong>【特别提醒】<\/strong><\/p>\n<p>1. 测试商品，不发货，不退款。<\/p>\n<p>2. 该商品可直接修改价格上架销售，或删除。<\/p>"},"metaDescription":{"en":"Test 1","zh":"Test 1"},"weixinShareTitle":{"en":"測試商品（测试商品，不发货，不退款）","zh":"測試商品（测试商品，不发货，不退款）"},"weixinShareDescription":{"en":"測試商品（测试商品，不发货，不退款）","zh":"測試商品（测试商品，不发货，不退款）"},"gallery":[{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3.jpg","size":76493,"format":"JPEG","colorspace":"RGB","orientation":""}}],"productOptions":[],"inOrders":[],"shippingCosts":[{"country":"CHN","price":0,"_id":"5a966e5814d20f1f9184d8d7"}],"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"isArchived":false,"shippingRateTable":"5a010ca2c5cd406501a15710","shippingType":"default","sku":"TESTPRODUCT001","isDiscounted":true,"maxQuantity":0,"weight":499,"oneBuyPerCustomer":false,"groups":["5833f81bd499f8256e5ec795"],"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5.jpg","size":88166,"format":"JPEG","colorspace":"RGB","orientation":""}},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"price":1,"originalPrice":1000,"status":"published","tags":[],"materials":[],"categories":[],"inventoryPolicy":"unlimited","quantity":0,"type":"default","purchased":95,"translationStatus":"draft","liked":0,"commented":0,"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"store":"57c4ed03cc4f36bc2c12ab29","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2018-03-01T09:37:15.136Z","_id":"57c4ed25cc4f36bc2c12ab2b"},"quantity":1,"price":1,"_id":"5aab841d8f0b8358b622bb3b","name":{"en":"Test Product A","zh":"測試商品A（不发货，不退款）"}},{"productId":"57fc5bc263468d542306e7de","product":{"slug":"test-2","name":{"en":"Test Product B","zh":"测试商品B，仅供测试"},"description":{"en":"<p><img id=\"57fc5b3d63468d542306e7da\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg 780w\" width=\"780\" height=\"772\" /><img id=\"57fc5b3e63468d542306e7db\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg 780w\" width=\"780\" height=\"1009\" /><\/p>","zh":"<p><img id=\"57fc5b3d63468d542306e7da\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg 780w\" width=\"780\" height=\"772\" /><img id=\"57fc5b3e63468d542306e7db\" src=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg\" srcset=\"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg 780w\" width=\"780\" height=\"1009\" /><\/p>"},"metaDescription":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"weixinShareTitle":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"weixinShareDescription":{"en":"Test product for testing only 测试商品，仅供测试","zh":"Test product for testing only 测试商品，仅供测试"},"gallery":[{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/85e4ccf7-7783-4fe1-9ec5-beead243d5ec.jpg","size":79872,"format":"JPEG","colorspace":"RGB","orientation":""}}],"productOptions":[],"inOrders":[],"shippingCosts":[{"country":"CHN","price":0,"_id":"5a6824613670bb78d5d34b4a"}],"reviewCount":4,"ratingTotal":{"positive":4,"moderate":0,"negative":0},"isArchived":false,"shippingRateTable":"5a010ca2c5cd406501a15710","productSpec":"59796028fe105006138c7502","shippingType":"default","sku":"TESTPRODUCT002","weight":0,"isDiscounted":true,"maxQuantity":1,"onlineAt":"2016-11-21T16:00:43.544Z","oneBuyPerCustomer":false,"image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/1e227963-d1b5-489d-9c44-578e86b98bfb.jpg","size":91034,"format":"JPEG","colorspace":"RGB","orientation":""}},"publishedAt":"2017-03-10T07:05:37.466Z","campaignGoal":0,"campaignReceived":0,"publicUrl":"/test-store/test-2","__v":0,"price":1,"originalPrice":200,"status":"published","tags":[],"materials":[],"categories":[],"groups":["5833f81bd499f8256e5ec795"],"inventoryPolicy":"unlimited","purchased":109,"type":"default","campaignStatus":"started","liked":1,"commented":0,"imageDescription":[],"store":"57c4ed03cc4f36bc2c12ab29","createdAt":"2016-10-11T03:25:54.429Z","updatedAt":"2018-03-09T01:44:29.481Z","_id":"57fc5bc263468d542306e7de"},"quantity":3,"price":1,"_id":"5aab841d8f0b8358b622bb3a","name":{"en":"Test Product B","zh":"测试商品B，仅供测试"}}]
         * shippingAddress : {"name":"Calvin","mobilePhone":"13268183361","country":"CHN","province":"广东省","provinceId":"440000","city":"东莞市","cityId":"441900","district":"东莞市","districtId":"441900","address":"223創客谷516-2世界贷","mobilePhoneCountry":"+86","postalCode":"","street":"东城街道","streetId":"441900003"}
         * status : open
         * ignoreCheck : true
         * discountItems : []
         */

        private String _id;
        private String createdAt;
        private String updatedAt;
        private String refId;
        private Store store;
        private String customer;
        private String clientType;
        private String nonce;
        private String type;
        private String shippingType;
        private String note;
        private String paymentStatus;
        private String shippingStatus;
        private int __v;
        private String paidAt;
        private String paymentType;
        private boolean isArchived;
        private int totalRefunded;
        private int totalPaid;
        private int totalCost;
        private int affiliateCost;
        private int serviceCost;
        private int subtotal;
        private int discount;
        private int credit;
        private int taxRate;
        private int taxCost;
        private int shippingCost;
        private ShippingAddress shippingAddress;
        private String status;
        private boolean ignoreCheck;
        private List<Items> items;


        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getRefId() {
            return refId;
        }

        public void setRefId(String refId) {
            this.refId = refId;
        }

        public Store getStore() {
            return store;
        }

        public void setStore(Store store) {
            this.store = store;
        }

        public String getCustomer() {
            return customer;
        }

        public void setCustomer(String customer) {
            this.customer = customer;
        }

        public String getClientType() {
            return clientType;
        }

        public void setClientType(String clientType) {
            this.clientType = clientType;
        }

        public String getNonce() {
            return nonce;
        }

        public void setNonce(String nonce) {
            this.nonce = nonce;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getShippingType() {
            return shippingType;
        }

        public void setShippingType(String shippingType) {
            this.shippingType = shippingType;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getPaymentStatus() {
            return paymentStatus;
        }

        public void setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
        }

        public String getShippingStatus() {
            return shippingStatus;
        }

        public void setShippingStatus(String shippingStatus) {
            this.shippingStatus = shippingStatus;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public String getPaidAt() {
            return paidAt;
        }

        public void setPaidAt(String paidAt) {
            this.paidAt = paidAt;
        }

        public String getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(String paymentType) {
            this.paymentType = paymentType;
        }

        public boolean isIsArchived() {
            return isArchived;
        }

        public void setIsArchived(boolean isArchived) {
            this.isArchived = isArchived;
        }


        public int getTotalRefunded() {
            return totalRefunded;
        }

        public void setTotalRefunded(int totalRefunded) {
            this.totalRefunded = totalRefunded;
        }

        public int getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(int totalPaid) {
            this.totalPaid = totalPaid;
        }

        public int getTotalCost() {
            return totalCost;
        }

        public void setTotalCost(int totalCost) {
            this.totalCost = totalCost;
        }

        public int getAffiliateCost() {
            return affiliateCost;
        }

        public void setAffiliateCost(int affiliateCost) {
            this.affiliateCost = affiliateCost;
        }

        public int getServiceCost() {
            return serviceCost;
        }

        public void setServiceCost(int serviceCost) {
            this.serviceCost = serviceCost;
        }

        public int getSubtotal() {
            return subtotal;
        }

        public void setSubtotal(int subtotal) {
            this.subtotal = subtotal;
        }

        public int getDiscount() {
            return discount;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }

        public int getCredit() {
            return credit;
        }

        public void setCredit(int credit) {
            this.credit = credit;
        }

        public int getTaxRate() {
            return taxRate;
        }

        public void setTaxRate(int taxRate) {
            this.taxRate = taxRate;
        }

        public int getTaxCost() {
            return taxCost;
        }

        public void setTaxCost(int taxCost) {
            this.taxCost = taxCost;
        }

        public int getShippingCost() {
            return shippingCost;
        }

        public void setShippingCost(int shippingCost) {
            this.shippingCost = shippingCost;
        }


        public ShippingAddress getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(ShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public boolean isIgnoreCheck() {
            return ignoreCheck;
        }

        public void setIgnoreCheck(boolean ignoreCheck) {
            this.ignoreCheck = ignoreCheck;
        }

        public List<Items> getItems() {
            return items;
        }

        public void setItems(List<Items> items) {
            this.items = items;
        }


        public static class Store {
            /**
             * _id : 57c4ed03cc4f36bc2c12ab29
             * slug : guzzu
             * name : {"zh":"GUZZU Lab 测试店铺 (DEV)","en":"GUZZU Lab 测试店铺 (DEV)"}
             */

            private String _id;
            private String slug;
            private Name name;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public Name getName() {
                return name;
            }

            public void setName(Name name) {
                this.name = name;
            }

            public static class Name {
                /**
                 * zh : GUZZU Lab 测试店铺 (DEV)
                 * en : GUZZU Lab 测试店铺 (DEV)
                 */

                private String zh;
                private String en;

                public String getZh() {
                    return zh;
                }

                public void setZh(String zh) {
                    this.zh = zh;
                }

                public String getEn() {
                    return en;
                }

                public void setEn(String en) {
                    this.en = en;
                }
            }
        }

        }

        public static class ShippingAddress {
            /**
             * name : Calvin
             * mobilePhone : 13268183361
             * country : CHN
             * province : 广东省
             * provinceId : 440000
             * city : 东莞市
             * cityId : 441900
             * district : 东莞市
             * districtId : 441900
             * address : 223創客谷516-2世界贷
             * mobilePhoneCountry : +86
             * postalCode :
             * street : 东城街道
             * streetId : 441900003
             */

            private String name;
            private String mobilePhone;
            private String country;
            private String province;
            private String provinceId;
            private String city;
            private String cityId;
            private String district;
            private String districtId;
            private String address;
            private String mobilePhoneCountry;
            private String postalCode;
            private String street;
            private String streetId;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMobilePhone() {
                return mobilePhone;
            }

            public void setMobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvinceId() {
                return provinceId;
            }

            public void setProvinceId(String provinceId) {
                this.provinceId = provinceId;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCityId() {
                return cityId;
            }

            public void setCityId(String cityId) {
                this.cityId = cityId;
            }

            public String getDistrict() {
                return district;
            }

            public void setDistrict(String district) {
                this.district = district;
            }

            public String getDistrictId() {
                return districtId;
            }

            public void setDistrictId(String districtId) {
                this.districtId = districtId;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getMobilePhoneCountry() {
                return mobilePhoneCountry;
            }

            public void setMobilePhoneCountry(String mobilePhoneCountry) {
                this.mobilePhoneCountry = mobilePhoneCountry;
            }

            public String getPostalCode() {
                return postalCode;
            }

            public void setPostalCode(String postalCode) {
                this.postalCode = postalCode;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getStreetId() {
                return streetId;
            }

            public void setStreetId(String streetId) {
                this.streetId = streetId;
            }
        }

        public static class Items {
            /**
             * productId : 57c4ed25cc4f36bc2c12ab2b
             * product : {"slug":"test-1","name":{"en":"Test Product A","zh":"測試商品A（不发货，不退款）"},"description":{"en":"<p><strong>Notes to merchant<\/strong><\/p>\n<p>1. This is a Test Product. It will not be shipped or refunded.<\/p>\n<p>2. You can update the details or safely delete this item from your catalog.<\/p>\n<p><strong>【特别提醒】<\/strong><\/p>\n<p>1. 测试商品，不发货，不退款。<\/p>\n<p>2. 该商品可直接修改价格上架销售，或删除。<\/p>\n<p>&nbsp;<\/p>","zh":"<p><strong>Notes to merchant<\/strong><\/p>\n<p>1. This is a Test Product. It will not be shipped or refunded.<\/p>\n<p>2. You can update the details or safely delete this item from your catalog.<\/p>\n<p><strong>【特别提醒】<\/strong><\/p>\n<p>1. 测试商品，不发货，不退款。<\/p>\n<p>2. 该商品可直接修改价格上架销售，或删除。<\/p>"},"metaDescription":{"en":"Test 1","zh":"Test 1"},"weixinShareTitle":{"en":"測試商品（测试商品，不发货，不退款）","zh":"測試商品（测试商品，不发货，不退款）"},"weixinShareDescription":{"en":"測試商品（测试商品，不发货，不退款）","zh":"測試商品（测试商品，不发货，不退款）"},"gallery":[{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3.jpg","size":76493,"format":"JPEG","colorspace":"RGB","orientation":""}}],"productOptions":[],"inOrders":[],"shippingCosts":[{"country":"CHN","price":0,"_id":"5a966e5814d20f1f9184d8d7"}],"reviewCount":0,"ratingTotal":{"positive":0,"moderate":0,"negative":0},"isArchived":false,"shippingRateTable":"5a010ca2c5cd406501a15710","shippingType":"default","sku":"TESTPRODUCT001","isDiscounted":true,"maxQuantity":0,"weight":499,"oneBuyPerCustomer":false,"groups":["5833f81bd499f8256e5ec795"],"campaignGoal":0,"campaignReceived":0,"campaignStatus":"rejected","image":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5.jpg","size":88166,"format":"JPEG","colorspace":"RGB","orientation":""}},"publishedAt":"2016-08-30T02:48:18.664Z","publicUrl":"/test-store/test-1","__v":0,"price":1,"originalPrice":1000,"status":"published","tags":[],"materials":[],"categories":[],"inventoryPolicy":"unlimited","quantity":0,"type":"default","purchased":95,"translationStatus":"draft","liked":0,"commented":0,"imageDescription":[{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}],"store":"57c4ed03cc4f36bc2c12ab29","createdAt":"2016-08-30T02:19:17.540Z","updatedAt":"2018-03-01T09:37:15.136Z","_id":"57c4ed25cc4f36bc2c12ab2b"}
             * quantity : 1
             * price : 1
             * _id : 5aab841d8f0b8358b622bb3b
             * name : {"en":"Test Product A","zh":"測試商品A（不发货，不退款）"}
             */

            private String productId;
            private Product product;
            private int quantity;
            private int price;
            private String _id;
            private NameXX name;

            public String getProductId() {
                return productId;
            }

            public void setProductId(String productId) {
                this.productId = productId;
            }

            public Product getProduct() {
                return product;
            }

            public void setProduct(Product product) {
                this.product = product;
            }

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public NameXX getName() {
                return name;
            }

            public void setName(NameXX name) {
                this.name = name;
            }

            public static class Product {
                /**
                 * slug : test-1
                 * name : {"en":"Test Product A","zh":"測試商品A（不发货，不退款）"}
                 * description : {"en":"<p><strong>Notes to merchant<\/strong><\/p>\n<p>1. This is a Test Product. It will not be shipped or refunded.<\/p>\n<p>2. You can update the details or safely delete this item from your catalog.<\/p>\n<p><strong>【特别提醒】<\/strong><\/p>\n<p>1. 测试商品，不发货，不退款。<\/p>\n<p>2. 该商品可直接修改价格上架销售，或删除。<\/p>\n<p>&nbsp;<\/p>","zh":"<p><strong>Notes to merchant<\/strong><\/p>\n<p>1. This is a Test Product. It will not be shipped or refunded.<\/p>\n<p>2. You can update the details or safely delete this item from your catalog.<\/p>\n<p><strong>【特别提醒】<\/strong><\/p>\n<p>1. 测试商品，不发货，不退款。<\/p>\n<p>2. 该商品可直接修改价格上架销售，或删除。<\/p>"}
                 * metaDescription : {"en":"Test 1","zh":"Test 1"}
                 * weixinShareTitle : {"en":"測試商品（测试商品，不发货，不退款）","zh":"測試商品（测试商品，不发货，不退款）"}
                 * weixinShareDescription : {"en":"測試商品（测试商品，不发货，不退款）","zh":"測試商品（测试商品，不发货，不退款）"}
                 * gallery : [{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3.jpg","size":76493,"format":"JPEG","colorspace":"RGB","orientation":""}}]
                 * productOptions : []
                 * inOrders : []
                 * shippingCosts : [{"country":"CHN","price":0,"_id":"5a966e5814d20f1f9184d8d7"}]
                 * reviewCount : 0
                 * ratingTotal : {"positive":0,"moderate":0,"negative":0}
                 * isArchived : false
                 * shippingRateTable : 5a010ca2c5cd406501a15710
                 * shippingType : default
                 * sku : TESTPRODUCT001
                 * isDiscounted : true
                 * maxQuantity : 0
                 * weight : 499
                 * oneBuyPerCustomer : false
                 * groups : ["5833f81bd499f8256e5ec795"]
                 * campaignGoal : 0
                 * campaignReceived : 0
                 * campaignStatus : rejected
                 * image : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg","large":{"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-large.jpg"},"medium":{"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg"},"thumb":{"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-thumb.jpg"},"original":{"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5.jpg","size":88166,"format":"JPEG","colorspace":"RGB","orientation":""}}
                 * publishedAt : 2016-08-30T02:48:18.664Z
                 * publicUrl : /test-store/test-1
                 * __v : 0
                 * price : 1
                 * originalPrice : 1000
                 * status : published
                 * tags : []
                 * materials : []
                 * categories : []
                 * inventoryPolicy : unlimited
                 * quantity : 0
                 * type : default
                 * purchased : 95
                 * translationStatus : draft
                 * liked : 0
                 * commented : 0
                 * imageDescription : [{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":215040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185.jpg","height":772,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-thumb.jpg","maxHeight":320,"height":320,"width":323,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg","maxWidth":780,"height":772,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-large.jpg","maxWidth":1040,"height":1029,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a511427b-b14c-4cc0-86d9-3fe638412185-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":291840,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd.jpg","height":1009,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-thumb.jpg","maxHeight":320,"height":320,"width":247,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg","maxWidth":780,"height":1009,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-large.jpg","maxWidth":1040,"height":1345,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/29619a68-3444-406d-8dd9-82e06d8481cd-medium.jpg"},{"original":{"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":139264,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53.jpg","height":944,"width":780},"thumb":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-thumb.jpg","maxHeight":320,"height":320,"width":264,"format":"jpg"},"medium":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg","maxWidth":780,"height":944,"width":780,"format":"jpg"},"large":{"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-large.jpg","maxWidth":1040,"height":1259,"width":1040,"format":"jpg"},"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/63665d95-e08a-4fc8-8bd0-dfd2bf35fb53-medium.jpg"}]
                 * store : 57c4ed03cc4f36bc2c12ab29
                 * createdAt : 2016-08-30T02:19:17.540Z
                 * updatedAt : 2018-03-01T09:37:15.136Z
                 * _id : 57c4ed25cc4f36bc2c12ab2b
                 */

                private String slug;
                private NameX name;
                private int reviewCount;
                private RatingTotal ratingTotal;
                private boolean isArchived;
                private String shippingRateTable;
                private String shippingType;
                private String sku;
                private boolean isDiscounted;
                private int maxQuantity;
                private int weight;
                private boolean oneBuyPerCustomer;
                private int campaignGoal;
                private int campaignReceived;
                private String campaignStatus;
                private Image image;
                private String publishedAt;
                private String publicUrl;
                private int __v;
                private int price;
                private int originalPrice;
                private String status;
                private String inventoryPolicy;
                private int quantity;
                private String type;
                private int purchased;
                private String translationStatus;
                private int liked;
                private int commented;
                private String store;
                private String createdAt;
                private String updatedAt;
                private String _id;
                private List<Gallery> gallery;
                private List<ShippingCosts> shippingCosts;
                private List<String> groups;
                private List<ImageDescription> imageDescription;

                public String getSlug() {
                    return slug;
                }

                public void setSlug(String slug) {
                    this.slug = slug;
                }

                public NameX getName() {
                    return name;
                }

                public void setName(NameX name) {
                    this.name = name;
                }

                public int getReviewCount() {
                    return reviewCount;
                }

                public void setReviewCount(int reviewCount) {
                    this.reviewCount = reviewCount;
                }

                public RatingTotal getRatingTotal() {
                    return ratingTotal;
                }

                public void setRatingTotal(RatingTotal ratingTotal) {
                    this.ratingTotal = ratingTotal;
                }

                public boolean isIsArchived() {
                    return isArchived;
                }

                public void setIsArchived(boolean isArchived) {
                    this.isArchived = isArchived;
                }

                public String getShippingRateTable() {
                    return shippingRateTable;
                }

                public void setShippingRateTable(String shippingRateTable) {
                    this.shippingRateTable = shippingRateTable;
                }

                public String getShippingType() {
                    return shippingType;
                }

                public void setShippingType(String shippingType) {
                    this.shippingType = shippingType;
                }

                public String getSku() {
                    return sku;
                }

                public void setSku(String sku) {
                    this.sku = sku;
                }

                public boolean isIsDiscounted() {
                    return isDiscounted;
                }

                public void setIsDiscounted(boolean isDiscounted) {
                    this.isDiscounted = isDiscounted;
                }

                public int getMaxQuantity() {
                    return maxQuantity;
                }

                public void setMaxQuantity(int maxQuantity) {
                    this.maxQuantity = maxQuantity;
                }

                public int getWeight() {
                    return weight;
                }

                public void setWeight(int weight) {
                    this.weight = weight;
                }

                public boolean isOneBuyPerCustomer() {
                    return oneBuyPerCustomer;
                }

                public void setOneBuyPerCustomer(boolean oneBuyPerCustomer) {
                    this.oneBuyPerCustomer = oneBuyPerCustomer;
                }

                public int getCampaignGoal() {
                    return campaignGoal;
                }

                public void setCampaignGoal(int campaignGoal) {
                    this.campaignGoal = campaignGoal;
                }

                public int getCampaignReceived() {
                    return campaignReceived;
                }

                public void setCampaignReceived(int campaignReceived) {
                    this.campaignReceived = campaignReceived;
                }

                public String getCampaignStatus() {
                    return campaignStatus;
                }

                public void setCampaignStatus(String campaignStatus) {
                    this.campaignStatus = campaignStatus;
                }

                public Image getImage() {
                    return image;
                }

                public void setImage(Image image) {
                    this.image = image;
                }

                public String getPublishedAt() {
                    return publishedAt;
                }

                public void setPublishedAt(String publishedAt) {
                    this.publishedAt = publishedAt;
                }

                public String getPublicUrl() {
                    return publicUrl;
                }

                public void setPublicUrl(String publicUrl) {
                    this.publicUrl = publicUrl;
                }

                public int get__v() {
                    return __v;
                }

                public void set__v(int __v) {
                    this.__v = __v;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getOriginalPrice() {
                    return originalPrice;
                }

                public void setOriginalPrice(int originalPrice) {
                    this.originalPrice = originalPrice;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getInventoryPolicy() {
                    return inventoryPolicy;
                }

                public void setInventoryPolicy(String inventoryPolicy) {
                    this.inventoryPolicy = inventoryPolicy;
                }

                public int getQuantity() {
                    return quantity;
                }

                public void setQuantity(int quantity) {
                    this.quantity = quantity;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getPurchased() {
                    return purchased;
                }

                public void setPurchased(int purchased) {
                    this.purchased = purchased;
                }

                public String getTranslationStatus() {
                    return translationStatus;
                }

                public void setTranslationStatus(String translationStatus) {
                    this.translationStatus = translationStatus;
                }

                public int getLiked() {
                    return liked;
                }

                public void setLiked(int liked) {
                    this.liked = liked;
                }

                public int getCommented() {
                    return commented;
                }

                public void setCommented(int commented) {
                    this.commented = commented;
                }

                public String getStore() {
                    return store;
                }

                public void setStore(String store) {
                    this.store = store;
                }

                public String getCreatedAt() {
                    return createdAt;
                }

                public void setCreatedAt(String createdAt) {
                    this.createdAt = createdAt;
                }

                public String getUpdatedAt() {
                    return updatedAt;
                }

                public void setUpdatedAt(String updatedAt) {
                    this.updatedAt = updatedAt;
                }

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }

                public List<Gallery> getGallery() {
                    return gallery;
                }

                public void setGallery(List<Gallery> gallery) {
                    this.gallery = gallery;
                }


                public List<ShippingCosts> getShippingCosts() {
                    return shippingCosts;
                }

                public void setShippingCosts(List<ShippingCosts> shippingCosts) {
                    this.shippingCosts = shippingCosts;
                }

                public List<String> getGroups() {
                    return groups;
                }

                public void setGroups(List<String> groups) {
                    this.groups = groups;
                }


                public List<ImageDescription> getImageDescription() {
                    return imageDescription;
                }

                public void setImageDescription(List<ImageDescription> imageDescription) {
                    this.imageDescription = imageDescription;
                }

                public static class NameX {
                    /**
                     * en : Test Product A
                     * zh : 測試商品A（不发货，不退款）
                     */

                    private String en;
                    private String zh;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                    public String getZh() {
                        return zh;
                    }

                    public void setZh(String zh) {
                        this.zh = zh;
                    }
                }

                public static class Description {
                    /**
                     * en : <p><strong>Notes to merchant</strong></p>
                     <p>1. This is a Test Product. It will not be shipped or refunded.</p>
                     <p>2. You can update the details or safely delete this item from your catalog.</p>
                     <p><strong>【特别提醒】</strong></p>
                     <p>1. 测试商品，不发货，不退款。</p>
                     <p>2. 该商品可直接修改价格上架销售，或删除。</p>
                     <p>&nbsp;</p>
                     * zh : <p><strong>Notes to merchant</strong></p>
                     <p>1. This is a Test Product. It will not be shipped or refunded.</p>
                     <p>2. You can update the details or safely delete this item from your catalog.</p>
                     <p><strong>【特别提醒】</strong></p>
                     <p>1. 测试商品，不发货，不退款。</p>
                     <p>2. 该商品可直接修改价格上架销售，或删除。</p>
                     */

                    private String en;
                    private String zh;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                    public String getZh() {
                        return zh;
                    }

                    public void setZh(String zh) {
                        this.zh = zh;
                    }
                }

                public static class MetaDescription {
                    /**
                     * en : Test 1
                     * zh : Test 1
                     */

                    private String en;
                    private String zh;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                    public String getZh() {
                        return zh;
                    }

                    public void setZh(String zh) {
                        this.zh = zh;
                    }
                }

                public static class WeixinShareTitle {
                    /**
                     * en : 測試商品（测试商品，不发货，不退款）
                     * zh : 測試商品（测试商品，不发货，不退款）
                     */

                    private String en;
                    private String zh;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                    public String getZh() {
                        return zh;
                    }

                    public void setZh(String zh) {
                        this.zh = zh;
                    }
                }

                public static class WeixinShareDescription {
                    /**
                     * en : 測試商品（测试商品，不发货，不退款）
                     * zh : 測試商品（测试商品，不发货，不退款）
                     */

                    private String en;
                    private String zh;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                    public String getZh() {
                        return zh;
                    }

                    public void setZh(String zh) {
                        this.zh = zh;
                    }
                }

                public static class RatingTotal {
                    /**
                     * positive : 0
                     * moderate : 0
                     * negative : 0
                     */

                    private int positive;
                    private int moderate;
                    private int negative;

                    public int getPositive() {
                        return positive;
                    }

                    public void setPositive(int positive) {
                        this.positive = positive;
                    }

                    public int getModerate() {
                        return moderate;
                    }

                    public void setModerate(int moderate) {
                        this.moderate = moderate;
                    }

                    public int getNegative() {
                        return negative;
                    }

                    public void setNegative(int negative) {
                        this.negative = negative;
                    }
                }

                public static class Image {
                    /**
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg
                     * large : {"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-large.jpg"}
                     * medium : {"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg"}
                     * thumb : {"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-thumb.jpg"}
                     * original : {"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5.jpg","size":88166,"format":"JPEG","colorspace":"RGB","orientation":""}
                     */

                    private String url;
                    private Large large;
                    private Medium medium;
                    private Thumb thumb;
                    private Original original;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public Large getLarge() {
                        return large;
                    }

                    public void setLarge(Large large) {
                        this.large = large;
                    }

                    public Medium getMedium() {
                        return medium;
                    }

                    public void setMedium(Medium medium) {
                        this.medium = medium;
                    }

                    public Thumb getThumb() {
                        return thumb;
                    }

                    public void setThumb(Thumb thumb) {
                        this.thumb = thumb;
                    }

                    public Original getOriginal() {
                        return original;
                    }

                    public void setOriginal(Original original) {
                        this.original = original;
                    }

                    public static class Large {
                        /**
                         * format : jpg
                         * width : 1040
                         * height : 1040
                         * maxWidth : 1040
                         * maxHeight : 1040
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-large.jpg
                         */

                        private String format;
                        private int width;
                        private int height;
                        private int maxWidth;
                        private int maxHeight;
                        private String url;

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getMaxWidth() {
                            return maxWidth;
                        }

                        public void setMaxWidth(int maxWidth) {
                            this.maxWidth = maxWidth;
                        }

                        public int getMaxHeight() {
                            return maxHeight;
                        }

                        public void setMaxHeight(int maxHeight) {
                            this.maxHeight = maxHeight;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }

                    public static class Medium {
                        /**
                         * format : jpg
                         * width : 780
                         * height : 780
                         * maxWidth : 780
                         * maxHeight : 780
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-medium.jpg
                         */

                        private String format;
                        private int width;
                        private int height;
                        private int maxWidth;
                        private int maxHeight;
                        private String url;

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getMaxWidth() {
                            return maxWidth;
                        }

                        public void setMaxWidth(int maxWidth) {
                            this.maxWidth = maxWidth;
                        }

                        public int getMaxHeight() {
                            return maxHeight;
                        }

                        public void setMaxHeight(int maxHeight) {
                            this.maxHeight = maxHeight;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }

                    public static class Thumb {
                        /**
                         * aspect : 1:1
                         * format : jpg
                         * width : 320
                         * height : 320
                         * maxHeight : 320
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5-thumb.jpg
                         */

                        private String aspect;
                        private String format;
                        private int width;
                        private int height;
                        private int maxHeight;
                        private String url;

                        public String getAspect() {
                            return aspect;
                        }

                        public void setAspect(String aspect) {
                            this.aspect = aspect;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getMaxHeight() {
                            return maxHeight;
                        }

                        public void setMaxHeight(int maxHeight) {
                            this.maxHeight = maxHeight;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }

                    public static class Original {
                        /**
                         * width : 800
                         * height : 800
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/a361e6b2-6db3-481e-a570-8a6eb1beb5b5.jpg
                         * size : 88166
                         * format : JPEG
                         * colorspace : RGB
                         * orientation :
                         */

                        private int width;
                        private int height;
                        private String url;
                        private int size;
                        private String format;
                        private String colorspace;
                        private String orientation;

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getSize() {
                            return size;
                        }

                        public void setSize(int size) {
                            this.size = size;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getColorspace() {
                            return colorspace;
                        }

                        public void setColorspace(String colorspace) {
                            this.colorspace = colorspace;
                        }

                        public String getOrientation() {
                            return orientation;
                        }

                        public void setOrientation(String orientation) {
                            this.orientation = orientation;
                        }
                    }
                }

                public static class Gallery {
                    /**
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg
                     * large : {"format":"jpg","width":1040,"height":1040,"maxWidth":1040,"maxHeight":1040,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-large.jpg"}
                     * medium : {"format":"jpg","width":780,"height":780,"maxWidth":780,"maxHeight":780,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg"}
                     * thumb : {"aspect":"1:1","format":"jpg","width":320,"height":320,"maxHeight":320,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-thumb.jpg"}
                     * original : {"width":800,"height":800,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3.jpg","size":76493,"format":"JPEG","colorspace":"RGB","orientation":""}
                     */

                    private String url;
                    private LargeX large;
                    private MediumX medium;
                    private ThumbX thumb;
                    private OriginalX original;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public LargeX getLarge() {
                        return large;
                    }

                    public void setLarge(LargeX large) {
                        this.large = large;
                    }

                    public MediumX getMedium() {
                        return medium;
                    }

                    public void setMedium(MediumX medium) {
                        this.medium = medium;
                    }

                    public ThumbX getThumb() {
                        return thumb;
                    }

                    public void setThumb(ThumbX thumb) {
                        this.thumb = thumb;
                    }

                    public OriginalX getOriginal() {
                        return original;
                    }

                    public void setOriginal(OriginalX original) {
                        this.original = original;
                    }

                    public static class LargeX {
                        /**
                         * format : jpg
                         * width : 1040
                         * height : 1040
                         * maxWidth : 1040
                         * maxHeight : 1040
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-large.jpg
                         */

                        private String format;
                        private int width;
                        private int height;
                        private int maxWidth;
                        private int maxHeight;
                        private String url;

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getMaxWidth() {
                            return maxWidth;
                        }

                        public void setMaxWidth(int maxWidth) {
                            this.maxWidth = maxWidth;
                        }

                        public int getMaxHeight() {
                            return maxHeight;
                        }

                        public void setMaxHeight(int maxHeight) {
                            this.maxHeight = maxHeight;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }

                    public static class MediumX {
                        /**
                         * format : jpg
                         * width : 780
                         * height : 780
                         * maxWidth : 780
                         * maxHeight : 780
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-medium.jpg
                         */

                        private String format;
                        private int width;
                        private int height;
                        private int maxWidth;
                        private int maxHeight;
                        private String url;

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getMaxWidth() {
                            return maxWidth;
                        }

                        public void setMaxWidth(int maxWidth) {
                            this.maxWidth = maxWidth;
                        }

                        public int getMaxHeight() {
                            return maxHeight;
                        }

                        public void setMaxHeight(int maxHeight) {
                            this.maxHeight = maxHeight;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }

                    public static class ThumbX {
                        /**
                         * aspect : 1:1
                         * format : jpg
                         * width : 320
                         * height : 320
                         * maxHeight : 320
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3-thumb.jpg
                         */

                        private String aspect;
                        private String format;
                        private int width;
                        private int height;
                        private int maxHeight;
                        private String url;

                        public String getAspect() {
                            return aspect;
                        }

                        public void setAspect(String aspect) {
                            this.aspect = aspect;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getMaxHeight() {
                            return maxHeight;
                        }

                        public void setMaxHeight(int maxHeight) {
                            this.maxHeight = maxHeight;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }

                    public static class OriginalX {
                        /**
                         * width : 800
                         * height : 800
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/552ddc55-b437-41bd-b235-adf0a89fabd3.jpg
                         * size : 76493
                         * format : JPEG
                         * colorspace : RGB
                         * orientation :
                         */

                        private int width;
                        private int height;
                        private String url;
                        private int size;
                        private String format;
                        private String colorspace;
                        private String orientation;

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getSize() {
                            return size;
                        }

                        public void setSize(int size) {
                            this.size = size;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getColorspace() {
                            return colorspace;
                        }

                        public void setColorspace(String colorspace) {
                            this.colorspace = colorspace;
                        }

                        public String getOrientation() {
                            return orientation;
                        }

                        public void setOrientation(String orientation) {
                            this.orientation = orientation;
                        }
                    }
                }

                public static class ShippingCosts {
                    /**
                     * country : CHN
                     * price : 0
                     * _id : 5a966e5814d20f1f9184d8d7
                     */

                    private String country;
                    private int price;
                    private String _id;

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }

                    public int getPrice() {
                        return price;
                    }

                    public void setPrice(int price) {
                        this.price = price;
                    }

                    public String get_id() {
                        return _id;
                    }

                    public void set_id(String _id) {
                        this._id = _id;
                    }
                }

                public static class ImageDescription {
                    /**
                     * original : {"orientation":"TopLeft","colorspace":"RGB","format":"JPEG","size":189440,"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg","height":933,"width":780}
                     * thumb : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg","maxHeight":320,"height":320,"width":268,"format":"jpg"}
                     * medium : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg","maxWidth":780,"height":933,"width":780,"format":"jpg"}
                     * large : {"url":"https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg","maxWidth":1040,"height":1244,"width":1040,"format":"jpg"}
                     * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg
                     */

                    private OriginalXX original;
                    private ThumbXX thumb;
                    private MediumXX medium;
                    private LargeXX large;
                    private String url;

                    public OriginalXX getOriginal() {
                        return original;
                    }

                    public void setOriginal(OriginalXX original) {
                        this.original = original;
                    }

                    public ThumbXX getThumb() {
                        return thumb;
                    }

                    public void setThumb(ThumbXX thumb) {
                        this.thumb = thumb;
                    }

                    public MediumXX getMedium() {
                        return medium;
                    }

                    public void setMedium(MediumXX medium) {
                        this.medium = medium;
                    }

                    public LargeXX getLarge() {
                        return large;
                    }

                    public void setLarge(LargeXX large) {
                        this.large = large;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class OriginalXX {
                        /**
                         * orientation : TopLeft
                         * colorspace : RGB
                         * format : JPEG
                         * size : 189440
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb.jpg
                         * height : 933
                         * width : 780
                         */

                        private String orientation;
                        private String colorspace;
                        private String format;
                        private int size;
                        private String url;
                        private int height;
                        private int width;

                        public String getOrientation() {
                            return orientation;
                        }

                        public void setOrientation(String orientation) {
                            this.orientation = orientation;
                        }

                        public String getColorspace() {
                            return colorspace;
                        }

                        public void setColorspace(String colorspace) {
                            this.colorspace = colorspace;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public int getSize() {
                            return size;
                        }

                        public void setSize(int size) {
                            this.size = size;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }
                    }

                    public static class ThumbXX {
                        /**
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-thumb.jpg
                         * maxHeight : 320
                         * height : 320
                         * width : 268
                         * format : jpg
                         */

                        private String url;
                        private int maxHeight;
                        private int height;
                        private int width;
                        private String format;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getMaxHeight() {
                            return maxHeight;
                        }

                        public void setMaxHeight(int maxHeight) {
                            this.maxHeight = maxHeight;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }
                    }

                    public static class MediumXX {
                        /**
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-medium.jpg
                         * maxWidth : 780
                         * height : 933
                         * width : 780
                         * format : jpg
                         */

                        private String url;
                        private int maxWidth;
                        private int height;
                        private int width;
                        private String format;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getMaxWidth() {
                            return maxWidth;
                        }

                        public void setMaxWidth(int maxWidth) {
                            this.maxWidth = maxWidth;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }
                    }

                    public static class LargeXX {
                        /**
                         * url : https://s3.cn-north-1.amazonaws.com.cn/guzzu-cn-assets-1/images/741ed991-20a5-4fed-bcd0-432a7708aebb-large.jpg
                         * maxWidth : 1040
                         * height : 1244
                         * width : 1040
                         * format : jpg
                         */

                        private String url;
                        private int maxWidth;
                        private int height;
                        private int width;
                        private String format;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getMaxWidth() {
                            return maxWidth;
                        }

                        public void setMaxWidth(int maxWidth) {
                            this.maxWidth = maxWidth;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }
                    }
                }
            }

            public static class NameXX {
                /**
                 * en : Test Product A
                 * zh : 測試商品A（不发货，不退款）
                 */

                private String en;
                private String zh;

                public String getEn() {
                    return en;
                }

                public void setEn(String en) {
                    this.en = en;
                }

                public String getZh() {
                    return zh;
                }

                public void setZh(String zh) {
                    this.zh = zh;
                }
            }
        }
    }

