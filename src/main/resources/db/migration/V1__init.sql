﻿-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 23 juil. 2020 à 22:59
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

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1);

--
-- Déchargement des données de la table `le_service`
--

INSERT INTO `le_service` (`id`, `code`, `created_at`, `description`, `libelle_arab`, `title`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, NULL, NULL, NULL, 'SAF', NULL, NULL, NULL),
(2, NULL, NULL, NULL, NULL, 'CAI', NULL, NULL, NULL);

--
-- Déchargement des données de la table `nationality`
--

INSERT INTO `nationality` (`id`, `created_at`, `libelle`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, NULL, 'Maroc', NULL, NULL, NULL),
(2, NULL, 'Francais', NULL, NULL, NULL);

--
-- Déchargement des données de la table `nature_courrier`
--

INSERT INTO `nature_courrier` (`id`, `code`, `created_at`, `delai`, `libelle`, `libelle_arab`, `relance`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, 'diffusion', NULL, NULL, 'Diffusion', NULL, NULL, NULL, NULL, NULL),
(2, 'requete', NULL, NULL, 'Requete', NULL, NULL, NULL, NULL, NULL),
(3, 'reclamation', NULL, NULL, 'Reclamation', NULL, NULL, NULL, NULL, NULL),
(4, 'autre', NULL, NULL, 'Autre', NULL, NULL, NULL, NULL, NULL);

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

--
-- Déchargement des données de la table `sexe`
--

INSERT INTO `sexe` (`id`, `libelle`, `libelle_arab`) VALUES
(1, 'Homme', NULL),
(2, 'Femme', NULL),
(3, 'Inconnu', NULL);

--
-- Déchargement des données de la table `status`
--

INSERT INTO `status` (`id`, `code`, `created_at`, `libelle`, `libelle_arab`, `updated_at`, `created_by`, `updated_by`) VALUES
(1, 'ouvert', NULL, 'Ouvert', NULL, NULL, NULL, NULL),
(2, 'encours', NULL, 'Encours', NULL, NULL, NULL, NULL),
(3, 'traite', NULL, 'Traite', NULL, NULL, NULL, NULL);

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

--
-- Déchargement des données de la table `type_courrier`
--

INSERT INTO `type_courrier` (`id`, `code`, `libelle`, `libelle_arab`) VALUES
(1, 'arrive', 'Arrivee', NULL),
(2, 'sortie', 'Sortie', NULL);

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `account_non_expired`, `account_non_locked`, `created_at`, `credentials_non_expired`, `email`, `enabled`, `password`, `updated_at`, `username`, `created_by`, `updated_by`) VALUES
(12, b'1', b'1', '2020-07-22 14:06:35', b'1', 'admin@gmail.com', b'1', '$2a$10$yesMI6MKbWs8H7wothzNR.TcTVz6zqTRjBQUbuUT83ZwqCVj1NAhG', NULL, 'admin', NULL, NULL),
(29, b'1', b'1', '2020-07-22 14:54:54', b'1', 'ismail@gmail.com', b'1', '$2a$10$LTrcvoKU7/3eRvyl8/WN8.YZWAWaI61KwiH/nimw.VVsKJ2W7s.jK', NULL, 'ismail', NULL, NULL);

--
-- Déchargement des données de la table `user_roles`
--

INSERT INTO `user_roles` (`user_id`, `roles`) VALUES
(12, 10),
(29, 13),
(29, 15);

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
