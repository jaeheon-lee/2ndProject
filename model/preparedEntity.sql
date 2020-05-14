USE corona19;

-- Person 엔터티 추가

-- Hospital 엔터티 추가
INSERT hospital(code, name) VALUES(101, '신촌세브란스');
INSERT hospital(code, name) VALUES(102, '서울대학병원');
INSERT hospital(code, name) VALUES(201, '가천길병원');
INSERT hospital(code, name) VALUES(301, '충북백병원');
INSERT hospital(code, name) VALUES(401, '충남병원');
INSERT hospital(code, name) VALUES(603, '전북병원');
INSERT hospital(code, name) VALUES(703, '전북병원');
INSERT hospital(code, name) VALUES(801, '경북병원');
INSERT hospital(code, name) VALUES(901, '경남병원');
INSERT hospital(code, name) VALUES(891, '대구병원');

-- Place 엔터티 추가
INSERT INTO place(address, name) VALUES('111번지', '떡볶이집');
INSERT INTO place(address, name) VALUES('222번지', '레스토랑');
INSERT INTO place(address, name) VALUES('333번지', '영화관');
INSERT INTO place(address, name) VALUES('444번지', '지하철');
INSERT INTO place(address, name) VALUES('555번지', '회사');
INSERT INTO place(address, name) VALUES('666번지', '클럽');
INSERT INTO place(address, name) VALUES('777번지', '마트');
INSERT INTO place(address, name) VALUES('888번지', '백화점');
INSERT INTO place(address, name) VALUES('999번지', '차량정비소');
INSERT INTO place(address, name) VALUES('1010번지', '주유소');

SELECT * FROM place;