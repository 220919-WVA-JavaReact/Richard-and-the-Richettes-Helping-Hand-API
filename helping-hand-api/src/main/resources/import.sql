insert into clients (client_id, username, password, "first", "last") values ('clientNumberOneId', 'bobbytables', 'password', 'Bobby', 'Tables');
insert into clients (client_id, username, password, "first", "last") values ('clientNumberTwoId', 'susantables', 'password', 'Susan', 'Tables');

insert into helpers (helper_id, username, password, "first", "last") values ('helperNumberOneId', 'tommytables', 'password', 'Tommy', 'Tables');
insert into helpers (helper_id, username, password, "first", "last") values ('helperNumberTwoId', 'rhondatables', 'password', 'Rhonda', 'Tables');

insert into requests (request_id, client_id, title, description, deadline, availability) values ('requestNumberOneId', 'clientNumberOneId', 'bobbysRequest', 'description', '2023-02-26', 'OPEN');
insert into requests (request_id, client_id, title, description, deadline, availability) values ('requestNumberTwoId', 'clientNumberTwoId', 'susansRequest', 'description', '2023-03-14', 'OPEN');
insert into requests (request_id, client_id, title, description, deadline, availability) values ('requestNumberThreeId', 'clientNumberOneId', 'bobbysOtherRequest', 'description', '2023-07-17', 'OPEN');
insert into requests (request_id, client_id, title, description, deadline, availability) values ('requestNumberFourId', 'clientNumberTwoId', 'susansOtherRequest', 'description', '2023-12-21', 'OPEN');

insert into bids (bid_id, helper_id, request_id, amount, status) values ('bidNumberOneId', 'helperNumberOneId', 'requestNumberOneId', 30, 'PENDING');
insert into bids (bid_id, helper_id, request_id, amount, status) values ('bidNumberTwoId', 'helperNumberTwoId', 'requestNumberOneId', 25, 'PENDING');
insert into bids (bid_id, helper_id, request_id, amount, status) values ('bidNumberThreeId', 'helperNumberOneId', 'requestNumberTwoId', 250, 'PENDING');
insert into bids (bid_id, helper_id, request_id, amount, status) values ('bidNumberFourId', 'helperNumberTwoId', 'requestNumberTwoId', 275, 'PENDING');
insert into bids (bid_id, helper_id, request_id, amount, status) values ('bidNumberFiveId', 'helperNumberOneId', 'requestNumberThreeId', 70, 'PENDING');
insert into bids (bid_id, helper_id, request_id, amount, status) values ('bidNumberSixId', 'helperNumberTwoId', 'requestNumberThreeId', 76, 'PENDING');
insert into bids (bid_id, helper_id, request_id, amount, status) values ('bidNumberSevenId', 'helperNumberOneId', 'requestNumberFourId', 45, 'PENDING');
insert into bids (bid_id, helper_id, request_id, amount, status) values ('bidNumberEightId', 'helperNumberTwoId', 'requestNumberFourId', 42, 'PENDING');