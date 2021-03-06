package com.emrubik.test;

import java.net.URL;
import java.security.Key;
import java.util.UUID;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * demo for the yzj - erp sync
 * 
 * @author wenxiang_xu
 *
 */
public class Main {

	private final static String yzj_base_url = "https://www.yunzhijia.com";
	// private final static String
	// person_getall_url=yzj_base_url+"/openaccess/input/person/getall ";
	private final static String org_getall_url = yzj_base_url
			+ "/openaccess/input/dept/getall";

	public static void main(String[] args) throws Exception {
		try {
			JsonNode jsonData = new JsonNode("{'eid':'11852222'}"); // json data without encrypt
//			String keyFile = Main.class.getResource("/").getPath() + "11848045.key";
			String keyFile = "F:/work/water/yunzhijia/11848045.key";
			keyFile = "F:/work/water-wpm-release-0.0.1/config/11852222.key";
			System.out.println(keyFile);
			
			byte[] keyByte = EncryptUtils.getBytesFromFile(keyFile);
			Key key = EncryptUtils.restorePrivateKey(keyByte);

			HttpResponse<JsonNode> jsonResponse = Unirest
					.post(org_getall_url)
					.header("Content-Type", "application/x-www-form-urlencoded")
					.field("eid", "11852222")
					.field("nonce", UUID.randomUUID().toString())
					.field("data",
							EncryptUtils.encryptWithEncodeBase64UTF8(
									jsonData.toString(), key)).asJson();
			System.out.println(jsonResponse.getBody());
		} catch (UnirestException e) {
			e.printStackTrace();
		}
	}

}
