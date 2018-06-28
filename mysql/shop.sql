/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-06-27 23:30:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `cname` varchar(10) NOT NULL,
  `password` varchar(8) NOT NULL,
  `name` varchar(20) NOT NULL,
  `phone` varchar(11) NOT NULL,
  PRIMARY KEY (`cname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('ztef', '123456', '赵童', '18846082757');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `cname` varchar(10) NOT NULL,
  `id` varchar(6) NOT NULL,
  `img` varchar(255) NOT NULL,
  `name` varchar(20) NOT NULL,
  `price` int(10) NOT NULL,
  `number` int(4) NOT NULL,
  PRIMARY KEY (`cname`,`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES ('test1', 'x005', '/static/img/goods/digital-1.jpg', '智能手机苹果X 10', '7398', '1');
INSERT INTO `cart` VALUES ('test1', 'x006', '/static/img/goods/digital-2.jpg', '戴尔便携式计算机', '6689', '1');
INSERT INTO `cart` VALUES ('test1', 'x033', '/static/img/goods/digital-7.jpg', '任天堂NS switch', '2000', '1');
INSERT INTO `cart` VALUES ('test2', 'x005', '/static/img/goods/digital-1.jpg', '智能手机苹果X 10', '7398', '1');
INSERT INTO `cart` VALUES ('test2', 'x019', '/static/img/goods/book-3.jpg', '摆渡人心灵治愈小说', '26', '1');

-- ----------------------------
-- Table structure for custom
-- ----------------------------
DROP TABLE IF EXISTS `custom`;
CREATE TABLE `custom` (
  `cname` varchar(10) NOT NULL,
  `password` varchar(8) NOT NULL,
  `name` varchar(20) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `question` varchar(50) NOT NULL,
  `answer` varchar(50) NOT NULL,
  PRIMARY KEY (`cname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of custom
-- ----------------------------
INSERT INTO `custom` VALUES ('test0', '11112', '小强', '13400876528', '四川', '手机', '华为');
INSERT INTO `custom` VALUES ('test1', '222', '小六', '18826097865', '黑龙江a3', '手机品牌', '小米');
INSERT INTO `custom` VALUES ('test2', '333', '小红', '13100978026', '成都', '手机', 'iphone8');
INSERT INTO `custom` VALUES ('test3', '333', '小刚', '13100987652', '河北', '手机', '华为');
INSERT INTO `custom` VALUES ('test7', '777', '小鱼', '17765634892', '山西', '手机', '索尼');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` varchar(6) NOT NULL,
  `img` varchar(255) NOT NULL,
  `title` varchar(20) NOT NULL,
  `info` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `price` int(10) NOT NULL,
  `stock` int(4) NOT NULL,
  `para` varchar(30) NOT NULL,
  `type` varchar(10) NOT NULL,
  `weight` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('x001', '/static/img/goods/clothe-1.jpg', '男装', '时尚男装', '短袖亚麻衬衫男士夏季新款', '69', '100', '七分袖t恤棉麻', '服装', '10');
INSERT INTO `goods` VALUES ('x002', '/static/img/goods/clothe-2.jpg', '男装', '时尚男装', '宽松休闲裤韩版潮流运动裤', '52', '100', '日系亚麻九分裤子', '服装', '14');
INSERT INTO `goods` VALUES ('x003', '/static/img/goods/clothe-3.jpg', '男装', '时尚男装', '休闲夏天男生潮牌男士沙滩裤', '63', '100', '宽松条纹五分裤', '服装', '10');
INSERT INTO `goods` VALUES ('x004', '/static/img/goods/clothe-4.jpg', '男装', '时尚男装', '日系复古港风翻领帆布外套', '111', '100', '拼色工装夹克', '服装', '10');
INSERT INTO `goods` VALUES ('x005', '/static/img/goods/digital-1.jpg', '手机', 'iphone X', '智能手机苹果X 10', '7398', '50', '全网通4G', '数码', '15');
INSERT INTO `goods` VALUES ('x006', '/static/img/goods/digital-2.jpg', '笔记本', '精品推荐', '戴尔便携式计算机', '6689', '80', '13.3英寸固态硬盘', '数码', '13');
INSERT INTO `goods` VALUES ('x007', '/static/img/goods/digital-3.jpg', '平板', '超值优惠', 'Apple/苹果 Ipad', '2228', '100', '9.7英寸ipad', '数码', '10');
INSERT INTO `goods` VALUES ('x008', '/static/img/goods/digital-4.jpg', '电玩', '游戏机', '索尼PlayStation4', '2399', '80', '单机标配', '数码', '11');
INSERT INTO `goods` VALUES ('x009', '/static/img/goods/food-1.jpg', '零食', '重庆特色牛肉干', '皮皮卤作品热卖牛肉干', '38', '120', '麻辣纯手工制', '食品', '10');
INSERT INTO `goods` VALUES ('x010', '/static/img/goods/food-2.jpg', '零食', '丝滑牛奶巧克力', '德芙巧克力3碗装', '95', '100', '盒装大礼包', '食品', '14');
INSERT INTO `goods` VALUES ('x011', '/static/img/goods/food-3.jpg', '零食', '非油炸速食面', '五谷道场红烧牛肉方便面', '20', '100', '红烧牛肉味', '食品', '10');
INSERT INTO `goods` VALUES ('x012', '/static/img/goods/food-4.jpg', '饮料', '浓缩型饮料', '现货日本可尔必思CALPIS', '55', '80', '活性乳酸菌饮料', '食品', '11');
INSERT INTO `goods` VALUES ('x013', '/static/img/goods/sports-1.jpg', '球类', '羽毛球拍', '尤尼克斯YONEX NR10', '270', '50', 'VTSOAR超轻', '运动', '10');
INSERT INTO `goods` VALUES ('x014', '/static/img/goods/sports-2.jpg', '滑板', '北京燃烧冰滑板', '美国进口Loaded Tesseract', '109', '40', '立方体长板', '运动', '9');
INSERT INTO `goods` VALUES ('x015', '/static/img/goods/sports-3.jpg', '球类', '专业训练球', '青岛双星正品标准球', '79', '50', '5号标准足球', '运动', '10');
INSERT INTO `goods` VALUES ('x016', '/static/img/goods/sports-4.jpg', '球类', '纯色个性篮球', '无印商标发泡柔软篮球', '95', '50', '耐磨防滑室外', '运动', '12');
INSERT INTO `goods` VALUES ('x017', '/static/img/goods/book-1.jpg', '小说', '中学生课外书籍', '平凡的世界全三册全集', '67', '80', '正版全集三册', '书城', '10');
INSERT INTO `goods` VALUES ('x018', '/static/img/goods/book-2.jpg', '软件', '计算机程序开发', 'java核心技术卷II高级特性', '89', '100', '正版一册', '书城', '9');
INSERT INTO `goods` VALUES ('x019', '/static/img/goods/book-3.jpg', '小说', '心灵治愈小说', '摆渡人心灵治愈小说', '26', '120', '新华书店正版书籍', '书城', '10');
INSERT INTO `goods` VALUES ('x020', '/static/img/goods/book-4.jpg', '幼儿', '宝宝早教启蒙', '小粽子小粽子绘本', '27', '100', '亲子共读绘本', '书城', '9');
INSERT INTO `goods` VALUES ('x021', '/static/img/goods/clothe-5.jpg', '女装', '潮流女装', '雪纺小黑裙大码', '50', '80', '中长款连衣裙', '服装', '10');
INSERT INTO `goods` VALUES ('x022', '/static/img/goods/clothe-6.jpg', '女装', '潮流女装', '柴田小天使mer', '98', '60', 'T恤森系上衣', '服装', '10');
INSERT INTO `goods` VALUES ('x023', '/static/img/goods/clothe-7.jpg', '鞋类', '潮流新款', '夏季透气慢跑鞋', '138', '100', '韩版轻便', '服装', '11');
INSERT INTO `goods` VALUES ('x024', '/static/img/goods/clothe-8.jpg', '鞋类', '潮流新款', '夏季学生板鞋', '55', '100', '日系低帮', '服装', '13');
INSERT INTO `goods` VALUES ('x025', '/static/img/goods/clothe-9.jpg', '包类', '休闲旅行', '无印良品单肩包', '70', '80', '日系斜挎包', '服装', '10');
INSERT INTO `goods` VALUES ('x030', '/static/img/goods/clothe-10.jpg', '包类', '休闲旅行', '简约纯色背包', '88', '100', '大容量双肩包', '服装', '11');
INSERT INTO `goods` VALUES ('x031', '/static/img/goods/digital-5.jpg', '手机', '全新设计', '小米mix2官方旗舰', '2399', '80', '全网通4g', '数码', '12');
INSERT INTO `goods` VALUES ('x032', '/static/img/goods/digital-6.jpg', '笔记本', '精品推荐', '苹果Macbook pro', '14165', '80', '256g存储容量', '数码', '12');
INSERT INTO `goods` VALUES ('x033', '/static/img/goods/digital-7.jpg', '电玩', '新款设计', '任天堂NS switch', '2000', '80', '家用游戏机', '数码', '11');
INSERT INTO `goods` VALUES ('x034', '/static/img/goods/book-5.jpg', '软件', '工具书籍', 'python核心编程', '74', '100', '正版书籍', '书城', '11');
INSERT INTO `goods` VALUES ('x035', '/static/img/goods/book-6.jpg', '软件', '工具书籍', '你不知道的js', '138', '80', '上中下三卷', '书城', '10');
INSERT INTO `goods` VALUES ('x036', '/static/img/goods/food-5.jpg', '饮料', '清凉解暑', '可口可乐易拉罐', '48', '100', '24罐装', '食品', '13');
INSERT INTO `goods` VALUES ('x037', '/static/img/goods/food-6.jpg', '果蔬', '新鲜包邮', '新鲜水果黄桃', '38', '80', '10斤包邮', '食品', '9');
INSERT INTO `goods` VALUES ('x038', '/static/img/goods/food-7.jpg', '特产', '各地特产', '周村烧饼', '98', '80', '80g*8', '食品', '10');
INSERT INTO `goods` VALUES ('x039', '/static/img/goods/digital-8.jpg', '手机', '全新设计', 'Huawei华为P10', '1968', '100', '全网通4g', '数码', '10');
INSERT INTO `goods` VALUES ('x040', '/static/img/goods/sports-5.jpg', '骑行', '户外运动', 'Nomad新品', '1950', '80', '变速山地自行车', '运动', '10');
INSERT INTO `goods` VALUES ('x041', '/static/img/goods/sports-6.jpg', '骑行', '户外运动', 'Giant捷安特', '2798', '70', '山地自行车', '运动', '10');
INSERT INTO `goods` VALUES ('x042', '/static/img/goods/sports-7.jpg', '健身', '健康生活', '品健可拆卸哑铃', '48', '80', '20公斤哑铃', '运动', '9');
INSERT INTO `goods` VALUES ('x043', '/static/img/goods/sports-8.jpg', '健身', '健康生活', 'Keep跑步机', '1999', '60', '小型超静音走步机', '运动', '10');

-- ----------------------------
-- Table structure for goodsindex
-- ----------------------------
DROP TABLE IF EXISTS `goodsindex`;
CREATE TABLE `goodsindex` (
  `title` varchar(20) NOT NULL,
  `info` varchar(20) NOT NULL,
  `img` varchar(255) NOT NULL,
  `type` varchar(10) NOT NULL,
  PRIMARY KEY (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsindex
-- ----------------------------
INSERT INTO `goodsindex` VALUES ('健身', '健康生活', '/static/img/index/s3.jpg', '运动');
INSERT INTO `goodsindex` VALUES ('包类', '休闲旅行', '/static/img/index/c4.jpg', '服装');
INSERT INTO `goodsindex` VALUES ('垂钓', '享受生活', '/static/img/index/s4.jpg', '运动');
INSERT INTO `goodsindex` VALUES ('女装', '潮流女装', '/static/img/index/c2.jpg', '服装');
INSERT INTO `goodsindex` VALUES ('小说', '正版包邮', '/static/img/index/b1.jpg', '书城');
INSERT INTO `goodsindex` VALUES ('平板', '超值优惠', '/static/img/index/d2.jpg', '数码');
INSERT INTO `goodsindex` VALUES ('幼儿', '启蒙教育', '/static/img/index/b4.jpg', '书城');
INSERT INTO `goodsindex` VALUES ('手机', '全新设计', '/static/img/index/d3.jpg', '数码');
INSERT INTO `goodsindex` VALUES ('果蔬', '新鲜包邮', '/static/img/index/f2.jpg', '食品');
INSERT INTO `goodsindex` VALUES ('特产', '各地特产', '/static/img/index/f3.jpg', '食品');
INSERT INTO `goodsindex` VALUES ('球类', '球类运动', '/static/img/index/s1.jpg', '运动');
INSERT INTO `goodsindex` VALUES ('电玩', '新款设计', '/static/img/index/d4.jpg', '数码');
INSERT INTO `goodsindex` VALUES ('男装', '时尚男装', '/static/img/index/c1.jpg', '服装');
INSERT INTO `goodsindex` VALUES ('科幻', '科幻图书', '/static/img/index/b3.jpg', '书城');
INSERT INTO `goodsindex` VALUES ('笔记本', '精品推荐', '/static/img/index/d1.jpg', '数码');
INSERT INTO `goodsindex` VALUES ('软件', '工具书籍', '/static/img/index/b2.jpg', '书城');
INSERT INTO `goodsindex` VALUES ('零食', '超值划算', '/static/img/index/f1.jpg', '食品');
INSERT INTO `goodsindex` VALUES ('鞋类', '潮流新款', '/static/img/index/c3.jpg', '服装');
INSERT INTO `goodsindex` VALUES ('饮料', '清凉解暑', '/static/img/index/f4.jpg', '食品');
INSERT INTO `goodsindex` VALUES ('骑行', '户外运动', '/static/img/index/s2.jpg', '运动');

-- ----------------------------
-- Table structure for goodslist
-- ----------------------------
DROP TABLE IF EXISTS `goodslist`;
CREATE TABLE `goodslist` (
  `id` varchar(6) NOT NULL,
  `img` varchar(255) NOT NULL,
  `name` varchar(20) NOT NULL,
  `price` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodslist
-- ----------------------------
INSERT INTO `goodslist` VALUES ('x042', '/static/img/goods/sports-7.jpg', '品健可拆卸哑铃', '48');
INSERT INTO `goodslist` VALUES ('x043', '/static/img/goods/sports-8.jpg', 'Keep跑步机', '1999');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `cname` varchar(10) NOT NULL,
  `msg` varchar(255) NOT NULL,
  PRIMARY KEY (`cname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `rid` varchar(20) NOT NULL,
  `cname` varchar(10) NOT NULL,
  `ids` varchar(255) NOT NULL,
  `names` varchar(255) NOT NULL,
  `price` int(10) NOT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('xxx2018620013', 'test2', 'x002,x010,x015', '宽松休闲裤韩版潮流运动裤,德芙巧克力3碗装,青岛双星正品标准球', '278');
INSERT INTO `order` VALUES ('xxx2018620014', 'test2', 'x010', '德芙巧克力3碗装', '96');
INSERT INTO `order` VALUES ('xxx2018621002', 'test1', 'x005,x007,x010', '智能手机苹果X 10,Apple/苹果 Ipad,德芙巧克力3碗装', '9816');
INSERT INTO `order` VALUES ('xxx2018625002', 'test1', 'x002,x005', '宽松休闲裤韩版潮流运动裤,智能手机苹果X 10', '7502');
INSERT INTO `order` VALUES ('xxx2018626001', 'test1', 'x014', '美国进口Loaded Tesseract', '109');
INSERT INTO `order` VALUES ('xxx2018627001', 'test1', 'x039', 'Huawei华为P10', '1968');

-- ----------------------------
-- Table structure for recommend
-- ----------------------------
DROP TABLE IF EXISTS `recommend`;
CREATE TABLE `recommend` (
  `id` varchar(6) NOT NULL,
  `img` varchar(255) NOT NULL,
  `title` varchar(20) NOT NULL,
  `info` varchar(20) NOT NULL,
  `weight` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recommend
-- ----------------------------
INSERT INTO `recommend` VALUES ('x002', '/static/img/goods/clothe-2.jpg', '男装', '时尚男装', '14');
INSERT INTO `recommend` VALUES ('x005', '/static/img/goods/digital-1.jpg', '手机', 'iphone X', '15');
INSERT INTO `recommend` VALUES ('x006', '/static/img/goods/digital-2.jpg', '笔记本', '精品推荐', '13');
INSERT INTO `recommend` VALUES ('x010', '/static/img/goods/food-2.jpg', '零食', '丝滑牛奶巧克力', '14');

-- ----------------------------
-- Table structure for sort
-- ----------------------------
DROP TABLE IF EXISTS `sort`;
CREATE TABLE `sort` (
  `title` varchar(20) NOT NULL,
  `info` varchar(20) NOT NULL,
  `img` varchar(255) NOT NULL,
  PRIMARY KEY (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sort
-- ----------------------------
INSERT INTO `sort` VALUES ('健身', '健康生活', '/static/img/index/s3.jpg');
INSERT INTO `sort` VALUES ('垂钓', '享受生活', '/static/img/index/s4.jpg');
INSERT INTO `sort` VALUES ('球类', '球类运动', '/static/img/index/s1.jpg');
INSERT INTO `sort` VALUES ('骑行', '户外运动', '/static/img/index/s2.jpg');
