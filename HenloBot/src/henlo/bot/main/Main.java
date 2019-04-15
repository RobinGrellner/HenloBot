package henlo.bot.main;

import java.util.HashMap;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;

public class Main {

	private static String TOKEN = "NypzUBnfnTTdRnbNDS5GIiEyLZEcuNYg";

	private static JDABuilder builder;

	private static HashMap<String, Command> commands = new HashMap<>();

	public static void main(String[] args) {

		builder = new JDABuilder(AccountType.BOT).setToken(TOKEN).setStatus(OnlineStatus.ONLINE).setAudioEnabled(true)
				.setAutoReconnect(true);

		initializeCommands();
		try {
			builder.build();
		} catch (LoginException e) {

			e.printStackTrace();
		}

	}

	private static void initializeCommands() {

	}
}