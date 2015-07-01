package com.aeronomos.request.internal;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision$
 * 
 */
public class UserRequestServer {

	private static final int PORT = 9124;

	private IoAcceptor acceptor;

	/**
	 * 
	 */
	public UserRequestServer() {

	}

	/**
	 * 
	 */
	public void start() {

		acceptor = new NioSocketAcceptor();

		acceptor.getFilterChain().addLast("logger", new LoggingFilter());
		acceptor.getFilterChain().addLast(
				"codec",
				new ProtocolCodecFilter(new TextLineCodecFactory(Charset
						.forName("UTF-8"))));

		acceptor.setHandler(new UserRequestHandler());

		acceptor.getSessionConfig().setReadBufferSize(2048);

		acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 10);

		try {

			acceptor.bind(new InetSocketAddress(PORT));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public void stop() {

		if (acceptor != null) {
			acceptor.unbind();
		}

	}

}