-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  sam. 09 jan. 2021 à 17:05
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `ormvah`
--

-- --------------------------------------------------------

--
-- Structure de la table `bordereau`
--

DROP TABLE IF EXISTS `bordereau`;
CREATE TABLE IF NOT EXISTS `bordereau` (
                                           `id` bigint(20) NOT NULL,
                                           `created_at` datetime DEFAULT NULL,
                                           `date_bordereaux` datetime DEFAULT NULL,
                                           `description` varchar(255) DEFAULT NULL,
                                           `libelle` varchar(255) DEFAULT NULL,
                                           `nombre_piece_jointe` int(11) DEFAULT NULL,
                                           `updated_at` datetime DEFAULT NULL,
                                           `created_by` bigint(20) DEFAULT NULL,
                                           `updated_by` bigint(20) DEFAULT NULL,
                                           PRIMARY KEY (`id`),
                                           KEY `FK6gkswjc4l3l47gv1qqu6eq6fh` (`created_by`),
                                           KEY `FKn63bbqguf30stbadrpb8jllhq` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `categorie_model_lettre_reponse`
--

DROP TABLE IF EXISTS `categorie_model_lettre_reponse`;
CREATE TABLE IF NOT EXISTS `categorie_model_lettre_reponse` (
                                                                `id` bigint(20) NOT NULL,
                                                                `created_at` datetime DEFAULT NULL,
                                                                `libelle` varchar(255) DEFAULT NULL,
                                                                `updated_at` datetime DEFAULT NULL,
                                                                `created_by` bigint(20) DEFAULT NULL,
                                                                `updated_by` bigint(20) DEFAULT NULL,
                                                                PRIMARY KEY (`id`),
                                                                KEY `FKj9sm46ctmgl8lswt8nsd2stb8` (`created_by`),
                                                                KEY `FK2prxms1gk884t3g8469fl8ir5` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `categorie_model_lettre_reponse`
--

INSERT INTO `categorie_model_lettre_reponse` (`id`, `created_at`, `libelle`, `updated_at`, `created_by`, `updated_by`) VALUES
(135, '2020-08-26 14:23:36', 'cat1', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `courrier`
--

DROP TABLE IF EXISTS `courrier`;
CREATE TABLE IF NOT EXISTS `courrier` (
                                          `id` bigint(20) NOT NULL,
                                          `accuse` bit(1) DEFAULT NULL,
                                          `created_at` date DEFAULT NULL,
                                          `date_accuse` datetime DEFAULT NULL,
                                          `date_relance` datetime DEFAULT NULL,
                                          `date_reponse` datetime DEFAULT NULL,
                                          `delai` double DEFAULT NULL,
                                          `description` varchar(255) DEFAULT NULL,
                                          `destinataire_desc` varchar(255) DEFAULT NULL,
                                          `destinataire_ville` varchar(255) DEFAULT NULL,
                                          `expediteur_desc` varchar(255) DEFAULT NULL,
                                          `id_courrier` varchar(255) DEFAULT NULL,
                                          `instruction` varchar(255) DEFAULT NULL,
                                          `received_at` datetime DEFAULT NULL,
                                          `relance` double DEFAULT NULL,
                                          `reponse` bit(1) DEFAULT NULL,
                                          `sent_at` datetime DEFAULT NULL,
                                          `subject` varchar(255) DEFAULT NULL,
                                          `updated_at` datetime DEFAULT NULL,
                                          `coordinator` bigint(20) DEFAULT NULL,
                                          `courrier_object` bigint(20) DEFAULT NULL,
                                          `created_by` bigint(20) DEFAULT NULL,
                                          `destinator` bigint(20) DEFAULT NULL,
                                          `emetteur` bigint(20) DEFAULT NULL,
                                          `evaluation` bigint(20) DEFAULT NULL,
                                          `expeditor` bigint(20) DEFAULT NULL,
                                          `linked_to` bigint(20) DEFAULT NULL,
                                          `nature_courrier` bigint(20) DEFAULT NULL,
                                          `status` bigint(20) DEFAULT NULL,
                                          `subdivision` bigint(20) DEFAULT NULL,
                                          `type_courrier` bigint(20) DEFAULT NULL,
                                          `updated_by` bigint(20) DEFAULT NULL,
                                          `voie` bigint(20) DEFAULT NULL,
                                          `etat_courrier` bigint(22) DEFAULT NULL,
                                          `type` varchar(255) DEFAULT NULL,
                                          `nature_client` bigint(20) DEFAULT NULL,
                                          `phase_admin` bigint(20) DEFAULT NULL,
                                          `sujet` varchar(255) DEFAULT NULL,
                                          `date_traitement` datetime DEFAULT NULL,
                                          `cre_coated_by` bigint(20) DEFAULT NULL,
                                          `type_requette` bigint(20) DEFAULT NULL,
                                          `delai_reponse` bigint(20) DEFAULT NULL,
                                          `trimestre` int(11) DEFAULT NULL,
                                          `annee` int(11) DEFAULT NULL,
                                          PRIMARY KEY (`id`),
                                          KEY `FKfewtkf0c9rqftanl1m153ccs7` (`coordinator`),
                                          KEY `FKp0wri89e8lweagigu4ueumsbs` (`courrier_object`),
                                          KEY `FKtaaceqyx1ct2e5o194ht3y08f` (`created_by`),
                                          KEY `FKitv6r9l49dmnwlcwp29vodaa4` (`destinator`),
                                          KEY `FK4xc6pt5n014iwdqd8f6i0o34f` (`emetteur`),
                                          KEY `FKf8h14jiti81ktoe6b7wcctg2c` (`evaluation`),
                                          KEY `FKi70a9drw6pkixh2rb60ej4vt3` (`expeditor`),
                                          KEY `FK500qa7hg23jbdtix57gh0so61` (`linked_to`),
                                          KEY `FK9m79qbghu1wrrhs01a2ejo3hj` (`nature_courrier`),
                                          KEY `FKgu5g9y1loj73wttvyq3l28um7` (`status`),
                                          KEY `FKe3lojwidl47w3h13ergm69wtj` (`subdivision`),
                                          KEY `FKfuht770sx8omvlmu018bmev92` (`type_courrier`),
                                          KEY `FK2de3vr9jplymuqc1raucdthtt` (`updated_by`),
                                          KEY `FKhhl4cif4ydpmevjf34dlil9wx` (`voie`),
                                          KEY `FKf6rnop3i8qflexd4xk3ofom5i` (`cre_coated_by`),
                                          KEY `FKbemj4qmhvn22b115evbrtxapd` (`etat_courrier`),
                                          KEY `FK190pbhlxon6qtc7ttajv4k7c9` (`nature_client`),
                                          KEY `FK3sg0mmw6b9kek7l9h46n931mr` (`phase_admin`),
                                          KEY `FKopkgf5y00xhw8nibamcm8ycn0` (`type_requette`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `courrier`
--

INSERT INTO `courrier` (`id`, `accuse`, `created_at`, `date_accuse`, `date_relance`, `date_reponse`, `delai`, `description`, `destinataire_desc`, `destinataire_ville`, `expediteur_desc`, `id_courrier`, `instruction`, `received_at`, `relance`, `reponse`, `sent_at`, `subject`, `updated_at`, `coordinator`, `courrier_object`, `created_by`, `destinator`, `emetteur`, `evaluation`, `expeditor`, `linked_to`, `nature_courrier`, `status`, `subdivision`, `type_courrier`, `updated_by`, `voie`, `etat_courrier`, `type`, `nature_client`, `phase_admin`, `sujet`, `date_traitement`, `cre_coated_by`, `type_requette`, `delai_reponse`, `trimestre`, `annee`) VALUES
(670, NULL, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, '000001-2020', NULL, NULL, 7, NULL, NULL, 'cour 1 : info+ ( saf et rh)\nhowa sortie', NULL, 4, NULL, 12, NULL, NULL, NULL, NULL, NULL, 5, 1, NULL, 2, NULL, 1, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(674, NULL, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, '000002-2020', 'ins 02', NULL, 4, NULL, NULL, 'cour 02 + (finnance + info et (saf))\ntestinggggg', NULL, 1, NULL, 12, NULL, NULL, NULL, NULL, 670, 2, NULL, NULL, 1, NULL, 1, 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(694, NULL, '2020-12-09', NULL, NULL, NULL, 8, NULL, NULL, NULL, NULL, '000003-2020', NULL, NULL, 10, NULL, NULL, NULL, NULL, NULL, NULL, 12, NULL, NULL, NULL, NULL, NULL, 4, 1, NULL, 1, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(695, NULL, NULL, NULL, NULL, NULL, 3, NULL, NULL, NULL, NULL, '000004-2020', NULL, NULL, 7, NULL, NULL, NULL, NULL, NULL, NULL, 12, NULL, NULL, NULL, NULL, NULL, 3, 1, 1, 1, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(725, NULL, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, '000005-2020', NULL, NULL, 7, NULL, NULL, NULL, NULL, NULL, NULL, 12, NULL, NULL, NULL, NULL, NULL, 5, 1, NULL, 2, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(730, NULL, NULL, NULL, NULL, NULL, 3, NULL, NULL, NULL, NULL, '000006-2020', 'my insc 06', NULL, 7, NULL, NULL, 'hada cour 06\ntesttttttyyy', NULL, 229, NULL, 495, NULL, NULL, NULL, NULL, NULL, 3, NULL, NULL, 1, NULL, 1, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(770, NULL, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, '000007-2020', 'ins 07', NULL, 4, NULL, NULL, 'obj 000007-2020', NULL, 4, NULL, 495, NULL, NULL, NULL, NULL, NULL, 2, 1, NULL, 1, NULL, 1, 4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL),
(814, NULL, '2021-01-04', NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, '2021-000008', NULL, NULL, 4, NULL, '2021-01-18 15:19:29', NULL, NULL, NULL, 2, 12, NULL, NULL, 1, NULL, NULL, 2, 2, 5, 1, NULL, 1, NULL, NULL, 5, 2, NULL, NULL, NULL, 1, NULL, 1, 2021);

-- --------------------------------------------------------

--
-- Structure de la table `courrier_courriers_piece_joint`
--

DROP TABLE IF EXISTS `courrier_courriers_piece_joint`;
CREATE TABLE IF NOT EXISTS `courrier_courriers_piece_joint` (
                                                                `courrier_id` bigint(20) NOT NULL,
                                                                `courriers_piece_joint` bigint(20) NOT NULL,
                                                                UNIQUE KEY `UK_2rubccryq5x0iqakddb1trrar` (`courriers_piece_joint`),
                                                                KEY `FKsoreatlnofo72m55y8fjlrh3q` (`courrier_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `courrier_object`
--

DROP TABLE IF EXISTS `courrier_object`;
CREATE TABLE IF NOT EXISTS `courrier_object` (
                                                 `id` bigint(20) NOT NULL,
                                                 `code` varchar(255) DEFAULT NULL,
                                                 `created_at` datetime DEFAULT NULL,
                                                 `title` varchar(255) DEFAULT NULL,
                                                 `title_arab` varchar(255) DEFAULT NULL,
                                                 `updated_at` datetime DEFAULT NULL,
                                                 `created_by` bigint(20) DEFAULT NULL,
                                                 `updated_by` bigint(20) DEFAULT NULL,
                                                 PRIMARY KEY (`id`),
                                                 KEY `FKp9g8cgwdpsg0bb5u84g9mnrxd` (`created_by`),
                                                 KEY `FK9561pddl442c5ec8fu82aol6a` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `courrier_object`
--

INSERT INTO `courrier_object` (`id`, `code`, `created_at`, `title`, `title_arab`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, NULL, 'CORRECTION DU NOM DE L\'EXPLOITANT', NULL, NULL, NULL, NULL),
(2, NULL, NULL, 'DEMANDE D\'ATTESTATION', NULL, NULL, NULL, NULL),
(3, NULL, NULL, 'DEMANDE D\'ACTUALISATION DE L\'ENQU?TE FONCIERE', NULL, NULL, NULL, NULL),
(4, NULL, NULL, 'AUTRES', NULL, NULL, NULL, NULL),
(5, NULL, NULL, 'DEMANDE D\'INFORMATION', NULL, NULL, NULL, NULL),
(6, NULL, NULL, 'EXPROPRIATION', NULL, NULL, NULL, NULL),
(7, NULL, NULL, 'IND?MNISATION', NULL, NULL, NULL, NULL),
(8, NULL, NULL, 'DEMANDE D\'AUDIENCE', NULL, NULL, NULL, NULL),
(9, NULL, NULL, 'DEMANDE DE POSSESSION DE CLES DE BORNE', NULL, NULL, NULL, NULL),
(10, NULL, NULL, 'LITIGES ENTRES AYANTS DROITS OU AGRICULTEURS', NULL, NULL, NULL, NULL),
(11, NULL, NULL, 'R??CHELONNEMENT DE DETTES ET FACILIT?S DE PAIEMENT', NULL, NULL, NULL, NULL),
(12, NULL, NULL, 'DEMANDE DE CREUSEMENT DE PUIT', NULL, NULL, NULL, NULL),
(13, NULL, NULL, 'VOL D?EAU ET VANDALISME', NULL, NULL, NULL, NULL),
(14, NULL, NULL, 'DEMANDE D\'ESSAI DE LA CONDUITE PRINCIPALE', NULL, NULL, NULL, NULL),
(15, NULL, NULL, 'IMPLANTATION D\'OUVRAGE', NULL, NULL, NULL, NULL),
(16, NULL, NULL, 'REPARATION REMPLACEMENT DE CONDUITE PRINCIPALE', NULL, NULL, NULL, NULL),
(17, NULL, NULL, 'DEMANDE DE RETABLISSEMENT DES LIMITES DES PARCELLES', NULL, NULL, NULL, NULL),
(18, NULL, NULL, 'DEMANDE D\'ARR?T D\'IRRIGATION', NULL, NULL, NULL, NULL),
(19, NULL, NULL, 'ACCELERATION DES TRAVAUX DES EQUIPEMENTS INTERNES', NULL, NULL, NULL, NULL),
(20, NULL, NULL, 'IMPLANTATION DE BORNE', NULL, NULL, NULL, NULL),
(21, NULL, NULL, 'DEMANDE D\'EAU D\'IRRIGATION POUR LA MISE EN EAU DES SECTEURS EQUIPES EN GG', NULL, NULL, NULL, NULL),
(22, NULL, NULL, 'DEMANDE DE TRANSFERT D\'EAU ENTRE PARCELLES', NULL, NULL, NULL, NULL),
(23, NULL, NULL, 'CHANGEMENT D\'ELEMENTS D\'IRRIGATION', NULL, NULL, NULL, NULL),
(24, NULL, NULL, 'CORRECTION SUPERFICIE', NULL, NULL, NULL, NULL),
(25, NULL, NULL, 'RACCORDEMENT D\'UNE BORNE D\'IRRIGATION AU BASSIN DE STOCKAGE', NULL, NULL, NULL, NULL),
(26, NULL, NULL, 'AJOUT D\'UNE NOUVELLE BORNE', NULL, NULL, NULL, NULL),
(27, NULL, NULL, 'DEMANDE DE CHANGEMENT DE PRISE PROPRIETE', NULL, NULL, NULL, NULL),
(28, NULL, NULL, 'DEGATS CAUSES PAR LES TRAVAUX', NULL, NULL, NULL, NULL),
(29, NULL, NULL, 'DEMANDE DE REVISION DE LA REDEVANCE D\'EAU D\'IRRIGATION', NULL, NULL, NULL, NULL),
(30, NULL, NULL, 'ACC?S ? LA PARCELLE', NULL, NULL, NULL, NULL),
(31, NULL, NULL, 'DEMANDE D\'AMENAGEMENT DE SEGUIA', NULL, NULL, NULL, NULL),
(32, NULL, NULL, 'DEMANDE D\'ACCES A L\'IRRIGATION LOCALISEE', NULL, NULL, NULL, NULL),
(33, NULL, NULL, 'DEMANDE DE REVISION DE DOTATIONS', NULL, NULL, NULL, NULL),
(34, NULL, NULL, 'DEMANDE D\'EAU D\'IRRIGATION', NULL, NULL, NULL, NULL),
(35, NULL, NULL, 'DEMANDE D\'ENREGISTREMENT D\'UNE PARCELLE', NULL, NULL, NULL, NULL),
(36, NULL, NULL, 'REMEMBREMENT', NULL, NULL, NULL, NULL),
(37, NULL, NULL, 'ELABORATION DE PROGRAMME D\'IRRIGATION', NULL, NULL, NULL, NULL),
(38, NULL, NULL, 'DISTRIBUTION D\'EAU D\'IRRIGATION', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `courrier_piece_joint`
--

DROP TABLE IF EXISTS `courrier_piece_joint`;
CREATE TABLE IF NOT EXISTS `courrier_piece_joint` (
                                                      `id` bigint(20) NOT NULL,
                                                      `chemin` varchar(255) DEFAULT NULL,
                                                      `contenu` longblob DEFAULT NULL,
                                                      `courier` bigint(20) DEFAULT NULL,
                                                      `type` varchar(255) DEFAULT NULL,
                                                      PRIMARY KEY (`id`),
                                                      KEY `FKsieodhpeealaopxstmlxdgpf4` (`courier`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `courrier_piece_joint`
--

INSERT INTO `courrier_piece_joint` (`id`, `chemin`, `contenu`, `courier`, `type`) VALUES
(668, 'Capture001.png', NULL, 577, NULL),
(794, 'the-problems-of-philosophy-bertrand-russell.pdf', NULL, 670, NULL),
(795, 'ang-CV-ZOUANIYOUNES.pdf', NULL, 670, NULL),
(796, 'ZOUANIYOUNES .pdf', NULL, 670, NULL),
(797, 'ZOUANIYOUNES.pdf', NULL, 670, NULL),
(798, 'scenario.PNG', NULL, 670, NULL),
(803, '20170823_222923.jpg', NULL, 670, NULL),
(804, '20170823_222923.jpg', NULL, 670, NULL),
(805, 'Me.png', NULL, 670, NULL),
(810, '20170823_222923.jpg', NULL, 770, NULL),
(811, '20170823_222923.jpg', NULL, 770, NULL),
(812, 'Me.png', NULL, 770, NULL),
(813, 'ang-CV-ZOUANIYOUNES.pdf', NULL, 770, NULL),
(816, '1609779336732.jpg', NULL, 814, NULL),
(815, '1609779336732.jpg', NULL, 814, NULL),
(817, '1609779337013.png', NULL, 814, NULL),
(818, '1609779396331.jpg', NULL, 725, NULL),
(819, '1609779396357.jpg', NULL, 725, NULL),
(820, '1609779396640.PNG', NULL, 725, NULL),
(837, '1610202872417.PNG', NULL, 770, NULL),
(838, '1610202872418.PNG', NULL, 770, NULL),
(839, '1610202872773.png', NULL, 770, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `courrier_service_item`
--

DROP TABLE IF EXISTS `courrier_service_item`;
CREATE TABLE IF NOT EXISTS `courrier_service_item` (
                                                       `id` bigint(20) NOT NULL,
                                                       `courrier` bigint(20) DEFAULT NULL,
                                                       `service` bigint(20) DEFAULT NULL,
                                                       `coordinateur` bit(1) NOT NULL,
                                                       PRIMARY KEY (`id`),
                                                       KEY `FK4f92rw2klc644bo3lqls3i5gw` (`courrier`),
                                                       KEY `FKd60c9ff3ubxrlttvbixbfr6xc` (`service`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `courrier_service_item`
--

INSERT INTO `courrier_service_item` (`id`, `courrier`, `service`, `coordinateur`) VALUES
(809, 670, 4, b'1'),
(808, 670, 3, b'0'),
(807, 670, 1, b'0'),
(724, 674, 1, b'1'),
(723, 674, 4, b'0'),
(722, 674, 229, b'0'),
(806, 670, 4, b'1'),
(721, 674, 1, b'1'),
(769, 730, 229, b'1'),
(768, 730, 4, b'0'),
(767, 730, 1, b'0'),
(766, 730, 229, b'1'),
(835, 770, 1, b'0'),
(834, 770, 3, b'0'),
(833, 770, 4, b'1'),
(836, 770, 4, b'1');

-- --------------------------------------------------------

--
-- Structure de la table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
                                          `id` bigint(20) NOT NULL,
                                          `created_at` datetime DEFAULT NULL,
                                          `title` varchar(255) DEFAULT NULL,
                                          `updated_at` datetime DEFAULT NULL,
                                          `created_by` bigint(20) DEFAULT NULL,
                                          `updated_by` bigint(20) DEFAULT NULL,
                                          `user` bigint(20) DEFAULT NULL,
                                          PRIMARY KEY (`id`),
                                          KEY `FKh6upy6rk0yre0qn8vpoaml42` (`created_by`),
                                          KEY `FK9vmtgftjgkpe20dviha06na3j` (`updated_by`),
                                          KEY `FKjdyul4cmndt1b48vw1166bee5` (`user`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `employee`
--

INSERT INTO `employee` (`id`, `created_at`, `title`, `updated_at`, `created_by`, `updated_by`, `user`) VALUES
(103, '2020-07-25 21:00:16', 'ana', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `etat_courrier`
--

DROP TABLE IF EXISTS `etat_courrier`;
CREATE TABLE IF NOT EXISTS `etat_courrier` (
                                               `id` bigint(20) NOT NULL,
                                               `libelle` varchar(255) DEFAULT NULL,
                                               `libelle_arab` varchar(255) DEFAULT NULL,
                                               `code` varchar(30) NOT NULL,
                                               PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etat_courrier`
--

INSERT INTO `etat_courrier` (`id`, `libelle`, `libelle_arab`, `code`) VALUES
(1, 'Initialisation', 'Initialisation', 'init'),
(2, 'Directeur', 'Directeur', 'directeur'),
(3, 'Chef', 'Chef', 'chef'),
(4, 'Bureau', 'Bureau', 'bureau'),
(5, 'Cloturé', 'Cloturé', 'cloture');

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
CREATE TABLE IF NOT EXISTS `evaluation` (
                                            `id` bigint(20) NOT NULL,
                                            `code` varchar(255) DEFAULT NULL,
                                            `created_at` datetime DEFAULT NULL,
                                            `libelle_arab` varchar(255) DEFAULT NULL,
                                            `title` varchar(255) DEFAULT NULL,
                                            `updated_at` datetime DEFAULT NULL,
                                            `created_by` bigint(20) DEFAULT NULL,
                                            `updated_by` bigint(20) DEFAULT NULL,
                                            PRIMARY KEY (`id`),
                                            KEY `FKti27i5dnq6c5wny1qdlrmt24p` (`created_by`),
                                            KEY `FK3lulnggknaoagbivhw8yfqt4k` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `evaluation`
--

INSERT INTO `evaluation` (`id`, `code`, `created_at`, `libelle_arab`, `title`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, 'conforme', NULL, NULL, 'Requ?te conforme', NULL, NULL, NULL),
(2, 'justice', NULL, NULL, 'Objet est devant la justice ou une autre autorit? comp?tente / d?cision judiciaire rendu', NULL, NULL, NULL),
(3, 'hors champs', NULL, NULL, 'Objet hors champs de mission de l?ORMVAH', NULL, NULL, NULL),
(4, 'Insultes', NULL, NULL, 'Insultes ou diffamation', NULL, NULL, NULL),
(5, 'Art 7', NULL, NULL, 'Non-conformit? au mod?le (Article 7 d?cret 2.17.265)', NULL, NULL, NULL),
(6, 'non clair', NULL, NULL, 'Manque de clart? et absence de documents et arguments', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `expeditor`
--

DROP TABLE IF EXISTS `expeditor`;
CREATE TABLE IF NOT EXISTS `expeditor` (
                                           `id` bigint(20) NOT NULL,
                                           `adress` varchar(255) DEFAULT NULL,
                                           `age` int(11) DEFAULT NULL,
                                           `code` varchar(255) DEFAULT NULL,
                                           `created_at` datetime DEFAULT NULL,
                                           `description` varchar(255) DEFAULT NULL,
                                           `nature` varchar(255) DEFAULT NULL,
                                           `title` varchar(255) DEFAULT NULL,
                                           `title_arab` varchar(255) DEFAULT NULL,
                                           `updated_at` datetime DEFAULT NULL,
                                           `created_by` bigint(20) DEFAULT NULL,
                                           `nationality` bigint(20) DEFAULT NULL,
                                           `sexe` bigint(20) DEFAULT NULL,
                                           `updated_by` bigint(20) DEFAULT NULL,
                                           `expeditor_type` bigint(20) DEFAULT NULL,
                                           `date_naissance` date DEFAULT NULL,
                                           PRIMARY KEY (`id`),
                                           KEY `FKgbum88m2dbutcw99y3eafqacs` (`created_by`),
                                           KEY `FK6kiiph3fylfat5074mu2unn71` (`nationality`),
                                           KEY `FK3v83k82rjrcv7ja5yo4gt7ha8` (`sexe`),
                                           KEY `FKfl5pti1md0or189byi2448xqj` (`updated_by`),
                                           KEY `FKbwwl1jw7ej4fqbolmashi69cu` (`expeditor_type`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `expeditor`
--

INSERT INTO `expeditor` (`id`, `adress`, `age`, `code`, `created_at`, `description`, `nature`, `title`, `title_arab`, `updated_at`, `created_by`, `nationality`, `sexe`, `updated_by`, `expeditor_type`, `date_naissance`) VALUES
(232, 'MARRAKECH', 22, 'CAP', '2020-09-25 11:30:49', NULL, 'PM', 'CAP ENG', 'CAP ENG', NULL, NULL, 1, 2, NULL, 1, NULL),
(777, 'MARRAKECH', 56, 'SDAD', '2020-12-19 22:08:35', 'SDAD ABDALI', NULL, 'SOCIETE IT', NULL, NULL, 12, 1, 1, NULL, 3, NULL),
(326, 'NEW YORK', 12, 'IBM', '2020-10-26 18:53:19', NULL, 'IBM', 'IBM', NULL, NULL, NULL, 2, 1, NULL, 3, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `expeditor_type`
--

DROP TABLE IF EXISTS `expeditor_type`;
CREATE TABLE IF NOT EXISTS `expeditor_type` (
                                                `id` bigint(20) NOT NULL,
                                                `code` varchar(255) DEFAULT NULL,
                                                `created_at` datetime DEFAULT NULL,
                                                `libelle_arab` varchar(255) DEFAULT NULL,
                                                `title` varchar(255) DEFAULT NULL,
                                                `updated_at` datetime DEFAULT NULL,
                                                `created_by` bigint(20) DEFAULT NULL,
                                                `updated_by` bigint(20) DEFAULT NULL,
                                                PRIMARY KEY (`id`),
                                                KEY `FKncsp6c864cd3fdvg3tt86meoi` (`created_by`),
                                                KEY `FK5hfyrmv5v50q6ypv4bmhqriw5` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `expeditor_type`
--

INSERT INTO `expeditor_type` (`id`, `code`, `created_at`, `libelle_arab`, `title`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, NULL, NULL, 'AGRICULTEUR', NULL, NULL, NULL),
(2, NULL, NULL, NULL, 'AUEA', NULL, NULL, NULL),
(3, NULL, NULL, NULL, 'CAIDAT', NULL, NULL, NULL),
(4, NULL, NULL, NULL, 'DIAEA', NULL, NULL, NULL),
(5, NULL, NULL, NULL, 'MAPMDREF', NULL, NULL, NULL),
(6, NULL, NULL, NULL, 'DRA', NULL, NULL, NULL),
(7, NULL, NULL, NULL, 'SOCIETE PRIVEE', NULL, NULL, NULL),
(8, NULL, NULL, NULL, 'CGTC', NULL, NULL, NULL),
(9, NULL, NULL, NULL, 'COMMUNE', NULL, NULL, NULL),
(10, NULL, NULL, NULL, 'PROVINCE', NULL, NULL, NULL),
(11, NULL, NULL, NULL, 'WILAYA', NULL, NULL, NULL),
(12, NULL, NULL, NULL, 'COORDINATION', NULL, NULL, NULL),
(13, NULL, NULL, NULL, 'SUBDIVISION', NULL, NULL, NULL),
(14, NULL, NULL, NULL, 'SYNDICATE  NATIONAL', NULL, NULL, NULL),
(15, NULL, NULL, NULL, 'COOPERATIVE', NULL, NULL, NULL),
(16, NULL, NULL, NULL, 'ORMVAH', NULL, NULL, NULL),
(17, NULL, NULL, NULL, 'CMV', NULL, NULL, NULL),
(18, NULL, NULL, NULL, 'DOMAINE', NULL, NULL, NULL),
(19, NULL, NULL, NULL, 'ADA', NULL, NULL, NULL),
(20, NULL, NULL, NULL, 'ABH', NULL, NULL, NULL),
(21, NULL, NULL, NULL, 'FH2MRE', NULL, NULL, NULL),
(22, NULL, NULL, NULL, 'ASSOCIATION', NULL, NULL, NULL),
(23, NULL, NULL, NULL, 'AUTRES', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(840);

-- --------------------------------------------------------

--
-- Structure de la table `le_service`
--

DROP TABLE IF EXISTS `le_service`;
CREATE TABLE IF NOT EXISTS `le_service` (
                                            `id` bigint(20) NOT NULL,
                                            `code` varchar(255) DEFAULT NULL,
                                            `created_at` datetime DEFAULT NULL,
                                            `description` varchar(255) DEFAULT NULL,
                                            `libelle_arab` varchar(255) DEFAULT NULL,
                                            `title` varchar(255) DEFAULT NULL,
                                            `updated_at` datetime DEFAULT NULL,
                                            `chef` bigint(20) DEFAULT NULL,
                                            `created_by` bigint(20) DEFAULT NULL,
                                            `updated_by` bigint(20) DEFAULT NULL,
                                            PRIMARY KEY (`id`),
                                            KEY `FK7fy0javtxnmpe7ibl4lg2wcm1` (`chef`),
                                            KEY `FKa5bxasmhhr90beun0js8qat15` (`created_by`),
                                            KEY `FK3q1eprsx1jdj8v2sfklw1vdl2` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `le_service`
--

INSERT INTO `le_service` (`id`, `code`, `created_at`, `description`, `libelle_arab`, `title`, `updated_at`, `chef`, `created_by`, `updated_by`) VALUES
(1, 'saf', NULL, NULL, NULL, 'SAF', NULL, 480, NULL, NULL),
(2, 'cai', NULL, NULL, NULL, 'CAI', NULL, 479, NULL, NULL),
(3, 'rh', NULL, NULL, NULL, 'RH', NULL, 482, NULL, NULL),
(4, 'info', NULL, NULL, NULL, 'INFO', NULL, 481, NULL, NULL),
(229, 'finnance', '2020-09-25 09:34:55', 'Finnance', 'Finnance', 'Finnance', NULL, 483, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `model_lettre_reponse`
--

DROP TABLE IF EXISTS `model_lettre_reponse`;
CREATE TABLE IF NOT EXISTS `model_lettre_reponse` (
                                                      `id` bigint(20) NOT NULL,
                                                      `chemin` varchar(255) DEFAULT NULL,
                                                      `code` varchar(255) DEFAULT NULL,
                                                      `created_at` datetime DEFAULT NULL,
                                                      `libelle` varchar(255) DEFAULT NULL,
                                                      `libelle_arab` varchar(255) DEFAULT NULL,
                                                      `updated_at` datetime DEFAULT NULL,
                                                      `categorie_model_lettre_reponse` bigint(20) DEFAULT NULL,
                                                      `created_by` bigint(20) DEFAULT NULL,
                                                      `lettre_model` varchar(255) DEFAULT NULL,
                                                      `updated_by` bigint(20) DEFAULT NULL,
                                                      `data` longblob DEFAULT NULL,
                                                      `type` varchar(255) DEFAULT NULL,
                                                      `url` varchar(255) DEFAULT NULL,
                                                      PRIMARY KEY (`id`),
                                                      KEY `FKjw7xns5j9xgnh7tt6uafgjgwi` (`lettre_model`(250)),
                                                      KEY `FKsknf0gs7ad73ubserc4xcxjxa` (`categorie_model_lettre_reponse`),
                                                      KEY `FKatm7e4x54y0ob59a7yglgrh6` (`created_by`),
                                                      KEY `FKexgv3qtocv9woyeej5hj4v7g2` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `nationality`
--

DROP TABLE IF EXISTS `nationality`;
CREATE TABLE IF NOT EXISTS `nationality` (
                                             `id` bigint(20) NOT NULL,
                                             `created_at` datetime DEFAULT NULL,
                                             `libelle` varchar(255) DEFAULT NULL,
                                             `updated_at` datetime DEFAULT NULL,
                                             `created_by` bigint(20) DEFAULT NULL,
                                             `updated_by` bigint(20) DEFAULT NULL,
                                             PRIMARY KEY (`id`),
                                             KEY `FKb2ahwwuq533f9cmlo77whxew4` (`created_by`),
                                             KEY `FKqf2kj71xo87mg57s7f2kgjf6n` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `nationality`
--

INSERT INTO `nationality` (`id`, `created_at`, `libelle`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, 'Maroc', NULL, NULL, NULL),
(2, NULL, 'Francais', NULL, NULL, NULL),
(100, '2020-07-25 20:25:47', 'Americain', NULL, 12, NULL),
(101, '2020-07-24 23:00:00', 'Belguim', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `nature_client`
--

DROP TABLE IF EXISTS `nature_client`;
CREATE TABLE IF NOT EXISTS `nature_client` (
                                               `id` bigint(20) NOT NULL,
                                               `code` varchar(255) DEFAULT NULL,
                                               `created_at` datetime DEFAULT NULL,
                                               `libelle` varchar(255) DEFAULT NULL,
                                               `libelle_arab` varchar(255) DEFAULT NULL,
                                               `updated_at` datetime DEFAULT NULL,
                                               `created_by` bigint(20) DEFAULT NULL,
                                               `updated_by` bigint(20) DEFAULT NULL,
                                               PRIMARY KEY (`id`),
                                               KEY `FKpl91jy38wyn5x1hru7bh8y349` (`created_by`),
                                               KEY `FKribsm8k5edm76dlr0vcrahxwt` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `nature_client`
--

INSERT INTO `nature_client` (`id`, `code`, `created_at`, `libelle`, `libelle_arab`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, 'personne physique', NULL, 'Personne Physique', NULL, NULL, NULL, NULL),
(2, 'entreprise', NULL, 'Entreprise', NULL, NULL, NULL, NULL),
(3, 'association', NULL, 'Association', NULL, NULL, NULL, NULL),
(4, 'cooperative', NULL, 'Cooperative', NULL, NULL, NULL, NULL),
(5, 'interprofession', NULL, 'Interprofession', NULL, NULL, NULL, NULL),
(6, 'autres', NULL, 'Autres', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `nature_courrier`
--

DROP TABLE IF EXISTS `nature_courrier`;
CREATE TABLE IF NOT EXISTS `nature_courrier` (
                                                 `id` bigint(20) NOT NULL,
                                                 `code` varchar(255) DEFAULT NULL,
                                                 `created_at` datetime DEFAULT NULL,
                                                 `delai` double DEFAULT NULL,
                                                 `libelle` varchar(255) DEFAULT NULL,
                                                 `libelle_arab` varchar(255) DEFAULT NULL,
                                                 `relance` double DEFAULT NULL,
                                                 `updated_at` datetime DEFAULT NULL,
                                                 `created_by` bigint(20) DEFAULT NULL,
                                                 `updated_by` bigint(20) DEFAULT NULL,
                                                 `categorie` int(11) NOT NULL,
                                                 PRIMARY KEY (`id`),
                                                 KEY `FKsq9psn4bypmvmneic9t8qr1hj` (`created_by`),
                                                 KEY `FK27y7nsuotb1ccifkreq8tl1oj` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `nature_courrier`
--

INSERT INTO `nature_courrier` (`id`, `code`, `created_at`, `delai`, `libelle`, `libelle_arab`, `relance`, `updated_at`, `created_by`, `updated_by`, `categorie`) VALUES
(1, 'diffusion', NULL, 4, 'Diffusion', NULL, 6, NULL, NULL, NULL, 1),
(2, 'requete', NULL, 2, 'Requete', NULL, 4, NULL, NULL, NULL, 1),
(3, 'reclamation', NULL, 3, 'Reclamation', NULL, 7, NULL, NULL, NULL, 1),
(4, 'autre', NULL, 8, 'Autre', NULL, 10, NULL, NULL, NULL, 1),
(5, 'demande', NULL, 2, 'Demande', NULL, 7, NULL, NULL, NULL, 2),
(6, 'reponse', NULL, 5, 'Reponse', NULL, 2, NULL, NULL, NULL, 2),
(7, 'autre-sortie', NULL, 1, 'Autre Nature', NULL, 8, NULL, NULL, NULL, 2);

-- --------------------------------------------------------

--
-- Structure de la table `phase_admin`
--

DROP TABLE IF EXISTS `phase_admin`;
CREATE TABLE IF NOT EXISTS `phase_admin` (
                                             `id` bigint(20) NOT NULL,
                                             `code` varchar(255) DEFAULT NULL,
                                             `created_at` datetime DEFAULT NULL,
                                             `libelle` varchar(255) DEFAULT NULL,
                                             `libelle_arab` varchar(255) DEFAULT NULL,
                                             `updated_at` datetime DEFAULT NULL,
                                             `created_by` bigint(20) DEFAULT NULL,
                                             `updated_by` bigint(20) DEFAULT NULL,
                                             PRIMARY KEY (`id`),
                                             KEY `FK74hexa4jae3lrt02mjjnl88hd` (`created_by`),
                                             KEY `FKtffkxmnjv1vwb8ljakdwrwo8j` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `phase_admin`
--

INSERT INTO `phase_admin` (`id`, `code`, `created_at`, `libelle`, `libelle_arab`, `updated_at`, `created_by`, `updated_by`) VALUES
(2, 'requette rouverte', NULL, 'Requette Rouverte', NULL, NULL, NULL, NULL),
(1, 'requette cloturee', NULL, 'Requette Cloturee', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
                                      `id` bigint(20) NOT NULL,
                                      `authority` varchar(255) DEFAULT NULL,
                                      `created_at` datetime DEFAULT NULL,
                                      `updated_at` datetime DEFAULT NULL,
                                      `created_by` bigint(20) DEFAULT NULL,
                                      `updated_by` bigint(20) DEFAULT NULL,
                                      PRIMARY KEY (`id`),
                                      KEY `FKmjdbaf04ao0egch74ttawr9fo` (`created_by`),
                                      KEY `FKa5cffmyctb0862coj304faenx` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `role`
--

INSERT INTO `role` (`id`, `authority`, `created_at`, `updated_at`, `created_by`, `updated_by`) VALUES
(19, 'CHARGE_DE_REQUETE', NULL, NULL, NULL, NULL),
(18, 'AGENT_CAI', NULL, NULL, NULL, NULL),
(17, 'CHEF_DE_SERVICE', NULL, NULL, NULL, NULL),
(16, 'DIRECTEUR', NULL, NULL, NULL, NULL),
(15, 'AGENT_BO', NULL, NULL, NULL, NULL),
(13, 'USER', NULL, NULL, NULL, NULL),
(10, 'ADMIN', NULL, NULL, NULL, NULL),
(20, 'CHARGE_DE_TRAITEMENT_COURRIER', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `sexe`
--

DROP TABLE IF EXISTS `sexe`;
CREATE TABLE IF NOT EXISTS `sexe` (
                                      `id` bigint(20) NOT NULL,
                                      `libelle` varchar(255) DEFAULT NULL,
                                      `libelle_arab` varchar(255) DEFAULT NULL,
                                      PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `sexe`
--

INSERT INTO `sexe` (`id`, `libelle`, `libelle_arab`) VALUES
(1, 'Homme', NULL),
(2, 'Femme', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `status`
--

DROP TABLE IF EXISTS `status`;
CREATE TABLE IF NOT EXISTS `status` (
                                        `id` bigint(20) NOT NULL,
                                        `code` varchar(255) DEFAULT NULL,
                                        `color` varchar(255) DEFAULT NULL,
                                        `created_at` datetime DEFAULT NULL,
                                        `libelle` varchar(255) DEFAULT NULL,
                                        `libelle_arab` varchar(255) DEFAULT NULL,
                                        `updated_at` datetime DEFAULT NULL,
                                        `created_by` bigint(20) DEFAULT NULL,
                                        `updated_by` bigint(20) DEFAULT NULL,
                                        PRIMARY KEY (`id`),
                                        KEY `FK1vpm1stds536nwncn1w3oe9th` (`created_by`),
                                        KEY `FK32unexba526vcnyv8e5s6ycpn` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `status`
--

INSERT INTO `status` (`id`, `code`, `color`, `created_at`, `libelle`, `libelle_arab`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, 'ouvert', '#8ad076', NULL, 'Ouvert', NULL, '2020-07-27 23:33:40', NULL, 12),
(2, 'encours', '#984c9a', NULL, 'Encours', NULL, '2020-07-27 23:33:52', NULL, 12),
(3, 'traite', '#a31919', NULL, 'Traitée', NULL, '2020-07-27 23:34:07', NULL, 12),
(130, 'brouillant', '#a47070', '2020-08-25 18:44:10', 'Brouillant', NULL, NULL, 12, NULL),
(793, 'non traite', '#534646', '2020-12-19 22:33:07', 'Non Traitée', NULL, NULL, 12, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `subdivision`
--

DROP TABLE IF EXISTS `subdivision`;
CREATE TABLE IF NOT EXISTS `subdivision` (
                                             `id` bigint(20) NOT NULL,
                                             `code` varchar(255) DEFAULT NULL,
                                             `created_at` datetime DEFAULT NULL,
                                             `libelle_arab` varchar(255) DEFAULT NULL,
                                             `title` varchar(255) DEFAULT NULL,
                                             `updated_at` datetime DEFAULT NULL,
                                             `created_by` bigint(20) DEFAULT NULL,
                                             `updated_by` bigint(20) DEFAULT NULL,
                                             PRIMARY KEY (`id`),
                                             KEY `FK12l76eal1jqbvyvlkumjhoboa` (`created_by`),
                                             KEY `FKfeq7hyh2itwcud5w17xjx71fy` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `subdivision`
--

INSERT INTO `subdivision` (`id`, `code`, `created_at`, `libelle_arab`, `title`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, NULL, NULL, 'TASSAOUT AMONT', NULL, NULL, NULL),
(2, NULL, NULL, NULL, 'TASSAOUT AVAL', NULL, NULL, NULL),
(3, NULL, NULL, NULL, 'N\'FIS ET HC', NULL, NULL, NULL),
(4, NULL, NULL, NULL, 'TASSAOUT AMONT INFRACTION', NULL, NULL, NULL),
(5, NULL, NULL, NULL, 'TASSAOUT AVAL INFRACTION', NULL, NULL, NULL),
(6, NULL, NULL, NULL, 'N\'FIS ET HC INFRACTION', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `task`
--

DROP TABLE IF EXISTS `task`;
CREATE TABLE IF NOT EXISTS `task` (
                                      `id` bigint(20) NOT NULL,
                                      `accuse` bit(1) DEFAULT NULL,
                                      `assigned_at` datetime DEFAULT NULL,
                                      `created_at` datetime DEFAULT NULL,
                                      `date_accuse` datetime DEFAULT NULL,
                                      `date_reponse` datetime DEFAULT NULL,
                                      `delai` double DEFAULT NULL,
                                      `description` varchar(255) DEFAULT NULL,
                                      `observation` varchar(255) DEFAULT NULL,
                                      `processed_at` datetime DEFAULT NULL,
                                      `relance` double DEFAULT NULL,
                                      `reponse` bit(1) DEFAULT NULL,
                                      `title` varchar(255) DEFAULT NULL,
                                      `updated_at` datetime DEFAULT NULL,
                                      `assigne` bigint(20) DEFAULT NULL,
                                      `courrier` bigint(20) DEFAULT NULL,
                                      `created_by` bigint(20) DEFAULT NULL,
                                      `status` bigint(20) DEFAULT NULL,
                                      `updated_by` bigint(20) DEFAULT NULL,
                                      PRIMARY KEY (`id`),
                                      KEY `FKs5j79piwcgdc9e7fvhwpoo7ts` (`assigne`),
                                      KEY `FKtinwbyukrn0i41ss6w41ng8f9` (`courrier`),
                                      KEY `FKagbc5lv4xged97pe511ahj35a` (`created_by`),
                                      KEY `FKio4h16n2qjj7hwuo2sp0u223m` (`status`),
                                      KEY `FK3fm0tvu62v5p7c3lkw24sstou` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `task`
--

INSERT INTO `task` (`id`, `accuse`, `assigned_at`, `created_at`, `date_accuse`, `date_reponse`, `delai`, `description`, `observation`, `processed_at`, `relance`, `reponse`, `title`, `updated_at`, `assigne`, `courrier`, `created_by`, `status`, `updated_by`) VALUES
(765, NULL, NULL, '2020-12-09 10:13:23', NULL, NULL, NULL, 't1111 desc', 't111 obs', NULL, NULL, NULL, 't1', NULL, 492, 730, 495, NULL, NULL),
(764, NULL, NULL, '2020-12-09 10:13:23', NULL, NULL, NULL, 't222 desc', 't222 obs', NULL, NULL, NULL, 't2', NULL, 493, 730, 495, NULL, NULL),
(832, NULL, NULL, '2021-01-04 17:07:47', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 't1', NULL, 773, 770, 12, NULL, NULL),
(831, b'1', NULL, '2021-01-04 17:07:46', NULL, NULL, NULL, 'descccc', 'obsss', NULL, NULL, b'1', 't2', NULL, 485, 770, 12, 2, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `tranche_age`
--

DROP TABLE IF EXISTS `tranche_age`;
CREATE TABLE IF NOT EXISTS `tranche_age` (
                                             `id` bigint(20) NOT NULL,
                                             `age_max` int(11) DEFAULT NULL,
                                             `age_min` int(11) DEFAULT NULL,
                                             PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `tranche_age`
--

INSERT INTO `tranche_age` (`id`, `age_max`, `age_min`) VALUES
(1, 30, 18),
(2, 40, 31),
(3, 200, 41);

-- --------------------------------------------------------

--
-- Structure de la table `tranche_delai_reponse`
--

DROP TABLE IF EXISTS `tranche_delai_reponse`;
CREATE TABLE IF NOT EXISTS `tranche_delai_reponse` (
                                                       `id` bigint(20) NOT NULL,
                                                       `delai_response_max` int(11) DEFAULT NULL,
                                                       `delai_response_min` int(11) DEFAULT NULL,
                                                       PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `type_courrier`
--

DROP TABLE IF EXISTS `type_courrier`;
CREATE TABLE IF NOT EXISTS `type_courrier` (
                                               `id` bigint(20) NOT NULL,
                                               `code` varchar(255) DEFAULT NULL,
                                               `color` varchar(255) DEFAULT NULL,
                                               `libelle` varchar(255) DEFAULT NULL,
                                               `libelle_arab` varchar(255) DEFAULT NULL,
                                               PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `type_courrier`
--

INSERT INTO `type_courrier` (`id`, `code`, `color`, `libelle`, `libelle_arab`) VALUES
(1, 'arrive', '#bf1818', 'Arrivee', NULL),
(2, 'sortie', '#b9d629', 'Sortie', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `type_requette`
--

DROP TABLE IF EXISTS `type_requette`;
CREATE TABLE IF NOT EXISTS `type_requette` (
                                               `id` bigint(20) NOT NULL,
                                               `code` varchar(255) DEFAULT NULL,
                                               `created_at` datetime DEFAULT NULL,
                                               `libelle` varchar(255) DEFAULT NULL,
                                               `libelle_arab` varchar(255) DEFAULT NULL,
                                               `updated_at` datetime DEFAULT NULL,
                                               `created_by` bigint(20) DEFAULT NULL,
                                               `updated_by` bigint(20) DEFAULT NULL,
                                               PRIMARY KEY (`id`),
                                               KEY `FKp7vi7efft3mqt5nx934g3lsl1` (`created_by`),
                                               KEY `FKkr0i7dofoc1d4k9aa6lqik95r` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `type_requette`
--

INSERT INTO `type_requette` (`id`, `code`, `created_at`, `libelle`, `libelle_arab`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, 'oservations', NULL, 'Oservations', NULL, NULL, NULL, NULL),
(2, 'propositions', NULL, 'Propositions', NULL, NULL, NULL, NULL),
(3, 'reclamations', NULL, 'Reclamations', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
                                      `id` bigint(20) NOT NULL,
                                      `account_non_expired` bit(1) DEFAULT NULL,
                                      `account_non_locked` bit(1) DEFAULT NULL,
                                      `created_at` datetime DEFAULT NULL,
                                      `credentials_non_expired` bit(1) DEFAULT NULL,
                                      `email` varchar(255) DEFAULT NULL,
                                      `enabled` bit(1) DEFAULT NULL,
                                      `password` varchar(255) DEFAULT NULL,
                                      `password_changed` bit(1) DEFAULT NULL,
                                      `updated_at` datetime DEFAULT NULL,
                                      `username` varchar(255) DEFAULT NULL,
                                      `created_by` bigint(20) DEFAULT NULL,
                                      `updated_by` bigint(20) DEFAULT NULL,
                                      `le_service` bigint(20) DEFAULT NULL,
                                      PRIMARY KEY (`id`),
                                      KEY `FKdltbr5t0nljpuuo4isxgslt82` (`created_by`),
                                      KEY `FK2a54xhceitopkkw1hlo3tkv3i` (`updated_by`),
                                      KEY `FK8r7r3b1q7omscl6db6x2qastk` (`le_service`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `account_non_expired`, `account_non_locked`, `created_at`, `credentials_non_expired`, `email`, `enabled`, `password`, `password_changed`, `updated_at`, `username`, `created_by`, `updated_by`, `le_service`) VALUES
(12, b'1', b'1', '2020-07-22 14:06:35', b'1', 'admin@gmail.com', b'1', '$2a$10$u4mxkJbzRjIKPMt/EQRz9OW39KyEwRqN0627QJOqpwXSgxeY.nonG', b'1', '2020-11-08 20:57:36', 'admin@gmail.com', NULL, 12, NULL),
(480, b'1', b'1', '2020-11-08 17:40:56', b'1', 'chef-saf@gmail.com', b'1', '$2a$10$YEi2koDj44qghJJS6.mnk.BEW23IVPN.sAiOxcFaBfjHs5.0ofY1.', b'1', NULL, 'chef-saf@gmail.com', 12, NULL, 1),
(479, b'1', b'1', '2020-11-08 16:09:13', b'1', 'chef-cai@gmail.com', b'1', '$2a$10$0zbioKZKwPxt7lwmrlJKpebA3gN9OznHLKCwWk2vg6/f7pO6s0w1.', b'1', NULL, 'chef-cai@gmail.com', 12, NULL, 2),
(481, b'1', b'1', '2020-11-08 20:08:35', b'1', 'chef-info@gmail.com', b'1', '$2a$10$b02sT1mvfHjRaPtaLcTVUORKELIL0BOp03ZeEm85CW5DJv2zf2xbO', b'1', NULL, 'chef-info@gmail.com', 12, NULL, 4),
(482, b'1', b'1', '2020-11-08 20:18:02', b'1', 'chef-rh@gmail.com', b'1', '$2a$10$gBSNzSaqXJBCAwzTLaKoluKOsM21IbG1zHdOzeX8gH89ehsnMjeDa', b'1', NULL, 'chef-rh@gmail.com', 12, NULL, 3),
(483, b'1', b'1', '2020-11-08 20:37:14', b'1', 'chef-finnance@gmail.com', b'1', '$2a$10$JOii/c46kHyyWMGUItb5R.Bkd7WtMua7XlMw6VIl3F2RB93pIkeMS', b'1', NULL, 'chef-finnance@gmail.com', 12, NULL, 229),
(484, b'1', b'1', '2020-11-08 20:47:55', b'1', 'agent-saf1@gmail.com', b'1', '$2a$10$Hf9ALCO0yPQ/slH1wPGqYOWbSGniG23N67P1QPTmIaMfyFBxApAIm', b'1', NULL, 'agent-saf1@gmail.com', 12, NULL, 1),
(485, b'1', b'1', '2020-11-08 20:48:30', b'1', 'agent-saf2@gmail.com', b'1', '$2a$10$MKXXI/0hhdtixjlSnlkFZ.U.VmlqE8SxHhggZXw.d4LPcoKDodvya', b'1', NULL, 'agent-saf2@gmail.com', 12, NULL, 1),
(486, b'1', b'1', '2020-11-08 20:49:43', b'1', 'agent-cai1@gmail.com', b'1', '$2a$10$xImaq4lqin5PZl2zruuTWuEFJeNHGMz9SSl7E1tCn8Laf01eda2hq', b'1', '2020-12-09 05:17:16', 'agent-cai1@gmail.com', 12, 12, 2),
(487, b'1', b'1', '2020-11-08 20:50:30', b'1', 'agent-cai2@gmail.com', b'1', '$2a$10$NFyBXc/WSEudxF2GubK4JOfGj5QVaboQBJ8aCZRflDbMUrlSIAg8i', b'1', NULL, 'agent-cai2@gmail.com', 12, NULL, 2),
(488, b'1', b'1', '2020-11-08 20:52:40', b'1', 'agent-rh1@gmail.com', b'1', '$2a$10$6ezKehKtGr.CLI6CFQ47s.DINiSQRzPHn9xyIP910E4PIRpqRxi7e', b'0', NULL, 'agent-rh1@gmail.com', 12, NULL, 3),
(489, b'1', b'1', '2020-11-08 20:52:54', b'1', 'agent-rh2@gmail.com', b'1', '$2a$10$e9Efwq9ZNL9fn97cPJ0v6OB7bed4wZLRAoEpT8/6/yfVb5UwFRHhm', b'0', NULL, 'agent-rh2@gmail.com', 12, NULL, 3),
(490, b'1', b'1', '2020-11-08 20:53:12', b'1', 'agent-info1@gmail.com', b'1', '$2a$10$b1lMOPlkG1t4FBT.Em/hwO4fnv0t1PIzhfauOFabI2ycinkXZ0NN.', b'0', NULL, 'agent-info1@gmail.com', 12, NULL, 4),
(491, b'1', b'1', '2020-11-08 20:53:39', b'1', 'agent-info2@gmail.com', b'1', '$2a$10$XXCcyWh7Nbd/ZKPCYGPHYOgPkcJvDboZsfrdYAii0KOB0WNtZ0PgK', b'0', NULL, 'agent-info2@gmail.com', 12, NULL, 4),
(492, b'1', b'1', '2020-11-08 20:54:04', b'1', 'agent-finnance1@gmail.com', b'1', '$2a$10$J70X16iLnToklxY.ZmuwGO/D/ckas5c62bm6WaLHggcvihDqU2.FC', b'1', NULL, 'agent-finnance1@gmail.com', 12, NULL, 229),
(493, b'1', b'1', '2020-11-08 20:54:20', b'1', 'agent-finnance2@gmail.com', b'1', '$2a$10$ILUS2BFR4i1.wQv6y94J9eNxNBlB5nB47dw3pAlkpAj5573dRIFFq', b'0', NULL, 'agent-finnance2@gmail.com', 12, NULL, 229),
(494, b'1', b'1', '2020-11-08 20:56:04', b'1', 'directeur@gmail.com', b'1', '$2a$10$vTSRZdM3VaKqHZP/.u0uCeXHAnEL/ZXK8oVBPt.Zjo.OJNp6AMkV2', b'1', NULL, 'directeur@gmail.com', 12, NULL, NULL),
(495, b'1', b'1', '2020-11-08 20:56:40', b'1', 'bo@gmail.com', b'1', '$2a$10$IgdJys3iTWtlkzdA5pEJrev6qJrC/15HVTd1eJRGKt9uixhQ4Wvnq', b'1', NULL, 'bo@gmail.com', 12, NULL, NULL),
(496, b'1', b'1', '2020-11-08 20:57:07', b'1', 'charge-requette@gmail.com', b'1', '$2a$10$ojXoFVYIfEUJTkakFjA6Ve62hzUwX3nsqj0RP.OvFjIzOIxEAJdN6', b'1', NULL, 'charge-requette@gmail.com', 12, NULL, NULL),
(712, b'1', b'1', '2020-12-09 07:18:25', b'1', 'agent-cai3@gmail.com', b'1', '$2a$10$UVFicwRmlJtj0LZ5xl/xfex09YCQcShN6EPdW6ziSqbNpgXoEbJNC', b'0', NULL, 'agent-cai3@gmail.com', 12, NULL, 2),
(751, b'1', b'1', '2020-12-09 10:00:54', b'1', 'agent-cai4@gmail.com', b'1', '$2a$10$qZBDBRU0sTbUZjnH6lgvpO0WDIRfvQnZ0EuWSNXxWEopr5RaqQ9Hy', b'0', '2020-12-09 10:01:12', 'agent-cai4@gmail.com', 12, 12, 2),
(773, b'1', b'1', '2020-12-09 10:20:06', b'1', 'agent-saf-requette-1@gmail.com', b'1', '$2a$10$hXSIak.ASIBeruRFYQr9a.m.ndNZBwixhOe.KMQk73fE9dFEkRDvC', b'1', NULL, 'agent-saf-requette-1@gmail.com', 12, NULL, 1),
(631, b'1', b'1', '2020-12-09 20:16:17', b'1', 'agent-finnance-charge-requette-1@gmail.com', b'1', '$2a$10$OePl2TVEMkvcb/m0HVzXYes9/nfFy5GEbUnWhxFm8/T0uO9Tbk386', b'0', NULL, 'agent-finnance-charge-requette-1@gmail.com', 12, NULL, 229),
(632, b'1', b'1', '2020-12-09 20:17:12', b'1', 'agent-rh-charge-requette-1@gmail.com', b'1', '$2a$10$kEXN2ksjjiNsaazPoVL0W.DnAljP2s2x5NzEY/5Hbu73ex4hClure', b'0', NULL, 'agent-rh-charge-requette-1@gmail.com', 12, NULL, 3),
(633, b'1', b'1', '2020-12-09 20:17:36', b'1', 'agent-cai-charge-requette-1@gmail.com', b'1', '$2a$10$6RzzS1DxKQmPIDFmmTh1kumSx3zzBWA8ow6.OKvjyZRFZNsIOsDfu', b'0', NULL, 'agent-cai-charge-requette-1@gmail.com', 12, NULL, 2),
(634, b'1', b'1', '2020-12-09 20:18:53', b'1', 'agent-info-charge-requette-1@gmail.com', b'1', '$2a$10$/BBqsa1m46qegBFk2GUFp.1uxGNBq/BdrmWx/ncB2HI8tQO/Clclu', b'0', NULL, 'agent-info-charge-requette-1@gmail.com', 12, NULL, 4),
(635, b'1', b'1', '2020-12-09 20:19:40', b'1', 'agent-saf-charge-requette-1@gmail.com', b'1', '$2a$10$UuXcWTgE5j6vEE81QXSTr.JplMfQlD/Cf2zy.tbWHZhJ2cC2G1NcW', b'0', NULL, 'agent-saf-charge-requette-1@gmail.com', 12, NULL, 1);

-- --------------------------------------------------------

--
-- Structure de la table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE IF NOT EXISTS `user_roles` (
                                            `user_id` bigint(20) NOT NULL,
                                            `roles` bigint(20) NOT NULL,
                                            KEY `FKgebwmqov76423flcvk2lwwgnh` (`roles`),
                                            KEY `FK55itppkw3i07do3h7qoclqd4k` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user_roles`
--

INSERT INTO `user_roles` (`user_id`, `roles`) VALUES
(12, 10),
(479, 17),
(480, 17),
(481, 17),
(482, 17),
(483, 17),
(484, 20),
(485, 20),
(487, 20),
(488, 20),
(489, 20),
(490, 20),
(491, 20),
(492, 20),
(493, 20),
(494, 16),
(495, 15),
(496, 19),
(486, 18),
(712, 18),
(773, 19),
(751, 18);

-- --------------------------------------------------------

--
-- Structure de la table `voie`
--

DROP TABLE IF EXISTS `voie`;
CREATE TABLE IF NOT EXISTS `voie` (
                                      `id` bigint(20) NOT NULL,
                                      `code` varchar(255) DEFAULT NULL,
                                      `created_at` datetime DEFAULT NULL,
                                      `libelle` varchar(255) DEFAULT NULL,
                                      `libelle_arab` varchar(255) DEFAULT NULL,
                                      `updated_at` datetime DEFAULT NULL,
                                      `created_by` bigint(20) DEFAULT NULL,
                                      `updated_by` bigint(20) DEFAULT NULL,
                                      PRIMARY KEY (`id`),
                                      KEY `FK44eamdx8r304gq2mskptqxh8w` (`created_by`),
                                      KEY `FKkn1f3lel3mnncgygepdcb917x` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `voie`
--

INSERT INTO `voie` (`id`, `code`, `created_at`, `libelle`, `libelle_arab`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, 'fax', NULL, 'Fax', NULL, NULL, NULL, NULL),
(2, 'email', NULL, 'Email', NULL, NULL, NULL, NULL),
(3, 'courrierPortee', NULL, 'CourrierPortee', NULL, NULL, NULL, NULL),
(4, 'poste', NULL, 'Poste', NULL, NULL, NULL, NULL);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
