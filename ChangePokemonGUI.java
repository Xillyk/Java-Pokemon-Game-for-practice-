
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ChangePokemonGUI extends JFrame {
    private Trainer trainer;
    private ArrayList<Pokemon> pokemonBag;
    private int numPokemon;

    public ChangePokemonGUI(Trainer trainer, Pokemon wildPokemon) {
        super("Change Pokemon");
        this.trainer = trainer;
        this.pokemonBag = trainer.getPokemonBag();

        numPokemon = trainer.getPokemonBag().size();

        setSize(900, 900);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane s = new JScrollPane();
        add(s);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        s.setViewportView(mainPanel);

        JPanel[] arrPanels = new JPanel[numPokemon];
        JLabel[] pokemonPic = new JLabel[numPokemon];

        JPanel[] p = new JPanel[numPokemon];
        JPanel[] pl1 = new JPanel[numPokemon];
        JPanel[] pl2 = new JPanel[numPokemon];
        JPanel[] pl3 = new JPanel[numPokemon];
        JPanel[] pl4 = new JPanel[numPokemon];
        JPanel[] pl5 = new JPanel[numPokemon];
        JPanel[] pl6 = new JPanel[numPokemon];
        JPanel[] pl7 = new JPanel[numPokemon];
        JPanel[] pl8 = new JPanel[numPokemon];
        JPanel[] pl9 = new JPanel[numPokemon];

        JLabel[] nickNameLabel = new JLabel[numPokemon];
        JLabel[] nameLabel = new JLabel[numPokemon];
        JLabel[] lvLabel = new JLabel[numPokemon];
        JLabel[] typeLabel = new JLabel[numPokemon];
        JLabel[] hpLabel = new JLabel[numPokemon];
        JProgressBar[] hpBar = new JProgressBar[numPokemon];
        JLabel[] hgLabel = new JLabel[numPokemon];
        JProgressBar[] hgBar = new JProgressBar[numPokemon];
        JLabel[] spLabel = new JLabel[numPokemon];
        JProgressBar[] spBar = new JProgressBar[numPokemon];
        JLabel[] expLabel = new JLabel[numPokemon];
        JProgressBar[] expBar = new JProgressBar[numPokemon];
        JButton[] bt = new JButton[numPokemon];

        for (int i = 0; i < numPokemon; i++) {
            arrPanels[i] = createPanel();
            p[i] = createPanel2();
            pl1[i] = createPanel3();
            pl2[i] = createPanel3();
            pl3[i] = createPanel3();
            pl4[i] = createPanel3();
            pl5[i] = createPanel3();
            pl6[i] = createPanel3();
            pl7[i] = createPanel3();
            pl8[i] = createPanel3();
            pl9[i] = createPanel3();

            pokemonPic[i] = createPicLabel(i);
            nickNameLabel[i] = createNickNameLabel(i);
            nameLabel[i] = createNameLabel(i);
            lvLabel[i] = createLevelLabel(i);
            typeLabel[i] = createTypeLabel(i);

            hpLabel[i] = createHpLabel(i);
            hpBar[i] = createHpBar(i);

            hgLabel[i] = createHgLabel(i);
            hgBar[i] = createHgBar(i);

            spLabel[i] = createSpLabel(i);
            spBar[i] = createSpBar(i);

            expLabel[i] = createExpLabel(i);
            expBar[i] = createExpBar(i);

            bt[i] = createButton();

            pl1[i].add(nickNameLabel[i]);
            pl2[i].add(nameLabel[i]);
            pl3[i].add(lvLabel[i]);
            pl4[i].add(typeLabel[i]);
            pl5[i].add(hpLabel[i]);
            pl5[i].add(hpBar[i]);

            pl6[i].add(hgLabel[i]);
            pl6[i].add(hgBar[i]);

            pl7[i].add(spLabel[i]);
            pl7[i].add(spBar[i]);

            pl8[i].add(expLabel[i]);
            pl8[i].add(expBar[i]);

            pl9[i].add(bt[i]);

            p[i].add(pl1[i]);
            p[i].add(pl2[i]);
            p[i].add(pl3[i]);
            p[i].add(pl4[i]);
            p[i].add(pl5[i]);
            p[i].add(pl6[i]);
            p[i].add(pl7[i]);
            p[i].add(pl8[i]);
            p[i].add(pl9[i]);

            arrPanels[i].add(pokemonPic[i]);
            arrPanels[i].add(p[i]);

            mainPanel.add(arrPanels[i]);
        }

        switch (numPokemon) {
            case 10: {
                bt[9].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(9);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
            case 9: {
                bt[8].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(8);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
            case 8: {
                bt[7].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(7);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
            case 7: {
                bt[6].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(6);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
            case 6: {
                bt[5].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(5);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
            case 5: {
                bt[4].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(4);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
            case 4: {
                bt[3].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(3);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
            case 3: {
                bt[2].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(2);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
            case 2: {
                bt[1].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(1);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
            case 1: {
                bt[0].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        trainer.setPokemonIndex(0);
                        new DungeonGUI(trainer, wildPokemon);
                        dispose();
                    }
                });
            }
        }
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(850, 500));
        return panel;
    }

    private JPanel createPanel2() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        return panel;
    }

    private JPanel createPanel3() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        return panel;
    }

    private JLabel createPicLabel(int i) {
        JLabel picLabel = new JLabel(
                new ImageIcon(this.getClass().getResource("pokemon/" + pokemonBag.get(i).getName() + ".png")));
        return picLabel;
    }

    private JLabel createHpLabel(int i) {
        JLabel hpLabel = new JLabel("HP   ");
        hpLabel.setFont(new Font("Serif", Font.BOLD, 25));
        return hpLabel;
    }

    private JProgressBar createHpBar(int i) {
        // hp process bar
        JProgressBar hpBar = new JProgressBar();
        hpBar.setMaximum(pokemonBag.get(i).getMaxHP());
        hpBar.setMinimum(0);
        hpBar.setValue(pokemonBag.get(i).getHP());
        hpBar.setString(pokemonBag.get(i).getHPStatus());
        hpBar.setStringPainted(true);

        if (pokemonBag.get(i).getHPStatusForCheck() == 2) {
            hpBar.setForeground(Color.GREEN);
        } else if (pokemonBag.get(i).getHPStatusForCheck() == 1) {
            hpBar.setForeground(Color.ORANGE);
        } else if (pokemonBag.get(i).getHPStatusForCheck() == 0) {
            hpBar.setForeground(Color.RED);
        }
        return hpBar;
    }

    private JProgressBar createHgBar(int i) {
        JProgressBar hgBar = new JProgressBar();
        hgBar.setMaximum(pokemonBag.get(i).getMaxHungryPoint());
        hgBar.setMinimum(0);
        hgBar.setValue(pokemonBag.get(i).getHungryPoint());
        hgBar.setString(pokemonBag.get(i).getHGStatus());
        hgBar.setStringPainted(true);

        if (pokemonBag.get(i).getHGStatusForCheck() == 2) {
            hgBar.setForeground(Color.GREEN);
        } else if (pokemonBag.get(i).getHGStatusForCheck() == 1) {
            hgBar.setForeground(Color.ORANGE);
        } else if (pokemonBag.get(i).getHGStatusForCheck() == 0) {
            hgBar.setForeground(Color.RED);
        }
        return hgBar;
    }

    private JProgressBar createSpBar(int i) {
        JProgressBar spBar = new JProgressBar();
        spBar.setMaximum(pokemonBag.get(i).getMaxSleepingPoint());
        spBar.setMinimum(0);
        spBar.setValue(pokemonBag.get(i).getSleepPoint());
        spBar.setString(pokemonBag.get(i).getSPStatus());
        spBar.setStringPainted(true);

        if (pokemonBag.get(i).getSPStatusForCheck() == 2) {
            spBar.setForeground(Color.GREEN);
        } else if (pokemonBag.get(i).getSPStatusForCheck() == 1) {
            spBar.setForeground(Color.ORANGE);
        } else if (pokemonBag.get(i).getSPStatusForCheck() == 0) {
            spBar.setForeground(Color.RED);
        }
        return spBar;
    }

    private JProgressBar createExpBar(int i) {
        JProgressBar expBar = new JProgressBar();
        expBar.setMaximum(pokemonBag.get(i).getMaxExpPerLevel());
        expBar.setMinimum(0);
        expBar.setValue(pokemonBag.get(i).getExp());
        expBar.setString(pokemonBag.get(i).getEXPStatus());
        expBar.setStringPainted(true);
        return expBar;
    }

    private JLabel createHgLabel(int i) {
        JLabel hgLabel = new JLabel("HG  ");
        hgLabel.setFont(new Font("Serif", Font.BOLD, 25));
        return hgLabel;
    }

    private JLabel createSpLabel(int i) {
        JLabel spLabel = new JLabel("SP    ");
        spLabel.setFont(new Font("Serif", Font.BOLD, 25));
        return spLabel;
    }

    private JLabel createExpLabel(int i) {
        JLabel expLabel = new JLabel("EXP ");
        expLabel.setFont(new Font("Serif", Font.BOLD, 25));
        return expLabel;
    }

    private JLabel createNickNameLabel(int i) {
        JLabel nicknameLabel = new JLabel(pokemonBag.get(i).getNickName());
        nicknameLabel.setFont(new Font("Serif", Font.BOLD, 25));
        nicknameLabel.setForeground(Color.blue);
        return nicknameLabel;
    }

    private JLabel createNameLabel(int i) {
        JLabel nameLabel = new JLabel("" + pokemonBag.get(i).getName());
        nameLabel.setFont(new Font("Serif", Font.BOLD, 25));
        nameLabel.setForeground(Color.magenta);
        return nameLabel;
    }

    private JLabel createTypeLabel(int i) {
        JLabel typeLabel = new JLabel(pokemonBag.get(i).getType());
        typeLabel.setFont(new Font("Serif", Font.BOLD, 25));
        return typeLabel;
    }

    private JLabel createLevelLabel(int i) {
        JLabel levelLabel = new JLabel("Lv : " + pokemonBag.get(i).getLevel());
        levelLabel.setFont(new Font("Serif", Font.BOLD, 25));
        return levelLabel;
    }

    private JButton createButton() {
        JButton bt = new JButton("Select");
        return bt;
    }
}