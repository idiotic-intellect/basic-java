package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferenceList {

	public static void main(String[] args) {
		List<String> complete_data = Arrays.asList("account_enterfirstnamehint", "akzo_products_productdetail_addcolour", "tooltips_error_tryagainbutton", "  ecommerce_addressstage_proceedtodelivery", "ecommerce_addcolour_cart", "ecommerce_address_error_msg", "ecommerce_addressstage_billingaddresstitle", "ecommerce_addressstage_city_fielderror", "ecommerce_addressstage_deliveryaddresssubtitle", "ecommerce_addressstage_deliveryaddresstitle", "ecommerce_addressstage_emailaddress_fielderror", "ecommerce_addressstage_entercitynamehint", "ecommerce_addressstage_enteremailhint", "ecommerce_addressstage_enterfirstnamehint", "ecommerce_addressstage_enterhousenamehint", "ecommerce_addressstage_enterlastnamehint", "ecommerce_addressstage_enterpostcodehint", "ecommerce_addressstage_enterstreetnamehint", "ecommerce_addressstage_entertelephonehint", "ecommerce_addressstage_firstname_fielderror", "ecommerce_addressstage_house_fielderror", "ecommerce_addressstage_lastname_fielderror", "ecommerce_addressstage_newslettersignup", "ecommerce_addressstage_postcode_fielderror", "ecommerce_addressstage_proceedtodelivery", "ecommerce_addressstage_street_fielderror", "ecommerce_addressstage_telephonenumber_fielderror", "ecommerce_addressstage_usedeliveryaddresscheckbox", "ecommerce_addressstagetitle", "ecommerce_buynowbutton", "ecommerce_buynowtitle", "ecommerce_cart_empty_title", "ecommerce_checkoutbutton", "ecommerce_checkoutsubtitle", "ecommerce_checkoutsubtitleinc", "ecommerce_checkouttitle", "ecommerce_confirm_orderbutton", "ecommerce_confirmationstage_cardused", "ecommerce_confirmationstage_colour", "ecommerce_confirmationstage_confirmationsubtitle", "ecommerce_confirmationstage_confirmationtitle", "ecommerce_confirmationstage_contactus", "ecommerce_confirmationstage_createaccountbutton", "ecommerce_confirmationstage_createaccounttitle", "ecommerce_confirmationstage_emailreceipt", "ecommerce_confirmationstage_items", "ecommerce_confirmationstage_ordernumbersubtitle", "ecommerce_confirmationstage_orderquery", "ecommerce_confirmationstage_packsize", "ecommerce_confirmationstage_product", "ecommerce_confirmationstage_quantity", "ecommerce_confirmationstage_thankyou", "ecommerce_confirmationstage_vat", "ecommerce_confirmationstagetitle", "ecommerce_continue_shopping_msg", "ecommerce_currencyseparator", "ecommerce_currencysymbol", "ecommerce_deliveryoptionssubtitle", "ecommerce_deliveryoptionstitle", "ecommerce_deliverystage_deliveryoptionssubtitle", "ecommerce_deliverystage_firstclassdeliverytitle", "ecommerce_deliverystage_proceedtopaymentbutton", "ecommerce_deliverystagetitle", "ecommerce_discard_address_msg", "ecommerce_discard_address_option1", "ecommerce_discard_address_option2", "ecommerce_discount_applied_msg", "ecommerce_discountapplied", "ecommerce_discountcode_fielderror", "ecommerce_discountcodeerrortitle", "ecommerce_discountcodehint", "ecommerce_discountcodetitle", "ecommerce_est_delivery_msg", "ecommerce_freedeliverysubtitle", "ecommerce_freedeliverytitle", "ecommerce_generic_error_msg", "ecommerce_including_delivery_msg", "ecommerce_including_tax_msg", "ecommerce_inclvat", "ecommerce_item_title", "ecommerce_make_payment_title", "ecommerce_mandatory_fields_title", "ecommerce_name_title", "ecommerce_offer_applied_msg", "ecommerce_order_confirmation_msg", "ecommerce_order_confirmation_title", "ecommerce_ordersizetitle", "ecommerce_ordersummarytitle", "ecommerce_payment_error_msg", "ecommerce_payment_error_title", "ecommerce_payment_pending_msg", "ecommerce_paymentmethodtitle", "ecommerce_paymentstage_cardnumber_fielderror", "ecommerce_paymentstage_doneediting", "ecommerce_paymentstage_editbillingaddress", "ecommerce_paymentstage_entercardexpirymonthhint", "ecommerce_paymentstage_entercardexpiryyearhint", "ecommerce_paymentstage_entercardnamehint", "ecommerce_paymentstage_entercardnumberhint", "ecommerce_paymentstage_entercsc_fielderror", "ecommerce_paymentstage_entercschint", "ecommerce_paymentstage_expirymonth_fielderror", "ecommerce_paymentstage_expiryyear_fielderror", "ecommerce_paymentstage_freeorder", "ecommerce_paymentstage_name_fielderror", "ecommerce_paymentstage_paymentmethod_cardbutton", "ecommerce_paymentstage_paymentmethod_ideal_selectbanktitle", "ecommerce_paymentstage_paymentmethod_idealsubtitle", "ecommerce_paymentstage_paymentmethodtitle", "ecommerce_paymentstage_placeorder_carddetailstitle", "ecommerce_paymentstage_placeorder_inappsubtitle", "ecommerce_paymentstage_placeorder_legalobligation", "ecommerce_paymentstage_placeorder_redirectsubtitle", "ecommerce_paymentstage_placeorderbutton", "ecommerce_paymentstage_processing_message", "ecommerce_paymentstage_termsandconditions_accept", "ecommerce_paymentstage_termsandconditionsbutton", "ecommerce_paymentstage_termsandconditionstitle", "ecommerce_paymentstage_termsandconditionsurl", "ecommerce_paymentstagetitle", "ecommerce_product_add_to_cart_failed_msg", "ecommerce_product_removed", "ecommerce_qty_title", "ecommerce_remove_item_title", "ecommerce_remove_order_msg", "ecommerce_same_delivery_bill_address_msg", "ecommerce_shoppingcart_empty", "ecommerce_shoppingcart_removeitem", "ecommerce_shoppingcartclear", "ecommerce_shoppingcarttitle", "ecommerce_shoppingsendbutton", "ecommerce_standarddeliverysubtitlept1", "ecommerce_standarddeliverysubtitlept2", "ecommerce_standarddeliverysubtitlept3", "ecommerce_standarddeliverytitle", "ecommerce_subtotal_title", "ecommerce_total_discount_title", "ecommerce_totalexctitle", "ecommerce_totalinctitle", "ecommerce_totaltitle", "ecommerce_user_info_error_msg", "ecommerce_view_cart_title",
				"tooltips_ecommerce_processing");
		List<String> initial_data = Arrays.asList("account_enterfirstnamehint", "akzo_products_productdetail_addcolour", "tooltips_error_tryagainbutton", "ecommerce_addressstage_billingaddresstitle", "ecommerce_addressstage_deliveryaddresstitle", "ecommerce_addressstage_entercitynamehint", "ecommerce_addressstage_enterhousenamehint", "ecommerce_addressstage_enterlastnamehint", "ecommerce_addressstage_enterpostcodehint", "ecommerce_addressstage_enterstreetnamehint", "ecommerce_addressstage_entertelephonehint", "ecommerce_addressstage_enteremailhint", "ecommerce_addressstage_proceedtodelivery", "ecommerce_addressstage_usedeliveryaddresscheckbox", "ecommerce_addressstagetitle", "ecommerce_checkoutbutton", "ecommerce_paymentstage_termsandconditionsurl", "ecommerce_paymentstage_termsandconditionstitle", "ecommerce_paymentstage_termsandconditions_accept", "ecommerce_paymentstage_termsandconditionsbutton", "ecommerce_checkouttitle", "ecommerce_confirmationstage_contactus", "ecommerce_confirmationstage_quantity", "ecommerce_confirmationstagetitle", "ecommerce_deliveryoptionstitle", "ecommerce_deliverystage_proceedtopaymentbutton", "ecommerce_deliverystagetitle", "ecommerce_discountcodeerrortitle", "ecommerce_discountcodehint", "ecommerce_discountcodetitle", "ecommerce_paymentstagetitle", "ecommerce_shoppingcarttitle", "ecommerce_standarddeliverytitle", "ecommerce_totaltitle", "ecommerce_including_delivery_msg", "ecommerce_including_tax_msg", "ecommerce_remove_order_msg", "ecommerce_order_confirmation_title", "ecommerce_order_confirmation_msg", "ecommerce_continue_shopping_msg", "ecommerce_discount_applied_msg", "ecommerce_discard_address_option2", "ecommerce_est_delivery_msg", "ecommerce_item_title", "ecommerce_discard_address_msg", "ecommerce_discard_address_option1", "ecommerce_make_payment_title", "ecommerce_mandatory_fields_title", "ecommerce_name_title", "ecommerce_offer_applied_msg", "ecommerce_payment_error_title", "ecommerce_address_error_msg", "ecommerce_user_info_error_msg", "ecommerce_qty_title", "ecommerce_remove_item_title", "ecommerce_same_delivery_bill_address_msg", "ecommerce_subtotal_title", "ecommerce_payment_error_msg", "ecommerce_total_discount_title", "ecommerce_view_cart_title", "ecommerce_cart_empty_title", "ecommerce_ordersizetitle", "ecommerce_ordersummarytitle", "ecommerce_currencyseparator", "ecommerce_payment_pending_msg", "ecommerce_confirm_orderbutton",
				"ecommerce_product_add_to_cart_failed_msg");
		
		List<String> difference = initial_data.stream()
				.filter(key -> !complete_data.contains(key))
				.collect(Collectors.toList());
		
		System.out.println();
		System.out.println(difference.size());
		System.out.println(difference);

	}

}
