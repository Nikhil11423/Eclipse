package com.xworkz.jdbc.update;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import static com.xworkz.jdbc.details.constants.JDBC.*;

public class SelectAllData {

	public static void main(String[] args) {

		String sql = "select * from movie";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			System.err.println("***********Movie Details***************");

			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			ResultSet res = prepareStatement.executeQuery();

			while (res.next()) {
				String Name = res.getString(1);
				String Hero = res.getString(2);
				String Heroine = res.getString(3);
				String Vilan = res.getString(4);
				int Budget = res.getInt(5);
				String lang = res.getString(6);
				String location = res.getString(7);
				String writer = res.getString(8);
				String Digalouge = res.getString(9);
				String Master = res.getString(10);
				String CG = res.getString(11);
				String state = res.getString(12);
				int Memb = res.getInt(13);
				String house = res.getString(14);
				String Certificate = res.getString(15);
				int ItemSong = res.getInt(16);
				int totalsong = res.getInt(17);
				Time time = res.getTime(18);
				String Producer = res.getString(19);
				String Director = res.getString(20);
				String Music = res.getString(21);
				String Screnplay = res.getString(22);
				int action = res.getInt(23);
				int com = res.getInt(24);
				int entry = res.getInt(25);
				int drama = res.getInt(26);
				int id = res.getInt(27);
				String distru = res.getString(28);
				int OTT = res.getInt(29);
				Date date = res.getDate(30);
				int Totalfilm = res.getInt(31);
				String editor = res.getString(32);
				System.out.println(Name + " :" + Hero + " : " + Heroine + " : " + Vilan + " : " + Budget + " : " + lang
						+ " : " + location + " : " + writer + " : " + Digalouge + " : " + Master + " : " + CG + " : "
						+ state + " : " + Memb + " : " + house + " : " + Certificate + " : " + ItemSong + " : "
						+ totalsong + " : " + time + " : " + Producer + " : " + Director + " : " + Music + " : "
						+ Screnplay + " : " + action + "" + com + "" + entry + " : " + drama + " : " + id + " : "
						+ distru + " : " + OTT + " : " + date + " : " + Totalfilm + " : " + editor);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.err.println("**************Ipl Team Details*********************");

		String ipl = "select * from ipl";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(ipl);

			// prepareStatement.setString(1, "BTM");

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);
				String Team = res.getString(2);
				String Player1 = res.getString(3);
				String Player2 = res.getString(4);
				String Player3 = res.getString(5);
				String Player4 = res.getString(6);
				String Player5 = res.getString(7);
				String Player6 = res.getString(8);
				String Player7 = res.getString(9);
				String Player8 = res.getString(10);
				String Player9 = res.getString(11);
				String Player10 = res.getString(12);
				String Player11 = res.getString(13);
				int TB = res.getInt(14);
				int TBR = res.getInt(15);
				int TAL = res.getInt(16);
				int HTT = res.getInt(17);
				int LTT = res.getInt(18);
				int NoMW = res.getInt(19);
				int TCUP = res.getInt(20);
				int HW = res.getInt(21);
				int HC = res.getInt(22);
				int TW = res.getInt(23);
				int TL = res.getInt(24);
				String ON = res.getString(25);
				String BC = res.getString(26);
				String Wk = res.getString(27);
				String SN = res.getString(28);
				String LANG = res.getString(29);
				String JC = res.getString(30);
				String BF = res.getString(31);
				String DB = res.getString(32);
				String BC1 = res.getString(33);

				System.out.println(id + " " + Team + " " + Player1 + " " + Player2 + " " + Player3 + " " + Player4 + " "
						+ Player5 + " " + Player6 + " " + Player7 + " " + Player8 + " " + Player9 + " " + Player10 + " "
						+ Player11 + " " + TB + " " + TBR + " " + TAL + " " + HTT + " " + LTT + " " + NoMW + " " + TCUP
						+ " " + HW + " " + TW + " " + TL + " " + ON + " " + BC + " " + Wk + " " + SN + " " + LANG + " "
						+ JC + " " + BF + " " + DB + " " + BC1);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("******************Actors Details********************");

		String actors = "select * from actor";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(actors);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);
				String FN = res.getString(2);
				String SN = res.getString(3);
				String LN = res.getString(4);
				Date DOB = res.getDate(5);
				int age = res.getInt(6);
				String MN = res.getString(7);
				int FE = res.getInt(8);
				int THR = res.getInt(9);
				String City = res.getString(10);
				String Dist = res.getString(11);
				String State = res.getString(12);
				String RM = res.getString(13);
				int TF = res.getInt(14);
				int SR = res.getInt(15);
				String FA = res.getString(16);
				int BAA = res.getInt(17);
				int DPA = res.getInt(18);
				int HT = res.getInt(19);
				String Title = res.getString(20);
				int TFK = res.getInt(21);
				int TA = res.getInt(22);
				String M = res.getString(23);
				String WN = res.getString(24);
				int C = res.getInt(25);
				String MTL = res.getString(26);
				String BF = res.getString(27);
				String BAS = res.getString(28);
				String FF = res.getString(29);
				String FS = res.getString(30);
				Long MObNo = res.getLong(31);
				String BP = res.getString(32);
				String FH = res.getString(33);

