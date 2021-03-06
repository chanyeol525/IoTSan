package edu.ksu.cis.bandera.abstraction.options.lexer;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998-2001 SAnToS Laboratories (santos@cis.ksu.edu)  *

 * All rights reserved.                                              *
 *                                                                   *
 * This work was done as a project in the SAnToS Laboratory,         *
 * Department of Computing and Information Sciences, Kansas State    *
 * University, USA (http://www.cis.ksu.edu/santos).                  *
 * It is understood that any modification not identified as such is  *
 * not covered by the preceding statement.                           *
 *                                                                   *
 * This work is free software; you can redistribute it and/or        *
 * modify it under the terms of the GNU Library General Public       *
 * License as published by the Free Software Foundation; either      *
 * version 2 of the License, or (at your option) any later version.  *
 *                                                                   *
 * This work is distributed in the hope that it will be useful,      *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU *
 * Library General Public License for more details.                  *
 *                                                                   *
 * You should have received a copy of the GNU Library General Public *
 * License along with this toolkit; if not, write to the             *
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,      *
 * Boston, MA  02111-1307, USA.                                      *
 *                                                                   *
 * Java is a trademark of Sun Microsystems, Inc.                     *
 *                                                                   *
 * To submit a bug report, send a comment, or get the latest news on *
 * this project and other SAnToS projects, please visit the web-site *
 *                http://www.cis.ksu.edu/santos                      *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/* This file was generated by SableCC (http://www.sable.mcgill.ca/sablecc/). */

import java.io.*;
import java.util.*;
import edu.ksu.cis.bandera.abstraction.options.node.*;

public class Lexer
{
	protected Token token;
	protected State state = State.INITIAL;

	private PushbackReader in;
	private int line;
	private int pos;
	private boolean cr;
	private boolean eof;
	private final StringBuffer text = new StringBuffer();

	private static int[][][][] gotoTable;
/*  {
		{ // INITIAL
			{{9, 9, 1}, {10, 10, 2}, {12, 12, 3}, {13, 13, 4}, {32, 32, 5}, {36, 36, 6}, {40, 40, 7}, {41, 41, 8}, {44, 44, 9}, {46, 46, 10}, {47, 47, 11}, {59, 59, 12}, {65, 90, 13}, {91, 91, 14}, {95, 95, 15}, {97, 98, 13}, {99, 99, 16}, {100, 122, 13}, {123, 123, 17}, {125, 125, 18}, },
			{{9, 32, -2}, },
			{{9, 32, -2}, },
			{{9, 32, -2}, },
			{{9, 9, 1}, {10, 10, 19}, {12, 32, -2}, },
			{{9, 32, -2}, },
			{{36, 36, 20}, {48, 57, 21}, {65, 90, 22}, {95, 95, 23}, {97, 122, 22}, },
			{},
			{},
			{},
			{},
			{{42, 42, 24}, {47, 47, 25}, },
			{},
			{{36, 122, -8}, },
			{{93, 93, 26}, },
			{{36, 122, -8}, },
			{{36, 95, -8}, {97, 107, 22}, {108, 108, 27}, {109, 122, 22}, },
			{},
			{},
			{{9, 32, -2}, },
			{{36, 122, -8}, },
			{{36, 122, -8}, },
			{{36, 122, -8}, },
			{{36, 122, -8}, },
			{{0, 9, 28}, {10, 10, 29}, {11, 12, 28}, {13, 13, 30}, {14, 41, 28}, {42, 42, 31}, {43, 255, 28}, },
			{{0, 9, 32}, {10, 10, 33}, {11, 12, 32}, {13, 13, 34}, {14, 255, 32}, },
			{},
			{{36, 95, -8}, {97, 97, 35}, {98, 122, 22}, },
			{{0, 41, -26}, {42, 42, 36}, {43, 255, 28}, },
			{{0, 255, -30}, },
			{{0, 9, 28}, {10, 10, 37}, {11, 255, -30}, },
			{{0, 9, 38}, {10, 10, 39}, {11, 12, 38}, {13, 13, 40}, {14, 41, 38}, {42, 42, 41}, {43, 46, 38}, {47, 47, 42}, {48, 255, 38}, },
			{{0, 255, -27}, },
			{},
			{{10, 10, 43}, },
			{{36, 95, -8}, {97, 114, 22}, {115, 115, 44}, {116, 122, 22}, },
			{{0, 9, 45}, {10, 10, 46}, {11, 12, 45}, {13, 13, 47}, {14, 41, 45}, {42, 42, 36}, {43, 46, 45}, {47, 47, 48}, {48, 255, 45}, },
			{{0, 255, -30}, },
			{{0, 9, 49}, {10, 10, 50}, {11, 12, 49}, {13, 13, 51}, {14, 41, 49}, {42, 42, 52}, {43, 255, 49}, },
			{{0, 255, -40}, },
			{{0, 9, 49}, {10, 10, 53}, {11, 255, -40}, },
			{{0, 255, -33}, },
			{},
			{},
			{{36, 114, -37}, {115, 115, 54}, {116, 122, 22}, },
			{{0, 9, 55}, {10, 10, 56}, {11, 12, 55}, {13, 13, 57}, {14, 41, 55}, {42, 42, 58}, {43, 255, 55}, },
			{{0, 255, -47}, },
			{{0, 9, 55}, {10, 10, 59}, {11, 255, -47}, },
			{},
			{{0, 255, -40}, },
			{{0, 255, -40}, },
			{{0, 9, 49}, {10, 10, 60}, {11, 255, -40}, },
			{{0, 41, -33}, {42, 42, 52}, {43, 255, -33}, },
			{{0, 255, -40}, },
			{{36, 122, -8}, },
			{{0, 255, -47}, },
			{{0, 255, -47}, },
			{{0, 9, 55}, {10, 10, 61}, {11, 255, -47}, },
			{{0, 41, -38}, {42, 42, 58}, {43, 255, -38}, },
			{{0, 255, -47}, },
			{{0, 255, -40}, },
			{{0, 255, -47}, },
		}
	};*/

	private static int[][] accept;
/*  {
		// INITIAL
		{0, 0, 0, 0, 0, 0, 13, 6, 7, 11, 9, -1, 10, 13, -1, 13, 13, 4, 5, 0, 13, 13, 13, 13, -1, 3, 8, 13, -1, -1, -1, -1, 3, 3, 3, 13, -1, -1, -1, -1, -1, -1, 2, 3, 13, -1, -1, -1, 1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, },

	};*/

	public static class State
	{
		public final static State INITIAL = new State(0);

		private int id;

		private State(int id)
		{
			this.id = id;
		}

		public int id()
		{
			return id;
		}
	}
	public Lexer(PushbackReader in)
	{
		this.in = in;

		if(gotoTable == null)
		{
			try
			{
				DataInputStream s = new DataInputStream(
					new BufferedInputStream(
					Lexer.class.getResourceAsStream("lexer.dat")));

				// read gotoTable
				int length = s.readInt();
				gotoTable = new int[length][][][];
				for(int i = 0; i < gotoTable.length; i++)
				{
					length = s.readInt();
					gotoTable[i] = new int[length][][];
					for(int j = 0; j < gotoTable[i].length; j++)
					{
						length = s.readInt();
						gotoTable[i][j] = new int[length][3];
						for(int k = 0; k < gotoTable[i][j].length; k++)
						{
							for(int l = 0; l < 3; l++)
							{
								gotoTable[i][j][k][l] = s.readInt();
							}
						}
					}
				}

				// read accept
				length = s.readInt();
				accept = new int[length][];
				for(int i = 0; i < accept.length; i++)
				{
					length = s.readInt();
					accept[i] = new int[length];
					for(int j = 0; j < accept[i].length; j++)
					{
						accept[i][j] = s.readInt();
					}
				}

				s.close();
			}
			catch(Exception e)
			{
				throw new RuntimeException("Unable to read lexer.dat.");
			}
		}
	}
	protected void filter() throws LexerException, IOException
	{
	}
	private int getChar() throws IOException
	{
		if(eof)
		{
			return -1;
		}

		int result = in.read();

		if(result == -1)
		{
			eof = true;
		}

		return result;
	}
	private String getText(int acceptLength)
	{
		StringBuffer s = new StringBuffer(acceptLength);
		for(int i = 0; i < acceptLength; i++)
		{
			s.append(text.charAt(i));
		}

		return s.toString();
	}
	protected Token getToken() throws IOException, LexerException
	{
		int dfa_state = 0;

		int start_pos = pos;
		int start_line = line;

		int accept_state = -1;
		int accept_token = -1;
		int accept_length = -1;
		int accept_pos = -1;
		int accept_line = -1;

		int[][][] gotoTable = this.gotoTable[state.id()];
		int[] accept = this.accept[state.id()];
		text.setLength(0);

		while(true)
		{
			int c = getChar();

			if(c != -1)
			{
				switch(c)
				{
				case 10:
					if(cr)
					{
						cr = false;
					}
					else
					{
						line++;
						pos = 0;
					}
					break;
				case 13:
					line++;
					pos = 0;
					cr = true;
					break;
				default:
					pos++;
					cr = false;
					break;
				};

				text.append((char) c);

				do
				{
					int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

					dfa_state = -1;

					int[][] tmp1 =  gotoTable[oldState];
					int low = 0;
					int high = tmp1.length - 1;

					while(low <= high)
					{
						int middle = (low + high) / 2;
						int[] tmp2 = tmp1[middle];

						if(c < tmp2[0])
						{
							high = middle - 1;
						}
						else if(c > tmp2[1])
						{
							low = middle + 1;
						}
						else
						{
							dfa_state = tmp2[2];
							break;
						}
					}
				}while(dfa_state < -1);
			}
			else
			{
				dfa_state = -1;
			}

			if(dfa_state >= 0)
			{
				if(accept[dfa_state] != -1)
				{
					accept_state = dfa_state;
					accept_token = accept[dfa_state];
					accept_length = text.length();
					accept_pos = pos;
					accept_line = line;
				}
			}
			else
			{
				if(accept_state != -1)
				{
					switch(accept_token)
					{
					case 0:
						{
							Token token = new0(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 1:
						{
							Token token = new1(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 2:
						{
							Token token = new2(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 3:
						{
							Token token = new3(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 4:
						{
							Token token = new4(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 5:
						{
							Token token = new5(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 6:
						{
							Token token = new6(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 7:
						{
							Token token = new7(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 8:
						{
							Token token = new8(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 9:
						{
							Token token = new9(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 10:
						{
							Token token = new10(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 11:
						{
							Token token = new11(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 12:
						{
							Token token = new12(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 13:
						{
							Token token = new13(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					}
				}
				else
				{
					if(text.length() > 0)
					{
						throw new LexerException(
							"[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
							" Unknown token: " + text);
					}
					else
					{
						EOF token = new EOF(
							start_line + 1,
							start_pos + 1);
						return token;
					}
				}
			}
		}
	}
	Token new0(String text, int line, int pos) { return new TWhiteSpace(text, line, pos); }
	Token new1(String text, int line, int pos) { return new TTraditionalComment(text, line, pos); }
	Token new10(int line, int pos) { return new TSemicolon(line, pos); }
	Token new11(int line, int pos) { return new TComma(line, pos); }
	Token new12(int line, int pos) { return new TCls(line, pos); }
	Token new13(String text, int line, int pos) { return new TId(text, line, pos); }
	Token new2(String text, int line, int pos) { return new TDocumentationComment(text, line, pos); }
	Token new3(String text, int line, int pos) { return new TEndOfLineComment(text, line, pos); }
	Token new4(int line, int pos) { return new TLBrace(line, pos); }
	Token new5(int line, int pos) { return new TRBrace(line, pos); }
	Token new6(int line, int pos) { return new TLParen(line, pos); }
	Token new7(int line, int pos) { return new TRParen(line, pos); }
	Token new8(int line, int pos) { return new TDim(line, pos); }
	Token new9(int line, int pos) { return new TDot(line, pos); }
	public Token next() throws LexerException, IOException
	{
		while(token == null)
		{
			token = getToken();
			filter();
		}

		Token result = token;
		token = null;
		return result;
	}
	public Token peek() throws LexerException, IOException
	{
		while(token == null)
		{
			token = getToken();
			filter();
		}

		return token;
	}
	private void pushBack(int acceptLength) throws IOException
	{
		int length = text.length();
		for(int i = length - 1; i >= acceptLength; i--)
		{
			eof = false;

			in.unread(text.charAt(i));
		}
	}
	protected void unread(Token token) throws IOException
	{
		String text = token.getText();
		int length = text.length();

		for(int i = length - 1; i >= 0; i--)
		{
			eof = false;

			in.unread(text.charAt(i));
		}

		pos = token.getPos() - 1;
		line = token.getLine() - 1;
	}
}
