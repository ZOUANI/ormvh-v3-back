INSERT INTO role (id, authority, created_at, updated_at, created_by, updated_by) VALUES
(10, 'ADMIN', NULL, NULL, NULL, NULL),
(13, 'USER', NULL, NULL, NULL, NULL),
(15, 'AGENT_BO', NULL, NULL, NULL, NULL),
(16, 'DIRECTEUR', NULL, NULL, NULL, NULL),
(17, 'CHEF_DE_SERVICE', NULL, NULL, NULL, NULL),
(18, 'AGENT_CAI', NULL, NULL, NULL, NULL),
(19, 'CHARGE_DE_REQUETE', NULL, NULL, NULL, NULL),
(20, 'CHARGE_DE_TRAITEMENT_COURRIER', NULL, NULL, NULL, NULL);

INSERT INTO user (id, account_non_expired, account_non_locked, created_at, credentials_non_expired, email, enabled, password, updated_at, username, created_by, updated_by) VALUES
(12, b'1', b'1', '2020-07-22 14:06:35', b'1', 'admin@gmail.com', b'1', '$2a$10$yesMI6MKbWs8H7wothzNR.TcTVz6zqTRjBQUbuUT83ZwqCVj1NAhG', NULL, 'admin', NULL, NULL),
(29, b'1', b'1', '2020-07-22 14:54:54', b'1', 'ismail@gmail.com', b'1', '$2a$10$LTrcvoKU7/3eRvyl8/WN8.YZWAWaI61KwiH/nimw.VVsKJ2W7s.jK', NULL, 'ismail', NULL, NULL);

INSERT INTO user_roles (user_id, roles) VALUES
(12, 10),
(29, 13),
(29, 15)