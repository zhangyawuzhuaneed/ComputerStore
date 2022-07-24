CREATE TABLE t_order
(
    oid           INT AUTO_INCREMENT COMMENT '����id',
    uid           INT         NOT NULL COMMENT '�û�id',
    recv_name     VARCHAR(20) NOT NULL COMMENT '�ջ�������',
    recv_phone    VARCHAR(20) COMMENT '�ջ��˵绰',
    recv_province VARCHAR(15) COMMENT '�ջ�������ʡ',
    recv_city     VARCHAR(15) COMMENT '�ջ���������',
    recv_area     VARCHAR(15) COMMENT '�ջ���������',
    recv_address  VARCHAR(50) COMMENT '�ջ���ϸ��ַ',
    total_price   BIGINT COMMENT '�ܼ�',
    status        INT COMMENT '״̬��0-δ֧����1-��֧����2-��ȡ����3-�ѹرգ�4-�����',
    order_time    DATETIME COMMENT '�µ�ʱ��',
    pay_time      DATETIME COMMENT '֧��ʱ��',
    created_user  VARCHAR(20) COMMENT '������',
    created_time  DATETIME COMMENT '����ʱ��',
    modified_user VARCHAR(20) COMMENT '�޸���',
    modified_time DATETIME COMMENT '�޸�ʱ��',
    PRIMARY KEY (oid)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE t_order_item
(
    id            INT AUTO_INCREMENT COMMENT '�����е���Ʒ��¼��id',
    oid           INT          NOT NULL COMMENT '�������Ķ�����id',
    pid           INT          NOT NULL COMMENT '��Ʒ��id',
    title         VARCHAR(100) NOT NULL COMMENT '��Ʒ����',
    image         VARCHAR(500) COMMENT '��ƷͼƬ',
    price         BIGINT COMMENT '��Ʒ�۸�',
    num           INT COMMENT '��������',
    created_user  VARCHAR(20) COMMENT '������',
    created_time  DATETIME COMMENT '����ʱ��',
    modified_user VARCHAR(20) COMMENT '�޸���',
    modified_time DATETIME COMMENT '�޸�ʱ��',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;