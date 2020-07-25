-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  sam. 25 juil. 2020 à 15:33
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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `courrier`
--

DROP TABLE IF EXISTS `courrier`;
CREATE TABLE IF NOT EXISTS `courrier` (
                                          `id` bigint(20) NOT NULL,
                                          `accuse` bit(1) DEFAULT NULL,
                                          `created_at` datetime DEFAULT NULL,
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
                                          `expeditor_type` bigint(20) DEFAULT NULL,
                                          `linked_to` bigint(20) DEFAULT NULL,
                                          `nature_courrier` bigint(20) DEFAULT NULL,
                                          `status` bigint(20) DEFAULT NULL,
                                          `subdivision` bigint(20) DEFAULT NULL,
                                          `type_courrier` bigint(20) DEFAULT NULL,
                                          `updated_by` bigint(20) DEFAULT NULL,
                                          `voie` bigint(20) DEFAULT NULL,
                                          PRIMARY KEY (`id`),
                                          KEY `FKfewtkf0c9rqftanl1m153ccs7` (`coordinator`),
                                          KEY `FKp0wri89e8lweagigu4ueumsbs` (`courrier_object`),
                                          KEY `FKtaaceqyx1ct2e5o194ht3y08f` (`created_by`),
                                          KEY `FKitv6r9l49dmnwlcwp29vodaa4` (`destinator`),
                                          KEY `FK4xc6pt5n014iwdqd8f6i0o34f` (`emetteur`),
                                          KEY `FKf8h14jiti81ktoe6b7wcctg2c` (`evaluation`),
                                          KEY `FKi70a9drw6pkixh2rb60ej4vt3` (`expeditor`),
                                          KEY `FKi3xquj74yqg81ig2fxx7qw99` (`expeditor_type`),
                                          KEY `FK500qa7hg23jbdtix57gh0so61` (`linked_to`),
                                          KEY `FK9m79qbghu1wrrhs01a2ejo3hj` (`nature_courrier`),
                                          KEY `FKgu5g9y1loj73wttvyq3l28um7` (`status`),
                                          KEY `FKe3lojwidl47w3h13ergm69wtj` (`subdivision`),
                                          KEY `FKfuht770sx8omvlmu018bmev92` (`type_courrier`),
                                          KEY `FK2de3vr9jplymuqc1raucdthtt` (`updated_by`),
                                          KEY `FKhhl4cif4ydpmevjf34dlil9wx` (`voie`)
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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `courrier_object`
--

INSERT INTO `courrier_object` (`id`, `code`, `created_at`, `title`, `title_arab`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, NULL, 'CORRECTION DU NOM DE L\'EXPLOITANT', NULL, NULL, NULL, NULL),
(2, NULL, NULL, 'DEMANDE D\'ATTESTATION', NULL, NULL, NULL, NULL),
(3, NULL, NULL, 'DEMANDE D\'ACTUALISATION DE L\'ENQUÊTE FONCIERE', NULL, NULL, NULL, NULL),
(4, NULL, NULL, 'AUTRES', NULL, NULL, NULL, NULL),
(5, NULL, NULL, 'DEMANDE D\'INFORMATION', NULL, NULL, NULL, NULL),
(6, NULL, NULL, 'EXPROPRIATION', NULL, NULL, NULL, NULL),
(7, NULL, NULL, 'INDÉMNISATION', NULL, NULL, NULL, NULL),
(8, NULL, NULL, 'DEMANDE D\'AUDIENCE', NULL, NULL, NULL, NULL),
(9, NULL, NULL, 'DEMANDE DE POSSESSION DE CLES DE BORNE', NULL, NULL, NULL, NULL),
(10, NULL, NULL, 'LITIGES ENTRES AYANTS DROITS OU AGRICULTEURS', NULL, NULL, NULL, NULL),
(11, NULL, NULL, 'RÉÉCHELONNEMENT DE DETTES ET FACILITÉS DE PAIEMENT', NULL, NULL, NULL, NULL),
(12, NULL, NULL, 'DEMANDE DE CREUSEMENT DE PUIT', NULL, NULL, NULL, NULL),
(13, NULL, NULL, 'VOL D’EAU ET VANDALISME', NULL, NULL, NULL, NULL),
(14, NULL, NULL, 'DEMANDE D\'ESSAI DE LA CONDUITE PRINCIPALE', NULL, NULL, NULL, NULL),
(15, NULL, NULL, 'IMPLANTATION D\'OUVRAGE', NULL, NULL, NULL, NULL),
(16, NULL, NULL, 'REPARATION REMPLACEMENT DE CONDUITE PRINCIPALE', NULL, NULL, NULL, NULL),
(17, NULL, NULL, 'DEMANDE DE RETABLISSEMENT DES LIMITES DES PARCELLES', NULL, NULL, NULL, NULL),
(18, NULL, NULL, 'DEMANDE D\'ARRÊT D\'IRRIGATION', NULL, NULL, NULL, NULL),
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
(30, NULL, NULL, 'ACCÈS À LA PARCELLE', NULL, NULL, NULL, NULL),
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
-- Structure de la table `courrier_service_item`
--

DROP TABLE IF EXISTS `courrier_service_item`;
CREATE TABLE IF NOT EXISTS `courrier_service_item` (
                                                       `id` bigint(20) NOT NULL,
                                                       `courrier` bigint(20) DEFAULT NULL,
                                                       `service` bigint(20) DEFAULT NULL,
                                                       PRIMARY KEY (`id`),
                                                       KEY `FK4f92rw2klc644bo3lqls3i5gw` (`courrier`),
                                                       KEY `FKd60c9ff3ubxrlttvbixbfr6xc` (`service`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `evaluation`
--

INSERT INTO `evaluation` (`id`, `code`, `created_at`, `libelle_arab`, `title`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, NULL, NULL, 'Requête conforme', NULL, NULL, NULL),
(2, NULL, NULL, NULL, 'Objet est devant la justice ou une autre autorité compétente / décision judiciaire rendu', NULL, NULL, NULL),
(3, NULL, NULL, NULL, 'Objet hors champs de mission de l’ORMVAH', NULL, NULL, NULL),
(4, NULL, NULL, NULL, 'Insultes ou diffamation', NULL, NULL, NULL),
(5, NULL, NULL, NULL, 'Non-conformité au modèle (Article 7 décret 2.17.265)', NULL, NULL, NULL),
(6, NULL, NULL, NULL, 'Manque de clarté et absence de documents et arguments', NULL, NULL, NULL);

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
                                           PRIMARY KEY (`id`),
                                           KEY `FKgbum88m2dbutcw99y3eafqacs` (`created_by`),
                                           KEY `FK6kiiph3fylfat5074mu2unn71` (`nationality`),
                                           KEY `FK3v83k82rjrcv7ja5yo4gt7ha8` (`sexe`),
                                           KEY `FKfl5pti1md0or189byi2448xqj` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
                                            `created_by` bigint(20) DEFAULT NULL,
                                            `updated_by` bigint(20) DEFAULT NULL,
                                            PRIMARY KEY (`id`),
                                            KEY `FKa5bxasmhhr90beun0js8qat15` (`created_by`),
                                            KEY `FK3q1eprsx1jdj8v2sfklw1vdl2` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `le_service`
--

INSERT INTO `le_service` (`id`, `code`, `created_at`, `description`, `libelle_arab`, `title`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, NULL, NULL, NULL, 'SAF', NULL, NULL, NULL),
(2, NULL, NULL, NULL, NULL, 'CAI', NULL, NULL, NULL);

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
                                                      `updated_by` bigint(20) DEFAULT NULL,
                                                      PRIMARY KEY (`id`),
                                                      KEY `FKsknf0gs7ad73ubserc4xcxjxa` (`categorie_model_lettre_reponse`),
                                                      KEY `FKatm7e4x54y0ob59a7yglgrh6` (`created_by`),
                                                      KEY `FKexgv3qtocv9woyeej5hj4v7g2` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `nationality`
--

INSERT INTO `nationality` (`id`, `created_at`, `libelle`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, 'Maroc', NULL, NULL, NULL),
(2, NULL, 'Francais', NULL, NULL, NULL);

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
                                                 PRIMARY KEY (`id`),
                                                 KEY `FKsq9psn4bypmvmneic9t8qr1hj` (`created_by`),
                                                 KEY `FK27y7nsuotb1ccifkreq8tl1oj` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `nature_courrier`
--

INSERT INTO `nature_courrier` (`id`, `code`, `created_at`, `delai`, `libelle`, `libelle_arab`, `relance`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, 'diffusion', NULL, NULL, 'Diffusion', NULL, NULL, NULL, NULL, NULL),
(2, 'requete', NULL, NULL, 'Requete', NULL, NULL, NULL, NULL, NULL),
(3, 'reclamation', NULL, NULL, 'Reclamation', NULL, NULL, NULL, NULL, NULL),
(4, 'autre', NULL, NULL, 'Autre', NULL, NULL, NULL, NULL, NULL);

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `sexe`
--

INSERT INTO `sexe` (`id`, `libelle`, `libelle_arab`) VALUES
(1, 'Homme', NULL),
(2, 'Femme', NULL),
(3, 'Inconnu', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `status`
--

DROP TABLE IF EXISTS `status`;
CREATE TABLE IF NOT EXISTS `status` (
                                        `id` bigint(20) NOT NULL,
                                        `code` varchar(255) DEFAULT NULL,
                                        `created_at` datetime DEFAULT NULL,
                                        `libelle` varchar(255) DEFAULT NULL,
                                        `libelle_arab` varchar(255) DEFAULT NULL,
                                        `updated_at` datetime DEFAULT NULL,
                                        `created_by` bigint(20) DEFAULT NULL,
                                        `updated_by` bigint(20) DEFAULT NULL,
                                        PRIMARY KEY (`id`),
                                        KEY `FK1vpm1stds536nwncn1w3oe9th` (`created_by`),
                                        KEY `FK32unexba526vcnyv8e5s6ycpn` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `status`
--

INSERT INTO `status` (`id`, `code`, `created_at`, `libelle`, `libelle_arab`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, 'ouvert', NULL, 'Ouvert', NULL, NULL, NULL, NULL),
(2, 'encours', NULL, 'Encours', NULL, NULL, NULL, NULL),
(3, 'traite', NULL, 'Traite', NULL, NULL, NULL, NULL);

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `type_courrier`
--

DROP TABLE IF EXISTS `type_courrier`;
CREATE TABLE IF NOT EXISTS `type_courrier` (
                                               `id` bigint(20) NOT NULL,
                                               `code` varchar(255) DEFAULT NULL,
                                               `libelle` varchar(255) DEFAULT NULL,
                                               `libelle_arab` varchar(255) DEFAULT NULL,
                                               `color` varchar(255) DEFAULT NULL,
                                               PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `type_courrier`
--

INSERT INTO `type_courrier` (`id`, `code`, `libelle`, `libelle_arab`, `color`) VALUES
(1, 'arrive', 'Arrivee', NULL, NULL),
(2, 'sortie', 'Sortie', NULL, NULL);

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
                                      `updated_at` datetime DEFAULT NULL,
                                      `username` varchar(255) DEFAULT NULL,
                                      `created_by` bigint(20) DEFAULT NULL,
                                      `updated_by` bigint(20) DEFAULT NULL,
                                      PRIMARY KEY (`id`),
                                      KEY `FKdltbr5t0nljpuuo4isxgslt82` (`created_by`),
                                      KEY `FK2a54xhceitopkkw1hlo3tkv3i` (`updated_by`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `account_non_expired`, `account_non_locked`, `created_at`, `credentials_non_expired`, `email`, `enabled`, `password`, `updated_at`, `username`, `created_by`, `updated_by`) VALUES
(12, b'1', b'1', '2020-07-22 14:06:35', b'1', 'admin@gmail.com', b'1', '$2a$10$yesMI6MKbWs8H7wothzNR.TcTVz6zqTRjBQUbuUT83ZwqCVj1NAhG', NULL, 'admin', NULL, NULL),
(29, b'1', b'1', '2020-07-22 14:54:54', b'1', 'ismail@gmail.com', b'1', '$2a$10$LTrcvoKU7/3eRvyl8/WN8.YZWAWaI61KwiH/nimw.VVsKJ2W7s.jK', NULL, 'ismail', NULL, NULL);

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user_roles`
--

INSERT INTO `user_roles` (`user_id`, `roles`) VALUES
(12, 10),
(29, 13),
(29, 15);

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
