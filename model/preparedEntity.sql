USE corona19;

-- Person 엔터티 추가
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(111, '김00', '서울', '서초구', 30, 'w', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(222, '이00', '서울', '강남구', 28, 'm', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(333, '박00', '서울', '서초구', 80, 'm', '2020-05-10', '2020-05-11', "미국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(444, '최00', '경기도', '시흥시', 47, 'w', '2020-05-10', '2020-05-11', "미국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(555, '한00', '경기도', '부천시', 16, 'm', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(666, '진00', '인천', '부평구', 59, 'm', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(777, '유00', '인천', '계양구', 22, 'm', '2020-05-10', '2020-05-11', "독일");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(888, '강00', '울산', '중구', 21, 'w', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(999, '전00', '울산', '울주군', 47, 'w', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(1010, '김00', '부산', '연제구', 33, 'm', '2020-05-10', '2020-05-11', "캐나다");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(1111, '피00', '대구', '수성구', 28, 'w', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(1212, '방00', '대전', '중구', 25, 'm', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(1313, '나00', '강원도', '원주시', 77, 'm', '2020-05-10', '2020-05-11', "싱가폴");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(1414, '기00', '경상남도', '마산시', 96, 'w', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(1515, '라00', '경상북도', '영주시', 55, 'w', '2020-05-10', '2020-05-11', "대한민국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(1616, '지00', '전라남도', '여수시', 39, 'm', '2020-05-10', '2020-05-11', "영국");
INSERT person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) 
VALUES(1717, '하00', '전라북도', '전주시', 41, 'w', '2020-05-10', '2020-05-11', "대한민국");

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

SELECT * FROM person;
SELECT * FROM hospital;
SELECT * FROM place;
