package mall.DTO;
import java.sql.Timestamp;

public class MallDTO {

    private String name;
    private String id;
    private String pw;
    private String mail;
    private String mailaddress;	// 이메일 호스트 주소
    private String zipcode;		// 우편번호
    private String address;	// 주소
    private String address2	;	// 상세주소
    private String mobile; 		// 통신사
    private String phone1;
    private String phone2;
    private String phone3;
    private int point;		//int
    private String grade;		// 회원 등급
    private Timestamp reg_date;

    private String item_num;	// 상품 번호
    private String item_name;
    private int item_price;	//int
    private String item_img;
    private String item_upload;	// 등록일
    private String item_type;	// 상품 유형
    private int item_stock;	// 재고		//int
    
   private int item_amount;	// 상품 주문 수량 // int
   private String status;		// 주문 상태
   private String item_cancel;	// 주문 취소 여부
   private String item_delivery;	// 주문 배송 여부
   private int item_patment;	// 실 결제액 //int
   private Timestamp delivery_date;	// 배송일
   private String ordernum;	// 주문 번호
   
   private int money;		// 실제 결제액	// int
   
   private int num;		// 게시글 번호 // int primary key
   private String writer;
   private String subject;
   private String email;
   private String content;
   private String passwd;
   private int readcount;	//int
   private String ip;
   private int ref;		// 게시글 그룹번호	//int
   private int re_step;		// 게시글 계층 정렬 번호	//int
   private int re_level;	// 게시글 계층 번호	//int
   private String item_number;	// 게시 대상 상품 번호
   
   private String order_num;	// 주문 번호
   private String s_name;		// 받는이 이름
   private String s_phone;		// 받는이 전화번호
   private String s_zipcode;	// 받는이 우편번호
   private String s_address	;// 받는이 주소
   private String  add_phone;	// 받는이 예비 전화번호
   private String  memo1;		// 배송 메모 1
   private String  memo2;		// 배송 메모 2
   private String  item_info;	// 주문 상품 정보
   private int price;		// 총 결제액	//int
   private String select_bank;	// 무통장 입금 은행
   
   private String changegrade;	// 회원 등급
   private String basegrade;	// 초기 등급
   private String reason;		// 등급 변경 사유		
   private String onstop;		// 등급 변경일
   private String outstop;		// 정지 기간
   private String type;		// 등급 변경 유형
   
   private String item_size;
   private Timestamp cz_date;		// 등록 일 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getMailaddress() {
	return mailaddress;
}
public void setMailaddress(String mailaddress) {
	this.mailaddress = mailaddress;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getPhone1() {
	return phone1;
}
public void setPhone1(String phone1) {
	this.phone1 = phone1;
}
public String getPhone2() {
	return phone2;
}
public void setPhone2(String phone2) {
	this.phone2 = phone2;
}
public String getPhone3() {
	return phone3;
}
public void setPhone3(String phone3) {
	this.phone3 = phone3;
}
public int getPoint() {
	return point;
}
public void setPoint(int point) {
	this.point = point;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public Timestamp getReg_date() {
	return reg_date;
}
public void setReg_date(Timestamp reg_date) {
	this.reg_date = reg_date;
}
public String getItem_num() {
	return item_num;
}
public void setItem_num(String item_num) {
	this.item_num = item_num;
}
public String getItem_name() {
	return item_name;
}
public void setItem_name(String item_name) {
	this.item_name = item_name;
}
public int getItem_price() {
	return item_price;
}
public void setItem_price(int item_price) {
	this.item_price = item_price;
}
public String getItem_img() {
	return item_img;
}
public void setItem_img(String item_img) {
	this.item_img = item_img;
}
public String getItem_upload() {
	return item_upload;
}
public void setItem_upload(String item_upload) {
	this.item_upload = item_upload;
}
public String getItem_type() {
	return item_type;
}
public void setItem_type(String item_type) {
	this.item_type = item_type;
}
public int getItem_stock() {
	return item_stock;
}
public void setItem_stock(int item_stock) {
	this.item_stock = item_stock;
}
public int getItem_amount() {
	return item_amount;
}
public void setItem_amount(int item_amount) {
	this.item_amount = item_amount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getItem_cancel() {
	return item_cancel;
}
public void setItem_cancel(String item_cancel) {
	this.item_cancel = item_cancel;
}
public String getItem_delivery() {
	return item_delivery;
}
public void setItem_delivery(String item_delivery) {
	this.item_delivery = item_delivery;
}
public int getItem_patment() {
	return item_patment;
}
public void setItem_patment(int item_patment) {
	this.item_patment = item_patment;
}
public Timestamp getDelivery_date() {
	return delivery_date;
}
public void setDelivery_date(Timestamp delivery_date) {
	this.delivery_date = delivery_date;
}
public String getOrdernum() {
	return ordernum;
}
public void setOrdernum(String ordernum) {
	this.ordernum = ordernum;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getPasswd() {
	return passwd;
}
public void setPasswd(String passwd) {
	this.passwd = passwd;
}
public int getReadcount() {
	return readcount;
}
public void setReadcount(int readcount) {
	this.readcount = readcount;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public int getRef() {
	return ref;
}
public void setRef(int ref) {
	this.ref = ref;
}
public int getRe_step() {
	return re_step;
}
public void setRe_step(int re_step) {
	this.re_step = re_step;
}
public int getRe_level() {
	return re_level;
}
public void setRe_level(int re_level) {
	this.re_level = re_level;
}
public String getItem_number() {
	return item_number;
}
public void setItem_number(String item_number) {
	this.item_number = item_number;
}
public String getOrder_num() {
	return order_num;
}
public void setOrder_num(String order_num) {
	this.order_num = order_num;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public String getS_phone() {
	return s_phone;
}
public void setS_phone(String s_phone) {
	this.s_phone = s_phone;
}
public String getS_zipcode() {
	return s_zipcode;
}
public void setS_zipcode(String s_zipcode) {
	this.s_zipcode = s_zipcode;
}
public String getS_address() {
	return s_address;
}
public void setS_address(String s_address) {
	this.s_address = s_address;
}
public String getAdd_phone() {
	return add_phone;
}
public void setAdd_phone(String add_phone) {
	this.add_phone = add_phone;
}
public String getMemo1() {
	return memo1;
}
public void setMemo1(String memo1) {
	this.memo1 = memo1;
}
public String getMemo2() {
	return memo2;
}
public void setMemo2(String memo2) {
	this.memo2 = memo2;
}
public String getItem_info() {
	return item_info;
}
public void setItem_info(String item_info) {
	this.item_info = item_info;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getSelect_bank() {
	return select_bank;
}
public void setSelect_bank(String select_bank) {
	this.select_bank = select_bank;
}
public String getChangegrade() {
	return changegrade;
}
public void setChangegrade(String changegrade) {
	this.changegrade = changegrade;
}
public String getBasegrade() {
	return basegrade;
}
public void setBasegrade(String basegrade) {
	this.basegrade = basegrade;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public String getOnstop() {
	return onstop;
}
public void setOnstop(String onstop) {
	this.onstop = onstop;
}
public String getOutstop() {
	return outstop;
}
public void setOutstop(String outstop) {
	this.outstop = outstop;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getItem_size() {
	return item_size;
}
public void setItem_size(String item_size) {
	this.item_size = item_size;
}
public Timestamp getCz_date() {
	return cz_date;
}
public void setCz_date(Timestamp cz_date) {
	this.cz_date = cz_date;
}
   
   
}
    
    