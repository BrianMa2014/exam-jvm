package com.yintai.trx.util;
public class TransactionLookupValues {
    
	//����״̬  �ɹ�:1 ʧ��:2 �ȴ�����3
	public static final int TRANSACTION_STATUS_SUCCESS = 1;
    public static final int TRANSACTION_STATUS_FAILED = 2;
    public static final int TRANSACTION_STATUS_PENDING = 3;
    
    //��������  �κ�����:-1 ֧��:1 �˿�:2
    public static final int TRANSACTION_TYPE_ALL = -1;
    public static final int TRANSACTION_TYPE_PAYMENT = 1;
    public static final int TRANSACTION_TYPE_REFUND = 2;
    
    //��������  ��Ԫ:1 �����:2
    public static final int CURRENCY_TYPE_DOLLAR = 1;
    public static final int CURRENCY_TYPE_RMB = 2;
}