				System.out.println(id + " " + FN + " " + SN + " " + LN + " " + DOB + " " + age + " " + MN + " " + FE
						+ " " + City + " " + Dist + " " + State + " " + RM + " " + TF + " " + SR + " " + FA + " " + BAA
						+ " " + DPA + " " + HT + " " + Title + " " + TFK + " " + TA + " " + M + " " + WN + " " + C + " "
						+ MTL + " " + BF + " " + BAS + " " + FF + " " + FS + " " + MObNo + " " + BP + " " + FH);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("******************Country Details********************");

		String country = "select * from Country";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(country);

			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String CountryName = resultSet.getString(2);
				String CountryToatalPopulations = resultSet.getString(3);
				int CountryCode = resultSet.getInt(4);
				String CountryCurrency = resultSet.getString(5);
				Date CountryIndepentDay = resultSet.getDate(6);
				int CountryPhone = resultSet.getInt(7);
				String CapitalCity = resultSet.getString(8);
				int TotalState = resultSet.getInt(9);
				int TotalDist = resultSet.getInt(10);
				String PMName = resultSet.getString(11);
				String PresultSetidentName = resultSet.getString(12);
				String Sports = resultSet.getString(13);
				String Lang = resultSet.getString(14);
				String Animal = resultSet.getString(15);
				String Birds = resultSet.getString(16);
				String Tree = resultSet.getString(17);
				String flower = resultSet.getString(18);
				int HRank = resultSet.getInt(19);
				int Rank = resultSet.getInt(20);
				int Toatl = resultSet.getInt(21);
				int Economy = resultSet.getInt(22);
				int GDP = resultSet.getInt(23);
				int CGDP = resultSet.getInt(24);
				int SRanking = resultSet.getInt(25);
				int RRank = resultSet.getInt(26);
				int OylmpicsMedal = resultSet.getInt(27);
				int ArmyForceActivemembers = resultSet.getInt(28);
				int ArmyForcemembers = resultSet.getInt(29);
				int Paramilitarymembers = resultSet.getInt(30);
				int TotalScientints = resultSet.getInt(31);
				int RankingArea = resultSet.getInt(32);
				int corruptionRank = resultSet.getInt(33);

				System.out.println(id + "  " + CountryName + " " + CountryToatalPopulations + " " + CountryCode + " "
						+ CountryCurrency + " " + CountryIndepentDay + " " + CountryPhone + " " + CapitalCity + " "
						+ TotalState + " " + TotalDist + " " + PMName + " " + PresultSetidentName + " " + Sports + " "
						+ Lang + " " + Animal + " " + Birds + " " + Tree + " " + flower + " " + HRank + " " + Rank + " "
						+ Toatl + " " + Economy + " " + GDP + " " + CGDP + " " + SRanking + " " + RRank + " "
						+ OylmpicsMedal + " " + ArmyForceActivemembers + " " + ArmyForcemembers + " "
						+ Paramilitarymembers + " " + TotalScientints + " " + RankingArea + " " + corruptionRank);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.err.println("***********BharataRatnaAwardees winners Details*************");

		String bharat = "select * from BharataRatnaAwardees";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETS.getValue())) {

			PreparedStatement prepareStatement = connection.prepareStatement(bharat);

			ResultSet res = prepareStatement.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);
				String Name = res.getString(2);
				String AwardedBy = res.getString(3);
				String AwardedAt = res.getString(4);
				String Place = res.getString(5);
				String prisedent = res.getString(6);
				String PrimeMinister = res.getString(7);
				String FiledOfWork = res.getString(8);
				String KnownFor = res.getString(9);
				String RecommendedBy = res.getString(10);
				String ManufacturedBY = res.getString(11);
				int Award = res.getInt(12);
				int Age = res.getInt(13);
				String Gender = res.getString(14);
				int YOB = res.getInt(15);
				int MOB = res.getInt(16);
				int DOB = res.getInt(17);
				String MS = res.getString(18);
				String SpuesNAme = res.getString(19);
				int Nochildren = res.getInt(20);
				String Nationality = res.getString(21);
				String HomeState = res.getString(22);
				String City = res.getString(23);
				String Dist = res.getString(24);
				String FatherName = res.getString(25);
				String MotherName = res.getString(26);
				int NoOfSiblings = res.getInt(27);
				String POB = res.getString(28);
				int YearOfAward = res.getInt(29);
				int MonthOfAward = res.getInt(30);
				int DateOfAward = res.getInt(31);
				String PostHumous = res.getString(32);
				String Perivous = res.getString(33);

				System.out.println(id + " " + Name + " " + AwardedBy + " " + AwardedAt + "" + Place + "" + prisedent
						+ " " + PrimeMinister + " " + FiledOfWork + " " + KnownFor + " " + RecommendedBy + " "
						+ ManufacturedBY + " " + Award + " " + Age + " " + Gender + " " + YOB + " " + MOB + " " + DOB
						+ " " + MS + " " + SpuesNAme + " " + Nochildren + " " + Nationality + "" + HomeState + "" + City
						+ "" + Dist + " " + FatherName + " " + MotherName + "" + NoOfSiblings + "" + POB + ""
						+ YearOfAward + " " + MonthOfAward + " " + DateOfAward + " " + PostHumous + " " + Perivous);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
