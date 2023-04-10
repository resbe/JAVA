package com.yedam.consumer;

import com.yedam.common.DAO;
import com.yedam.consumer.Consumer;
import com.yedam.consumer.ConsumerDAO;

public class ConsumerDAO extends DAO{
private static ConsumerDAO consumerDao = new ConsumerDAO();
	
	private ConsumerDAO() {
		
	}
	
	public static ConsumerDAO getInstance() {
		return consumerDao;
	}
	
	//로그인
	
	public Consumer login(String id) {
		Consumer consumer = null;
		try {
			conn();
			String sql = "SELECT * FROM customer WHERE customer_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				consumer = new Consumer();
				consumer.setConsumerId(rs.getString("consumer_id"));
				consumer.setConsumerPw(rs.getString("consumer_pw"));
				consumer.setConsumerPw2(rs.getString("consumer_pw2"));
				consumer.setConsumerName(rs.getString("consumer_name"));
				consumer.setConsumerNickName(rs.getString("consumer_nickname"));
				consumer.setConsumerTell(rs.getString("consumer_tell"));
					
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return consumer;
		}
	
	//회원가입
	
	public int consumerAdd(Consumer consumer) {
		int result = 0;
		try {
			conn();
			String sql = "insert into customer values (?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, consumer.getConsumerId());
			pstmt.setString(2, consumer.getConsumerPw());
			pstmt.setString(3, consumer.getConsumerPw2());
			pstmt.setString(4, consumer.getConsumerName());
			pstmt.setString(5, consumer.getConsumerNickName());
			pstmt.setString(6, consumer.getConsumerTell());
			pstmt.setString(7, consumer.getConsumerAddress());
			
			result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println(consumer.getConsumerNickName() +"님을 환영합니다" );
			}else {
				System.out.println("회원가입 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
		
	}
	
	//회원정보 수정
	//아이디 변경
	public int consumerUpdate1(Consumer consumer) {
		int result = 0;
		try {
			conn();
		String sql ="update consumer set consumerId = ? where consumerId = ?";
		pstmt =  conn.prepareStatement(sql);
		pstmt.setString(1,consumer.getConsumerId());
		pstmt.setString(2,consumer.getConsumerId());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//비밀번호 변경
	public int consumerUpdate2(Consumer consumer) {
		int result = 0;
		try {
			conn();
		String sql ="update consumer set consumerPw = ? where consumerId = ?";
		pstmt =  conn.prepareStatement(sql);
		pstmt.setString(1,consumer.getConsumerPw());
		pstmt.setString(2,consumer.getConsumerId());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//이메일
	public int consumerUpdate4(Consumer consumer) {
		int result = 0;
		try {
			conn();
		String sql ="update consumer set consumerEmail = ? where consumerId = ?";
		pstmt =  conn.prepareStatement(sql);
		pstmt.setString(1,consumer.getConsumerEmail());
		pstmt.setString(2,consumer.getConsumerId());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//주소
	public int consumerUpdate5(Consumer consumer) {
		int result = 0;
		try {
			conn();
		String sql ="update consumer set consumerAddress = ? where consumerId = ?";
		pstmt =  conn.prepareStatement(sql);
		pstmt.setString(1,consumer.getConsumerAddress());
		pstmt.setString(2,consumer.getConsumerId());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//닉네임
	public int consumerUpdate6(Consumer consumer) {
		int result = 0;
		try {
			conn();
		String sql ="update consumer set consumerNickName = ? where consumerId = ?";
		pstmt =  conn.prepareStatement(sql);
		pstmt.setString(1,consumer.getConsumerNickName());
		pstmt.setString(2,consumer.getConsumerId());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//전화번호
	public int consumerUpdate7(Consumer consumer) {
		int result = 0;
		try {
			conn();
		String sql ="update consumer set consumerTel = ? where consumerid = ?";
		pstmt =  conn.prepareStatement(sql);
		pstmt.setString(1,consumer.getConsumerPw());
		pstmt.setString(2,consumer.getConsumerId());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}