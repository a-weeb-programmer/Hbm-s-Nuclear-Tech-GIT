package com.hbm.blocks;

import com.hbm.blocks.generic.*;
import com.hbm.blocks.generic.BlockHazard.ExtDisplayEffect;
import com.hbm.blocks.bomb.*;
import com.hbm.blocks.fluid.*;
import com.hbm.blocks.gas.*;
import com.hbm.blocks.machine.*;
import com.hbm.blocks.machine.rbmk.*;
import com.hbm.blocks.network.*;
import com.hbm.blocks.test.*;
import com.hbm.blocks.turret.*;
import com.hbm.items.block.*;
import com.hbm.items.bomb.*;
import com.hbm.items.special.ItemHazard;
import com.hbm.items.special.ItemOreBlock;
import com.hbm.lib.ModDamageSource;
import com.hbm.lib.RefStrings;
import com.hbm.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModBlocks {
	
	public static void mainRegistry()
	{
		initializeBlock();
		registerBlock();
	}
	
	public static Block test_render;
	public static Block test_container;
	public static Block test_bomb;
	public static Block test_bomb_advanced;
	public static Block test_nuke;
	public static final int guiID_test_nuke = 2;
	public static Block event_tester;
	public static Block rotation_tester;
	public static Block obj_tester;
	public static Block test_ticker;
	public static Block test_missile;
	public static Block test_core;
	public static Block test_charge;

	public static Block ore_uranium;
	public static Block ore_uranium_scorched;
	public static Block ore_titanium;
	public static Block ore_sulfur;
	public static Block ore_thorium;
	public static Block ore_niter;
	public static Block ore_copper;
	public static Block ore_tungsten;
	public static Block ore_aluminium;
	public static Block ore_fluorite;
	public static Block ore_lead;
	public static Block ore_schrabidium;
	public static Block ore_beryllium;
	public static Block ore_australium;
	public static Block ore_weidanium;
	public static Block ore_reiium;
	public static Block ore_unobtainium;
	public static Block ore_daffergon;
	public static Block ore_verticium;
	public static Block ore_rare;
	public static Block ore_cinnebar;

	public static Block ore_nether_coal;
	public static Block ore_nether_smoldering;
	public static Block ore_nether_uranium;
	public static Block ore_nether_uranium_scorched;
	public static Block ore_nether_plutonium;
	public static Block ore_nether_tungsten;
	public static Block ore_nether_sulfur;
	public static Block ore_nether_fire;
	public static Block ore_nether_schrabidium;

	public static Block ore_meteor_uranium;
	public static Block ore_meteor_thorium;
	public static Block ore_meteor_titanium;
	public static Block ore_meteor_sulfur;
	public static Block ore_meteor_copper;
	public static Block ore_meteor_tungsten;
	public static Block ore_meteor_aluminium;
	public static Block ore_meteor_lead;
	public static Block ore_meteor_lithium;
	public static Block ore_meteor_starmetal;
	
	public static Block stone_gneiss;
	public static Block ore_gneiss_iron;
	public static Block ore_gneiss_gold;
	public static Block ore_gneiss_uranium;
	public static Block ore_gneiss_uranium_scorched;
	public static Block ore_gneiss_copper;
	public static Block ore_gneiss_asbestos;
	public static Block ore_gneiss_lithium;
	public static Block ore_gneiss_schrabidium;
	public static Block ore_gneiss_rare;
	public static Block ore_gneiss_gas;
	
	public static Block stone_depth;
	public static Block ore_depth_cinnebar;
	public static Block ore_depth_zirconium;
	public static Block cluster_depth_iron;
	public static Block cluster_depth_titanium;
	public static Block cluster_depth_tungsten;

	public static Block cluster_iron;
	public static Block cluster_titanium;
	public static Block cluster_aluminium;

	public static Block ore_oil;
	public static Block ore_oil_empty;
	public static Block ore_oil_sand;
	public static Block ore_lignite;
	public static Block ore_asbestos;
	public static Block ore_coal_oil;
	public static Block ore_coal_oil_burning;

	public static Block ore_tikite;

	public static Block block_thorium;
	public static Block block_thorium_fuel;
	public static Block block_uranium;
	public static Block block_u233;
	public static Block block_u235;
	public static Block block_u238;
	public static Block block_uranium_fuel;
	public static Block block_neptunium;
	public static Block block_polonium;
	public static Block block_mox_fuel;
	public static Block block_plutonium;
	public static Block block_pu238;
	public static Block block_pu239;
	public static Block block_pu240;
	public static Block block_pu_mix;
	public static Block block_plutonium_fuel;
	public static Block block_titanium;
	public static Block block_sulfur;
	public static Block block_niter;
	public static Block block_copper;
	public static Block block_red_copper;
	public static Block block_tungsten;
	public static Block block_aluminium;
	public static Block block_fluorite;
	public static Block block_steel;
	public static Block block_lead;
	public static Block block_trinitite;
	public static Block block_waste;
	public static Block block_waste_painted;
	public static Block ancient_scrap;
	public static Block block_corium;
	public static Block block_scrap;
	public static Block block_electrical_scrap;
	public static Block block_beryllium;
	public static Block block_schraranium;
	public static Block block_schrabidium;
	public static Block block_schrabidate;
	public static Block block_solinium;
	public static Block block_schrabidium_fuel;
	public static Block block_euphemium;
	public static Block block_schrabidium_cluster;
	public static Block block_euphemium_cluster;
	public static Block block_dineutronium;
	public static Block block_advanced_alloy;
	public static Block block_magnetized_tungsten;
	public static Block block_combine_steel;
	public static Block block_desh;
	public static Block block_dura_steel;
	public static Block block_starmetal;
	public static Block block_yellowcake;
	public static Block block_insulator;
	public static Block block_fiberglass;
	public static Block block_asbestos;
	public static Block block_cobalt;
	public static Block block_lithium;
	public static Block block_zirconium;
	public static Block block_white_phosphorus;
	public static Block block_red_phosphorus;
	public static Block block_fallout;
	public static Block block_foam;
	public static Block block_graphite;
	public static Block block_boron;
	public static Block block_lanthanium;
	public static Block block_actinium;
	public static Block block_tritium;

	public static Block block_australium;
	public static Block block_weidanium;
	public static Block block_reiium;
	public static Block block_unobtainium;
	public static Block block_daffergon;
	public static Block block_verticium;

	public static Block block_cap_nuka;
	public static Block block_cap_quantum;
	public static Block block_cap_rad;
	public static Block block_cap_sparkle;
	public static Block block_cap_korl;
	public static Block block_cap_fritz;
	public static Block block_cap_sunset;
	public static Block block_cap_star;

	public static Block deco_titanium;
	public static Block deco_red_copper;
	public static Block deco_tungsten;
	public static Block deco_aluminium;
	public static Block deco_steel;
	public static Block deco_lead;
	public static Block deco_beryllium;
	public static Block deco_asbestos;

	public static Block hazmat;

	public static Block gravel_obsidian;
	public static Block gravel_diamond;
	public static Block asphalt;
	public static Block asphalt_light;
	
	public static Block reinforced_brick;
	public static Block reinforced_glass;
	public static Block reinforced_light;
	public static Block reinforced_sand;
	public static Block reinforced_lamp_off;
	public static Block reinforced_lamp_on;

	public static Block lamp_tritium_green_off;
	public static Block lamp_tritium_green_on;
	public static Block lamp_tritium_blue_off;
	public static Block lamp_tritium_blue_on;
	
	public static Block lamp_demon;

	public static Block reinforced_stone;
	public static Block concrete_smooth;
	public static Block concrete_colored;
	public static Block concrete;
	public static Block concrete_asbestos;
	public static Block concrete_pillar;
	public static Block brick_concrete;
	public static Block brick_concrete_mossy;
	public static Block brick_concrete_cracked;
	public static Block brick_concrete_broken;
	public static Block brick_concrete_marked;
	public static Block brick_obsidian;
	public static Block brick_light;
	public static Block brick_compound;
	public static Block brick_asbestos;

	public static Block cmb_brick;
	public static Block cmb_brick_reinforced;

	public static Block tile_lab;
	public static Block tile_lab_cracked;
	public static Block tile_lab_broken;

	public static Block block_meteor;
	public static Block block_meteor_cobble;
	public static Block block_meteor_broken;
	public static Block block_meteor_molten;
	public static Block block_meteor_treasure;
	public static Block meteor_polished;
	public static Block meteor_brick;
	public static Block meteor_brick_mossy;
	public static Block meteor_brick_cracked;
	public static Block meteor_brick_chiseled;
	public static Block meteor_pillar;
	public static Block meteor_spawner;
	public static Block meteor_battery;

	public static Block brick_jungle;
	public static Block brick_jungle_cracked;
	public static Block brick_jungle_fragile;
	public static Block brick_jungle_lava;
	public static Block brick_jungle_ooze;
	public static Block brick_jungle_mystic;
	public static Block brick_jungle_trap;
	public static Block brick_jungle_glyph;
	public static Block brick_jungle_circle;

	public static Block brick_dungeon;
	public static Block brick_dungeon_flat;
	public static Block brick_dungeon_tile;
	public static Block brick_dungeon_circle;

	public static Block tape_recorder;
	public static Block steel_poles;
	public static Block pole_top;
	public static Block pole_satellite_receiver;
	public static Block steel_wall;
	public static Block steel_corner;
	public static Block steel_roof;
	public static Block steel_beam;
	public static Block steel_scaffold;
	public static Block steel_grate;

	public static Block deco_pipe;
	public static Block deco_pipe_rusted;
	public static Block deco_pipe_green;
	public static Block deco_pipe_green_rusted;
	public static Block deco_pipe_red;
	public static Block deco_pipe_marked;
	public static Block deco_pipe_rim;
	public static Block deco_pipe_rim_rusted;
	public static Block deco_pipe_rim_green;
	public static Block deco_pipe_rim_green_rusted;
	public static Block deco_pipe_rim_red;
	public static Block deco_pipe_rim_marked;
	public static Block deco_pipe_framed;
	public static Block deco_pipe_framed_rusted;
	public static Block deco_pipe_framed_green;
	public static Block deco_pipe_framed_green_rusted;
	public static Block deco_pipe_framed_red;
	public static Block deco_pipe_framed_marked;
	public static Block deco_pipe_quad;
	public static Block deco_pipe_quad_rusted;
	public static Block deco_pipe_quad_green;
	public static Block deco_pipe_quad_green_rusted;
	public static Block deco_pipe_quad_red;
	public static Block deco_pipe_quad_marked;

	public static Block broadcaster_pc;
	public static Block geiger;
	public static Block hev_battery;

	public static Block fence_metal;

	public static Block sand_boron;
	public static Block sand_uranium;
	public static Block sand_polonium;
	public static Block glass_boron;
	public static Block glass_uranium;
	public static Block glass_trinitite;
	public static Block glass_polonium;

	public static Block mush;
	public static Block mush_block;
	public static Block mush_block_stem;

	public static Block waste_earth;
	public static Block waste_mycelium;
	public static Block waste_trinitite;
	public static Block waste_trinitite_red;
	public static Block waste_log;
	public static Block waste_planks;
	public static Block frozen_dirt;
	public static Block frozen_grass;
	public static Block frozen_log;
	public static Block frozen_planks;
	
	public static Block fallout;
	public static Block foam_layer;
	public static Block sand_boron_layer;

	public static Block sellafield_slaked;
	public static Block sellafield_0;
	public static Block sellafield_1;
	public static Block sellafield_2;
	public static Block sellafield_3;
	public static Block sellafield_4;
	public static Block sellafield_core;

	public static Block geysir_water;
	public static Block geysir_chlorine;
	public static Block geysir_vapor;
	public static Block geysir_nether;

	public static Block flame_war;
	public static Block float_bomb;
	public static Block therm_endo;
	public static Block therm_exo;
	public static Block emp_bomb;
	public static Block det_cord;
	public static Block det_charge;
	public static Block det_nuke;
	public static Block det_miner;
	public static Block red_barrel;
	public static Block pink_barrel;
	public static Block yellow_barrel;
	public static Block vitrified_barrel;
	public static Block lox_barrel;
	public static Block taint_barrel;
	public static Block crashed_balefire;
	public static Block rejuvinator;
	public static Block fireworks;
	
	public static Block mine_ap;
	public static Block mine_he;
	public static Block mine_shrap;
	public static Block mine_fat;
	
	public static Block crate;
	public static Block crate_weapon;
	public static Block crate_lead;
	public static Block crate_metal;
	public static Block crate_red;
	public static Block crate_can;
	public static Block crate_ammo;
	public static Block crate_jungle;

	public static Block boxcar;
	public static Block boat;
	public static Block bomber;

	public static Block seal_frame;
	public static Block seal_controller;
	public static Block seal_hatch;

	public static Block vault_door;
	public static Block blast_door;

	public static Block door_metal;
	public static Block door_office;
	public static Block door_bunker;

	public static Block barbed_wire;
	public static Block barbed_wire_fire;
	public static Block barbed_wire_poison;
	public static Block barbed_wire_acid;
	public static Block barbed_wire_wither;
	public static Block barbed_wire_ultradeath;
	public static Block spikes;

	public static Block tesla;

	public static Block marker_structure;

	public static Block muffler;

	public static Block sat_mapper;
	public static Block sat_scanner;
	public static Block sat_radar;
	public static Block sat_laser;
	public static Block sat_foeq;
	public static Block sat_resonator;

	public static Block sat_dock;
	public static final int guiID_dock = 80;

	public static Block soyuz_capsule;
	public static final int guiID_capsule = 93;
	
	public static Block crate_iron;
	public static final int guiID_crate_iron = 46;
	
	public static Block crate_steel;
	public static final int guiID_crate_steel = 47;
	
	public static Block crate_tungsten;
	public static final int guiID_crate_tungsten = 103;
	
	public static Block safe;
	public static final int guiID_safe = 70;
	
	public static Block nuke_gadget;
	public static final int guiID_nuke_gadget = 3;
	public static Block nuke_boy;
	public static final int guiID_nuke_boy = 4;
	public static Block nuke_man;
	public static final int guiID_nuke_man = 6;
	public static Block nuke_mike;
	public static final int guiID_nuke_mike = 11;
	public static Block nuke_tsar;
	public static final int guiID_nuke_tsar = 12;
	public static Block nuke_fleija;
	public static final int guiID_nuke_fleija = 17;
	public static Block nuke_prototype;
	public static final int guiID_nuke_prototype = 23;
	public static Block nuke_custom;
	public static final int guiID_nuke_custom = 37;
	public static Block nuke_solinium;
	public static final int guiID_nuke_solinium = 60;
	public static Block nuke_n2;
	public static final int guiID_nuke_n2 = 61;
	public static Block nuke_n45;
	public static final int guiID_nuke_n45 = 77;
	public static Block nuke_fstbmb;
	public static final int guiID_nuke_fstbmb = 96;
	public static Block bomb_multi;
	public static final int guiID_bomb_multi = 10;
	
	public static Block cel_prime;
	public static final int guiID_cel_prime = 62;
	public static Block cel_prime_terminal;
	public static Block cel_prime_battery;
	public static Block cel_prime_port;
	public static Block cel_prime_tanks;
	
	public static Block machine_difurnace_off;
	public static Block machine_difurnace_on;
	public static final int guiID_test_difurnace = 1;
	
	public static Block machine_centrifuge;
	public static final int guiID_centrifuge = 5;
	
	public static Block machine_gascent;
	public static final int guiID_gascent = 71;

	public static Block machine_fel;
	public static final int guiID_fel = 110;
	public static Block machine_silex;
	public static final int guiID_silex = 109;
	
	public static Block machine_crystallizer;
	public static final int guiID_crystallizer = 94;
	
	public static Block machine_uf6_tank;
	public static final int guiID_uf6_tank = 7;
	
	public static Block machine_puf6_tank;
	public static final int guiID_puf6_tank = 8;

	public static Block machine_reactor;
	public static Block machine_reactor_on;
	public static final int guiID_reactor = 9;
	
	public static Block machine_nuke_furnace_off;
	public static Block machine_nuke_furnace_on;
	public static final int guiID_nuke_furnace = 13;
	
	public static Block machine_rtg_furnace_off;
	public static Block machine_rtg_furnace_on;
	public static final int guiID_rtg_furnace = 14;

	public static Block machine_generator;
	public static final int guiID_machine_generator = 15;

	public static Block machine_industrial_generator;
	public static final int guiID_machine_industrial_generator = 39;

	public static Block machine_cyclotron;
	public static final int guiID_machine_cyclotron = 41;

	public static Block hadron_plating;
	public static Block hadron_plating_blue;
	public static Block hadron_plating_black;
	public static Block hadron_plating_yellow;
	public static Block hadron_plating_striped;
	public static Block hadron_plating_voltz;
	public static Block hadron_plating_glass;
	public static Block hadron_coil_alloy;
	public static Block hadron_coil_gold;
	public static Block hadron_coil_neodymium;
	public static Block hadron_coil_magtung;
	public static Block hadron_coil_schrabidium;
	public static Block hadron_coil_schrabidate;
	public static Block hadron_coil_starmetal;
	public static Block hadron_coil_chlorophyte;
	public static Block hadron_coil_mese;
	public static Block hadron_power;
	public static Block hadron_power_10m;
	public static Block hadron_power_100m;
	public static Block hadron_power_1g;
	public static Block hadron_power_10g;
	public static Block hadron_diode;
	public static Block hadron_analysis;
	public static Block hadron_analysis_glass;
	public static Block hadron_access;
	public static Block hadron_core;
	public static final int guiID_hadron = 101;
	
	public static Block machine_electric_furnace_off;
	public static Block machine_electric_furnace_on;
	public static final int guiID_electric_furnace = 16;

	public static Block machine_microwave;
	public static final int guiID_microwave = 97;
	
	public static Block machine_arc_furnace_off;
	public static Block machine_arc_furnace_on;
	public static final int guiID_machine_arc = 82;

	//public static Block machine_deuterium;
	public static final int guiID_machine_deuterium = 20;

	public static Block machine_battery_potato;
	public static Block machine_battery;
	public static Block machine_lithium_battery;
	public static Block machine_schrabidium_battery;
	public static Block machine_dineutronium_battery;
	public static Block machine_fensu;
	public static final int guiID_machine_battery = 21;
	public static final int guiID_machine_fensu = 99;
	
	public static Block machine_coal_off;
	public static Block machine_coal_on;
	public static final int guiID_machine_coal = 22;

	public static Block red_wire_coated;
	public static Block red_cable;
	public static Block red_pylon;
	public static Block cable_switch;
	public static Block machine_detector;
	public static Block rf_cable;
	public static Block oil_duct_solid;
	public static Block oil_duct;
	public static Block gas_duct_solid;
	public static Block gas_duct;
	public static Block fluid_duct;

	public static Block conveyor;

	public static Block chain;

	public static Block ladder_sturdy;
	public static Block ladder_iron;
	public static Block ladder_gold;
	public static Block ladder_aluminium;
	public static Block ladder_copper;
	public static Block ladder_titanium;
	public static Block ladder_lead;
	public static Block ladder_cobalt;
	public static Block ladder_steel;
	public static Block ladder_tungsten;

	public static Block barrel_plastic;
	public static Block barrel_corroded;
	public static Block barrel_iron;
	public static Block barrel_steel;
	public static Block barrel_antimatter;
	public static final int guiID_barrel = 92;

	public static Block machine_transformer;
	public static Block machine_transformer_20;
	public static Block machine_transformer_dnt;
	public static Block machine_transformer_dnt_20;

	public static Block bomb_multi_large;
	public static final int guiID_bomb_multi_large = 18;

	public static Block machine_solar_boiler;
	public static final int guiID_solar_boiler = 18;
	public static Block solar_mirror;

	public static Block struct_launcher;
	public static Block struct_scaffold;
	public static Block struct_launcher_core;
	public static Block struct_launcher_core_large;
	public static Block struct_soyuz_core;
	public static Block struct_iter_core;
	public static Block struct_plasma_core;
	
	public static Block factory_titanium_hull;
	public static Block factory_titanium_furnace;
	public static Block factory_titanium_conductor;
	public static Block factory_titanium_core;
	public static final int guiID_factory_titanium = 24;
	
	public static Block factory_advanced_hull;
	public static Block factory_advanced_furnace;
	public static Block factory_advanced_conductor;
	public static Block factory_advanced_core;
	public static final int guiID_factory_advanced = 25;

	public static Block reactor_element;
	public static Block reactor_control;
	public static Block reactor_hatch;
	public static Block reactor_ejector;
	public static Block reactor_inserter;
	public static Block reactor_conductor;
	public static Block reactor_computer;
	public static final int guiID_reactor_multiblock = 26;

	public static Block fusion_conductor;
	public static Block fusion_center;
	public static Block fusion_motor;
	public static Block fusion_heater;
	public static Block fusion_hatch;
	public static Block fusion_core;
	public static Block plasma;
	public static final int guiID_fusion_multiblock = 27;

	public static Block iter;
	public static final int guiID_iter = 98;
	public static Block plasma_heater;
	public static final int guiID_plasma_heater = 99;

	public static Block watz_element;
	public static Block watz_control;
	public static Block watz_cooler;
	public static Block watz_end;
	public static Block watz_hatch;
	public static Block watz_conductor;
	public static Block watz_core;
	public static final int guiID_watz_multiblock = 32;

	public static Block fwatz_conductor;
	public static Block fwatz_cooler;
	public static Block fwatz_tank;
	public static Block fwatz_scaffold;
	public static Block fwatz_hatch;
	public static Block fwatz_computer;
	public static Block fwatz_core;
	public static Block fwatz_plasma;
	public static final int guiID_fwatz_multiblock = 33;

	public static Block balefire;

	public static Block ams_base;
	public static final int guiID_ams_base = 54;
	public static Block ams_emitter;
	public static final int guiID_ams_emitter = 55;
	public static Block ams_limiter;
	public static final int guiID_ams_limiter = 56;

	public static Block dfc_emitter;
	public static final int guiID_dfc_emitter = 87;
	public static Block dfc_injector;
	public static final int guiID_dfc_injector = 90;
	public static Block dfc_receiver;
	public static final int guiID_dfc_receiver = 88;
	public static Block dfc_stabilizer;
	public static final int guiID_dfc_stabilizer = 91;
	public static Block dfc_core;
	public static final int guiID_dfc_core = 89;

	public static Block machine_converter_he_rf;
	public static final int guiID_converter_he_rf = 28;

	public static Block machine_converter_rf_he;
	public static final int guiID_converter_rf_he = 29;

	public static Block machine_schrabidium_transmutator;
	public static final int guiID_schrabidium_transmutator = 30;

	public static Block machine_diesel;
	public static final int guiID_machine_diesel = 31;

	public static Block machine_shredder;
	public static final int guiID_machine_shredder = 34;

	public static Block machine_shredder_large;
	public static final int guiID_machine_shredder_large = 76;

	public static Block machine_combine_factory;
	public static final int guiID_combine_factory = 35;

	public static Block machine_teleporter;
	public static final int guiID_machine_teleporter = 36;

	public static Block machine_reix_mainframe;
	public static final int guiID_machine_reix_mainframe = 38;

	public static Block machine_rtg_grey;
	public static final int guiID_machine_rtg = 42;
	//public static Block machine_rtg_red;
	//public static Block machine_rtg_orange;
	//public static Block machine_rtg_yellow;
	//public static Block machine_rtg_green;
	public static Block machine_rtg_cyan;
	//public static Block machine_rtg_blue;
	//public static Block machine_rtg_purple;
	public static Block machine_amgen;
	public static Block machine_geo;
	public static Block machine_minirtg;
	public static Block machine_powerrtg;

	public static Block machine_well;
	public static Block oil_pipe;
	public static final int guiID_machine_well = 40;

	public static Block machine_flare;
	public static final int guiID_machine_flare = 44;

	public static Block machine_refinery;
	public static final int guiID_machine_refinery = 43;

	public static Block machine_boiler_off;
	public static Block machine_boiler_on;
	public static final int guiID_machine_boiler = 72;

	public static Block machine_boiler_electric_off;
	public static Block machine_boiler_electric_on;
	public static final int guiID_machine_boiler_electric = 73;

	public static Block machine_turbine;
	public static final int guiID_machine_turbine = 74;

	public static Block machine_large_turbine;
	public static final int guiID_machine_large_turbine = 100;

	public static Block machine_deaerator;
	public static final int guiID_machine_deaerator = 74;

	public static Block machine_drill;
	public static Block drill_pipe;
	public static final int guiID_machine_drill = 45;

	public static Block machine_mining_laser;
	public static Block barricade;
	public static final int guiID_mining_laser = 95;

	public static Block machine_assembler;
	public static final int guiID_machine_assembler = 48;

	public static Block machine_chemplant;
	public static final int guiID_machine_chemplant = 49;

	public static Block machine_fluidtank;
	public static final int guiID_machine_fluidtank = 50;

	public static Block launch_pad;
	public static final int guiID_launch_pad = 19;

	public static Block machine_missile_assembly;
	public static final int guiID_missile_assembly = 83;

	public static Block compact_launcher;
	public static final int guiID_compact_launcher = 85;

	public static Block launch_table;
	public static final int guiID_launch_table = 84;

	public static Block soyuz_launcher;
	public static final int guiID_soyuz_launcher = 86;

	public static Block machine_radar;
	public static final int guiID_radar = 59;

	public static Block machine_pumpjack;
	public static final int guiID_machine_pumpjack = 51;

	public static Block machine_turbofan;
	public static final int guiID_machine_turbofan = 52;

	public static Block machine_selenium;
	public static final int guiID_machine_selenium = 63;

	public static Block machine_press;
	public static final int guiID_machine_press = 53;

	public static Block machine_epress;
	public static final int guiID_machine_epress = 81;

	public static Block machine_siren;
	public static final int guiID_siren = 57;

	public static Block machine_radgen;
	public static final int guiID_radgen = 58;

	public static Block machine_satlinker;
	public static final int guiID_satlinker = 64;

	public static Block machine_telelinker;
	public static final int guiID_telelinker = 68;

	public static Block machine_keyforge;
	public static final int guiID_keyforge = 67;

	public static Block machine_armor_table;
	public static final int guiID_armor_table = 102;

	public static Block machine_reactor_small;
	public static final int guiID_reactor_small = 65;

	public static Block machine_controller;
	public static final int guiID_machine_controller = 78;

	public static Block machine_spp_bottom;
	public static Block machine_spp_top;

	public static Block radiobox;
	public static final int guiID_radiobox = 66;

	public static Block radiorec;
	public static final int guiID_radiorec = 69;

	public static Block machine_forcefield;
	public static final int guiID_forcefield = 75;

	public static Block machine_waste_drum;
	public static final int guiID_waste_drum = 79;
	public static Block machine_storage_drum;
	public static final int guiID_storage_drum = 118;

	public static Block turret_light;
	public static Block turret_heavy;
	public static Block turret_rocket;
	public static Block turret_flamer;
	public static Block turret_tau;
	public static Block turret_spitfire;
	public static Block turret_cwis;
	public static Block turret_cheapo;

	public static Block turret_chekhov;
	public static final int guiID_chekhov = 104;
	public static Block turret_friendly;
	public static final int guiID_friendly = 107;
	public static Block turret_jeremy;
	public static final int guiID_jeremy = 105;
	public static Block turret_tauon;
	public static final int guiID_tauon = 106;
	public static Block turret_richard;
	public static final int guiID_richard = 108;
	public static Block turret_howard;
	public static final int guiID_howard = 112;

	public static Block rbmk_rod;
	public static Block rbmk_control;
	public static Block rbmk_control_auto;
	public static Block rbmk_blank;
	public static Block rbmk_boiler;
	public static Block rbmk_reflector;
	public static Block rbmk_absorber;
	public static Block rbmk_moderator;
	public static Block rbmk_outgasser;
	public static Block rbmk_console;
	public static final int guiID_rbmk_rod = 113;
	public static final int guiID_rbmk_boiler = 114;
	public static final int guiID_rbmk_control = 115;
	public static final int guiID_rbmk_control_auto = 116;
	public static final int guiID_rbmk_console = 117;
	public static final int guiID_rbmk_outgasser = 119;
	public static Block rbmk_loader;
	public static Block pribris;
	public static Block pribris_burning;
	public static Block pribris_radiating;

	public static Block book_guide;

	public static Block rail_highspeed;
	public static Block rail_booster;
	
	public static Block statue_elb;
	public static Block statue_elb_g;
	public static Block statue_elb_w;
	public static Block statue_elb_f;

	public static Block cheater_virus;
	public static Block cheater_virus_seed;
	public static Block crystal_virus;
	public static Block crystal_hardened;
	public static Block crystal_pulsar;
	public static Block taint;
	public static Block residue;

	public static Block vent_chlorine;
	public static Block vent_cloud;
	public static Block vent_pink_cloud;
	public static Block vent_chlorine_seal;
	public static Block chlorine_gas;

	public static Block gas_radon;
	public static Block gas_radon_dense;
	public static Block gas_radon_tomb;
	public static Block gas_monoxide;
	public static Block gas_asbestos;
	public static Block gas_flammable;

	public static Block absorber;
	public static Block absorber_red;
	public static Block absorber_green;
	public static Block absorber_pink;
	public static Block decon;

	public static Block mud_block;
	public static Fluid mud_fluid;
	public static final Material fluidmud = (new MaterialLiquid(MapColor.adobeColor));

	public static Block acid_block;
	public static Fluid acid_fluid;
	public static final Material fluidacid = (new MaterialLiquid(MapColor.purpleColor));

	public static Block toxic_block;
	public static Fluid toxic_fluid;
	public static final Material fluidtoxic = (new MaterialLiquid(MapColor.greenColor));

	public static Block schrabidic_block;
	public static Fluid schrabidic_fluid;
	public static final Material fluidschrabidic = (new MaterialLiquid(MapColor.cyanColor));

	public static Block corium_block;
	public static Fluid corium_fluid;
	public static final Material fluidcorium = (new MaterialLiquid(MapColor.brownColor));

	public static Block dummy_block_igenerator;
	public static Block dummy_port_igenerator;
	public static Block dummy_block_centrifuge;
	public static Block dummy_block_cyclotron;
	public static Block dummy_port_cyclotron;
	public static Block dummy_block_well;
	public static Block dummy_port_well;
	public static Block dummy_block_flare;
	public static Block dummy_port_flare;
	public static Block dummy_block_drill;
	public static Block dummy_port_drill;
	public static Block dummy_block_assembler;
	public static Block dummy_port_assembler;
	public static Block dummy_block_chemplant;
	public static Block dummy_port_chemplant;
	public static Block dummy_block_fluidtank;
	public static Block dummy_port_fluidtank;
	public static Block dummy_block_refinery;
	public static Block dummy_port_refinery;
	public static Block dummy_block_pumpjack;
	public static Block dummy_port_pumpjack;
	public static Block dummy_block_turbofan;
	public static Block dummy_port_turbofan;
	public static Block dummy_block_ams_limiter;
	public static Block dummy_port_ams_limiter;
	public static Block dummy_block_ams_emitter;
	public static Block dummy_port_ams_emitter;
	public static Block dummy_block_ams_base;
	public static Block dummy_port_ams_base;
	public static Block dummy_block_radgen;
	public static Block dummy_port_radgen;
	public static Block dummy_block_reactor_small;
	public static Block dummy_port_reactor_small;
	public static Block dummy_block_vault;
	public static Block dummy_block_blast;
	public static Block dummy_block_gascent;
	public static Block dummy_block_uf6;
	public static Block dummy_block_puf6;
	public static Block dummy_plate_compact_launcher;
	public static Block dummy_port_compact_launcher;
	public static Block dummy_plate_launch_table;
	public static Block dummy_port_launch_table;
	public static Block dummy_plate_cargo;

	public static Block ntm_dirt;

	public static Block pink_log;
	public static Block pink_planks;
	public static Block pink_slab;
	public static Block pink_double_slab;
	public static Block pink_stairs;
	
	public static Block ff;
	
	public static Material materialGas = new MaterialGas();
	
	public static Block.SoundType soundTypeGrate = new ModSoundType("metalBlock", 0.5F, 1.0F) {

		@Override
		public String func_150496_b() {
			return Block.soundTypeMetal.func_150496_b();
		}
		
		@Override
		public String getBreakSound() {
			return "dig.stone";
		}
	};
	
	private static void initializeBlock() {
		
		test_render = new TestRender(Material.rock).setBlockName("test_render").setCreativeTab(null);
		test_container = new TestContainer(0).setBlockName("test_container").setCreativeTab(null);
		test_bomb = new TestBomb(Material.tnt).setBlockName("test_bomb").setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":test_bomb");
		test_bomb_advanced = new TestBombAdvanced(Material.tnt).setBlockName("test_bomb_advanced").setCreativeTab(null);
		test_nuke = new TestNuke(Material.iron).setBlockName("test_nuke").setCreativeTab(null).setHardness(2.5F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":test_nuke");
		event_tester = new TestEventTester(Material.iron).setBlockName("event_tester").setCreativeTab(null).setHardness(2.5F).setResistance(0.0F).setBlockTextureName(RefStrings.MODID + ":event_tester");
		rotation_tester = new TestRotationTester(Material.iron).setBlockName("rotation_tester").setCreativeTab(null).setHardness(2.5F).setResistance(10.0F);
		obj_tester = new TestObjTester(Material.iron).setBlockName("obj_tester").setCreativeTab(null).setHardness(2.5F).setResistance(10.0F);
		test_ticker = new TestTicker(Material.iron).setBlockName("test_ticker").setCreativeTab(null).setHardness(2.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":test_ticker");
		test_missile = new TestMissile(Material.iron).setBlockName("test_missile").setCreativeTab(null).setHardness(2.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":test_missile");
		test_core = new TestCore(Material.iron).setBlockName("test_core").setCreativeTab(null).setHardness(2.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":test_core");
		test_charge = new TestCharge(Material.iron).setBlockName("test_charge").setCreativeTab(null).setHardness(2.5F).setResistance(10.0F);
		
		ore_uranium = new BlockOutgas(Material.rock, true, 5, false).setBlockName("ore_uranium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_uranium");
		ore_uranium_scorched = new BlockOutgas(Material.rock, true, 5, false).setBlockName("ore_uranium_scorched").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_uranium_scorched");
		ore_titanium = new BlockGeneric(Material.rock).setBlockName("ore_titanium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_titanium");
		ore_sulfur = new BlockOre(Material.rock).setBlockName("ore_sulfur").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_sulfur");
		ore_thorium = new BlockGeneric(Material.rock).setBlockName("ore_thorium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_thorium");
		
		ore_niter = new BlockOre(Material.rock).setBlockName("ore_niter").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_niter");
		ore_copper = new BlockGeneric(Material.rock).setBlockName("ore_copper").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_copper");
		ore_tungsten = new BlockGeneric(Material.rock).setBlockName("ore_tungsten").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_tungsten");
		ore_aluminium = new BlockGeneric(Material.rock).setBlockName("ore_aluminium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_aluminium");
		ore_fluorite = new BlockOre(Material.rock).setBlockName("ore_fluorite").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_fluorite");
		ore_lead = new BlockGeneric(Material.rock).setBlockName("ore_lead").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_lead");
		ore_schrabidium = new BlockOre(Material.rock, 0.1F, 0.5F).setBlockName("ore_schrabidium").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":ore_schrabidium");
		ore_beryllium = new BlockGeneric(Material.rock).setBlockName("ore_beryllium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":ore_beryllium");
		ore_lignite = new BlockOre(Material.rock).setBlockName("ore_lignite").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":ore_lignite");
		ore_asbestos = new BlockOutgas(Material.rock, true, 5, true).setBlockName("ore_asbestos").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":ore_asbestos");
		ore_coal_oil = new BlockCoalOil(Material.rock).setBlockName("ore_coal_oil").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":ore_coal_oil");
		ore_coal_oil_burning = new BlockCoalBurning(Material.rock).setBlockName("ore_coal_oil_burning").setCreativeTab(MainRegistry.blockTab).setLightLevel(10F/15F).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":ore_coal_oil_burning");
		
		cluster_iron = new BlockCluster(Material.rock).setBlockName("cluster_iron").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":cluster_iron");
		cluster_titanium = new BlockCluster(Material.rock).setBlockName("cluster_titanium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":cluster_titanium");
		cluster_aluminium = new BlockCluster(Material.rock).setBlockName("cluster_aluminium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":cluster_aluminium");
		
		ore_nether_coal = new BlockNetherCoal(Material.rock, true, 5, true).setBlockName("ore_nether_coal").setCreativeTab(MainRegistry.blockTab).setLightLevel(10F/15F).setHardness(0.4F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_nether_coal");
		ore_nether_smoldering = new BlockSmolder(Material.rock).setBlockName("ore_nether_smoldering").setCreativeTab(MainRegistry.blockTab).setLightLevel(1F).setHardness(0.4F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_nether_smoldering");
		ore_nether_uranium = new BlockOutgas(Material.rock, true, 5, false).setBlockName("ore_nether_uranium").setCreativeTab(MainRegistry.blockTab).setHardness(0.4F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_nether_uranium");
		ore_nether_uranium_scorched = new BlockOutgas(Material.rock, true, 5, false).setBlockName("ore_nether_uranium_scorched").setCreativeTab(MainRegistry.blockTab).setHardness(0.4F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_nether_uranium_scorched");
		ore_nether_plutonium = new BlockGeneric(Material.rock).setBlockName("ore_nether_plutonium").setCreativeTab(MainRegistry.blockTab).setHardness(0.4F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_nether_plutonium");
		ore_nether_tungsten = new BlockGeneric(Material.rock).setBlockName("ore_nether_tungsten").setCreativeTab(MainRegistry.blockTab).setHardness(0.4F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_nether_tungsten");
		ore_nether_sulfur = new BlockOre(Material.rock).setBlockName("ore_nether_sulfur").setCreativeTab(MainRegistry.blockTab).setHardness(0.4F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_nether_sulfur");
		ore_nether_fire = new BlockOre(Material.rock).setBlockName("ore_nether_fire").setCreativeTab(MainRegistry.blockTab).setHardness(0.4F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_nether_fire");
		ore_nether_schrabidium = new BlockGeneric(Material.rock).setBlockName("ore_nether_schrabidium").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":ore_nether_schrabidium");

		ore_meteor_uranium = new BlockOre(Material.rock).setBlockName("ore_meteor_uranium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_uranium");
		ore_meteor_thorium = new BlockOre(Material.rock).setBlockName("ore_meteor_thorium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_thorium");
		ore_meteor_titanium = new BlockOre(Material.rock).setBlockName("ore_meteor_titanium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_titanium");
		ore_meteor_sulfur = new BlockOre(Material.rock).setBlockName("ore_meteor_sulfur").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_sulfur");
		ore_meteor_copper = new BlockOre(Material.rock).setBlockName("ore_meteor_copper").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_copper");
		ore_meteor_tungsten = new BlockOre(Material.rock).setBlockName("ore_meteor_tungsten").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_tungsten");
		ore_meteor_aluminium = new BlockOre(Material.rock).setBlockName("ore_meteor_aluminium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_aluminium");
		ore_meteor_lead = new BlockOre(Material.rock).setBlockName("ore_meteor_lead").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_lead");
		ore_meteor_lithium = new BlockOre(Material.rock).setBlockName("ore_meteor_lithium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_lithium");
		ore_meteor_starmetal = new BlockOre(Material.rock).setBlockName("ore_meteor_starmetal").setCreativeTab(MainRegistry.blockTab).setHardness(10.0F).setResistance(100.0F).setBlockTextureName(RefStrings.MODID + ":ore_meteor_starmetal");

		stone_gneiss = new BlockGeneric(Material.rock).setBlockName("stone_gneiss").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":stone_gneiss_var");
		ore_gneiss_iron = new BlockOre(Material.rock).setBlockName("ore_gneiss_iron").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_iron");
		ore_gneiss_gold = new BlockOre(Material.rock).setBlockName("ore_gneiss_gold").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_gold");
		ore_gneiss_uranium = new BlockOutgas(Material.rock, true, 5, false).setBlockName("ore_gneiss_uranium").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_uranium");
		ore_gneiss_uranium_scorched = new BlockOutgas(Material.rock, true, 5, false).setBlockName("ore_gneiss_uranium_scorched").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_uranium_scorched");
		ore_gneiss_copper = new BlockOre(Material.rock).setBlockName("ore_gneiss_copper").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_copper");
		ore_gneiss_asbestos = new BlockOutgas(Material.rock, true, 5, true).setBlockName("ore_gneiss_asbestos").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_asbestos");
		ore_gneiss_lithium = new BlockOre(Material.rock).setBlockName("ore_gneiss_lithium").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_lithium");
		ore_gneiss_schrabidium = new BlockOre(Material.rock).setBlockName("ore_gneiss_schrabidium").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_schrabidium");
		ore_gneiss_rare = new BlockOre(Material.rock).setBlockName("ore_gneiss_rare").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_rare");
		ore_gneiss_gas = new BlockOre(Material.rock).setBlockName("ore_gneiss_gas").setCreativeTab(MainRegistry.blockTab).setHardness(1.5F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_gneiss_gas");
		
		stone_depth = new BlockGeneric(Material.rock).setBlockName("stone_depth").setCreativeTab(MainRegistry.blockTab).setBlockUnbreakable().setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":stone_depth");
		ore_depth_cinnebar = new BlockOre(Material.rock).setBlockName("ore_depth_cinnebar").setCreativeTab(MainRegistry.blockTab).setBlockUnbreakable().setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_depth_cinnebar");
		ore_depth_zirconium = new BlockOre(Material.rock).setBlockName("ore_depth_zirconium").setCreativeTab(MainRegistry.blockTab).setBlockUnbreakable().setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_depth_zirconium");
		cluster_depth_iron = new BlockOre(Material.rock).setBlockName("cluster_depth_iron").setCreativeTab(MainRegistry.blockTab).setBlockUnbreakable().setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":cluster_depth_iron");
		cluster_depth_titanium = new BlockOre(Material.rock).setBlockName("cluster_depth_titanium").setCreativeTab(MainRegistry.blockTab).setBlockUnbreakable().setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":cluster_depth_titanium");
		cluster_depth_tungsten = new BlockOre(Material.rock).setBlockName("cluster_depth_tungsten").setCreativeTab(MainRegistry.blockTab).setBlockUnbreakable().setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":cluster_depth_tungsten");
		
		ore_australium = new BlockGeneric(Material.rock).setBlockName("ore_australium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_australium");
		ore_weidanium = new BlockGeneric(Material.rock).setBlockName("ore_weidanium").setCreativeTab(null).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_weidanium");
		ore_reiium = new BlockGeneric(Material.rock).setBlockName("ore_reiium").setCreativeTab(null).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_reiium");
		ore_unobtainium = new BlockGeneric(Material.rock).setBlockName("ore_unobtainium").setCreativeTab(null).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_unobtainium");
		ore_daffergon = new BlockGeneric(Material.rock).setBlockName("ore_daffergon").setCreativeTab(null).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_daffergon");
		ore_verticium = new BlockGeneric(Material.rock).setBlockName("ore_verticium").setCreativeTab(null).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_verticium");
		ore_rare = new BlockOre(Material.rock).setBlockName("ore_rare").setCreativeTab(null).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_rare");
		ore_cinnebar = new BlockOre(Material.rock).setBlockName("ore_cinnebar").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_cinnebar");

		ore_oil = new BlockOre(Material.rock).setBlockName("ore_oil").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_oil");
		ore_oil_empty = new BlockGeneric(Material.rock).setBlockName("ore_oil_empty").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_oil_empty");
		ore_oil_sand = new BlockFalling(Material.sand).setBlockName("ore_oil_sand").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeSand).setHardness(0.5F).setResistance(1.0F).setBlockTextureName(RefStrings.MODID + ":ore_oil_sand_alt");
		
		ore_tikite = new BlockGeneric(Material.rock).setBlockName("ore_tikite").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":ore_tikite_alt");
		
		block_uranium = new BlockHazard().addRadiation(ItemHazard.u * ItemHazard.block).toBlock().setBlockName("block_uranium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_uranium");
		block_u233 = new BlockHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.u233 * ItemHazard.block).toBlock().setBlockName("block_u233").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_u233");
		block_u235 = new BlockHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.u235 * ItemHazard.block).toBlock().setBlockName("block_u235").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_u235");
		block_u238 = new BlockHazard().addRadiation(ItemHazard.u238 * ItemHazard.block).toBlock().setBlockName("block_u238").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_u238");
		block_uranium_fuel = new BlockHazard().addRadiation(ItemHazard.uf * ItemHazard.block).toBlock().setBlockName("block_uranium_fuel").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_uranium_fuel");
		block_thorium = new BlockHazard().addRadiation(ItemHazard.th232 * ItemHazard.block).toBlock().setBlockName("block_thorium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_thorium");
		block_thorium_fuel = new BlockHazard().addRadiation(ItemHazard.thf * ItemHazard.block).toBlock().setBlockName("block_thorium_fuel").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_thorium_fuel");
		block_neptunium = new BlockHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.np237 * ItemHazard.block).toBlock().setBlockName("block_neptunium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_neptunium");
		block_polonium = new BlockHotHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.po210 * ItemHazard.block).toBlock().setBlockName("block_polonium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_polonium");
		block_mox_fuel = new BlockHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.mox * ItemHazard.block).toBlock().setBlockName("block_mox_fuel").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_mox_fuel");
		block_plutonium = new BlockHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.pu * ItemHazard.block).toBlock().setBlockName("block_plutonium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_plutonium");
		block_pu238 = new BlockHotHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.pu238 * ItemHazard.block).toBlock().setBlockName("block_pu238").setCreativeTab(MainRegistry.blockTab).setLightLevel(5F/15F).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_pu238");
		block_pu239 = new BlockHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.pu239 * ItemHazard.block).toBlock().setBlockName("block_pu239").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_pu239");
		block_pu240 = new BlockHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.pu240 * ItemHazard.block).toBlock().setBlockName("block_pu240").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_pu240");
		block_pu_mix = new BlockHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.purg * ItemHazard.block).toBlock().setBlockName("block_pu_mix").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_pu_mix");
		block_plutonium_fuel = new BlockHazard().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.puf * ItemHazard.block).toBlock().setBlockName("block_plutonium_fuel").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_plutonium_fuel");
		block_titanium = new BlockGeneric(Material.iron).setBlockName("block_titanium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_titanium");
		block_sulfur = new BlockGeneric(Material.iron).setBlockName("block_sulfur").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_sulfur");
		block_niter = new BlockGeneric(Material.iron).setBlockName("block_niter").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_niter");
		block_copper = new BlockGeneric(Material.iron).setBlockName("block_copper").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_copper");
		block_red_copper = new BlockGeneric(Material.iron).setBlockName("block_red_copper").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_red_copper");
		block_tungsten = new BlockGeneric(Material.iron).setBlockName("block_tungsten").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_tungsten");
		block_aluminium = new BlockGeneric(Material.iron).setBlockName("block_aluminium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_aluminium");
		block_fluorite = new BlockGeneric(Material.iron).setBlockName("block_fluorite").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_fluorite");
		block_steel = new BlockGeneric(Material.iron).setBlockName("block_steel").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_steel");
		block_lead = new BlockGeneric(Material.iron).setBlockName("block_lead").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_lead");
		block_trinitite = new BlockHazard().addRadiation(ItemHazard.trn * ItemHazard.block).toBlock().setBlockName("block_trinitite").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_trinitite");
		block_waste = new BlockNuclearWaste().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.wst * ItemHazard.block).toBlock().setBlockName("block_waste").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_waste");
		block_waste_painted = new BlockNuclearWaste().setDisplayEffect(ExtDisplayEffect.RADFOG).addRadiation(ItemHazard.wst * ItemHazard.block).toBlock().setBlockName("block_waste_painted").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_waste_painted");
		ancient_scrap = new BlockOutgas(Material.iron, true, 1, true, true).addRadiation(150F).toBlock().setBlockName("ancient_scrap").setCreativeTab(MainRegistry.blockTab).setHardness(100.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":ancient_scrap");
		block_corium = new BlockOutgas(Material.iron, true, 1, true, true).addRadiation(150F).toBlock().setBlockName("block_corium").setCreativeTab(MainRegistry.blockTab).setHardness(100.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":block_corium");
		block_scrap = new BlockFalling(Material.sand).setBlockName("block_scrap").setCreativeTab(MainRegistry.blockTab).setHardness(2.5F).setResistance(5.0F).setStepSound(Block.soundTypeGravel).setBlockTextureName(RefStrings.MODID + ":block_scrap");
		block_electrical_scrap = new BlockFalling(Material.iron).setBlockName("block_electrical_scrap").setCreativeTab(MainRegistry.blockTab).setHardness(2.5F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setBlockTextureName(RefStrings.MODID + ":electrical_scrap_alt2");
		block_beryllium = new BlockGeneric(Material.iron).setBlockName("block_beryllium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_beryllium");
		block_schraranium = new BlockHazard().setDisplayEffect(ExtDisplayEffect.SCHRAB).addRadiation(ItemHazard.sr * ItemHazard.block).addBlinding().toBlock().setBlockName("block_schraranium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_schraranium");
		block_schrabidium = new BlockHazard().setDisplayEffect(ExtDisplayEffect.SCHRAB).addRadiation(ItemHazard.sa326 * ItemHazard.block).addBlinding().toBlock().setBlockName("block_schrabidium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_schrabidium");
		block_schrabidate = new BlockHazard().setDisplayEffect(ExtDisplayEffect.SCHRAB).addRadiation(ItemHazard.sa326 * ItemHazard.block).addBlinding().toBlock().setBlockName("block_schrabidate").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_schrabidate");
		block_solinium = new BlockHazard().setDisplayEffect(ExtDisplayEffect.SCHRAB).addRadiation(ItemHazard.sa327 * ItemHazard.block).toBlock().setBlockName("block_solinium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_solinium");
		block_schrabidium_fuel = new BlockHazard().setDisplayEffect(ExtDisplayEffect.SCHRAB).addRadiation(ItemHazard.saf * ItemHazard.block).toBlock().setBlockName("block_schrabidium_fuel").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_schrabidium_fuel");
		block_euphemium = new BlockGeneric(Material.iron).setBlockName("block_euphemium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(60000.0F).setBlockTextureName(RefStrings.MODID + ":block_euphemium");
		block_dineutronium = new BlockGeneric(Material.iron).setBlockName("block_dineutronium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(60000.0F).setBlockTextureName(RefStrings.MODID + ":block_dineutronium");
		block_schrabidium_cluster = new BlockRotatablePillar(Material.rock, RefStrings.MODID + ":block_schrabidium_cluster_top").setBlockName("block_schrabidium_cluster").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(60000.0F).setBlockTextureName(RefStrings.MODID + ":block_schrabidium_cluster_side");
		block_euphemium_cluster = new BlockRotatablePillar(Material.rock, RefStrings.MODID + ":block_euphemium_cluster_top").setBlockName("block_euphemium_cluster").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(60000.0F).setBlockTextureName(RefStrings.MODID + ":block_euphemium_cluster_side");
		block_advanced_alloy = new BlockGeneric(Material.iron).setBlockName("block_advanced_alloy").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_advanced_alloy");
		block_magnetized_tungsten = new BlockGeneric(Material.iron).setBlockName("block_magnetized_tungsten").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(35.0F).setBlockTextureName(RefStrings.MODID + ":block_magnetized_tungsten");
		block_combine_steel = new BlockGeneric(Material.iron).setBlockName("block_combine_steel").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_combine_steel");
		block_desh = new BlockGeneric(Material.iron).setBlockName("block_desh").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_desh");
		block_dura_steel = new BlockGeneric(Material.iron).setBlockName("block_dura_steel").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_dura_steel");
		block_starmetal = new BlockGeneric(Material.iron).setBlockName("block_starmetal").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_starmetal");
		block_yellowcake = new BlockHazardFalling().addRadiation(ItemHazard.yc * ItemHazard.block).toBlock().setBlockName("block_yellowcake").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeSand).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":block_yellowcake");
		block_insulator = new BlockRotatablePillar(Material.cloth, RefStrings.MODID + ":block_insulator_top").setBlockName("block_insulator").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeCloth).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_insulator_side");
		block_fiberglass = new BlockRotatablePillar(Material.cloth, RefStrings.MODID + ":block_fiberglass_top").setBlockName("block_fiberglass").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeCloth).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_fiberglass_side");
		block_asbestos = new BlockOutgas(Material.cloth, true, 5, true).addAsbestos().toBlock().setBlockName("block_asbestos").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeCloth).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_asbestos");
		block_cobalt = new BlockGeneric(Material.iron).setBlockName("block_cobalt").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_cobalt");
		block_lithium = new BlockLithium(Material.iron).addHydroReactivity().toBlock().setBlockName("block_lithium").setStepSound(Block.soundTypeMetal).setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_lithium");
		block_zirconium = new BlockGeneric(Material.iron).setBlockName("block_zirconium").setStepSound(Block.soundTypeMetal).setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_zirconium");
		block_white_phosphorus = new BlockHazard(Material.rock).addFire(15).toBlock().setBlockName("block_white_phosphorus").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_white_phosphorus");
		block_red_phosphorus = new BlockHazardFalling().addFire(15).toBlock().setStepSound(Block.soundTypeSand).setBlockName("block_red_phosphorus").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_red_phosphorus");
		block_fallout = new BlockHazardFalling().addRadiation(ItemHazard.fo * ItemHazard.block).toBlock().setStepSound(Block.soundTypeGravel).setBlockName("block_fallout").setCreativeTab(MainRegistry.blockTab).setHardness(0.2F).setBlockTextureName(RefStrings.MODID + ":ash");
		block_foam = new BlockGeneric(Material.craftedSnow).setBlockName("block_foam").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeSnow).setHardness(0.5F).setResistance(0.0F).setBlockTextureName(RefStrings.MODID + ":foam");
		block_graphite = new BlockFlammable(Material.iron, 30, 5).setBlockName("block_graphite").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_graphite");
		block_boron = new BlockGeneric(Material.iron).setBlockName("block_boron").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_boron");
		block_lanthanium = new BlockGeneric(Material.iron).setBlockName("block_lanthanium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_lanthanium");
		block_actinium = new BlockGeneric(Material.iron).setBlockName("block_actinium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_actinium");
		block_tritium = new BlockRotatablePillar(Material.glass, RefStrings.MODID + ":block_tritium_top").setBlockName("block_tritium").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeGlass).setHardness(3.0F).setResistance(2.0F).setBlockTextureName(RefStrings.MODID + ":block_tritium_side");

		block_australium = new BlockGeneric(Material.iron).setBlockName("block_australium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_australium");
		block_weidanium = new BlockGeneric(Material.iron).setBlockName("block_weidanium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_weidanium");
		block_reiium = new BlockGeneric(Material.iron).setBlockName("block_reiium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_reiium");
		block_unobtainium = new BlockGeneric(Material.iron).setBlockName("block_unobtainium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_unobtainium");
		block_daffergon = new BlockGeneric(Material.iron).setBlockName("block_daffergon").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_daffergon");
		block_verticium = new BlockGeneric(Material.iron).setBlockName("block_verticium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":block_verticium");

		block_cap_nuka = new BlockCap(Material.iron, RefStrings.MODID + ":block_cap_nuka_top").setStepSound(Block.soundTypeMetal).setBlockName("block_cap_nuka").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":block_cap_nuka");
		block_cap_quantum = new BlockCap(Material.iron, RefStrings.MODID + ":block_cap_quantum_top").setStepSound(Block.soundTypeMetal).setBlockName("block_cap_quantum").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":block_cap_quantum");
		block_cap_rad = new BlockCap(Material.iron, RefStrings.MODID + ":block_cap_rad_top").setStepSound(Block.soundTypeMetal).setBlockName("block_cap_rad").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":block_cap_rad");
		block_cap_sparkle = new BlockCap(Material.iron, RefStrings.MODID + ":block_cap_sparkle_top").setStepSound(Block.soundTypeMetal).setBlockName("block_cap_sparkle").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":block_cap_sparkle");
		block_cap_korl = new BlockCap(Material.iron, RefStrings.MODID + ":block_cap_korl_top").setStepSound(Block.soundTypeMetal).setBlockName("block_cap_korl").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":block_cap_korl");
		block_cap_fritz = new BlockCap(Material.iron, RefStrings.MODID + ":block_cap_fritz_top").setStepSound(Block.soundTypeMetal).setBlockName("block_cap_fritz").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":block_cap_fritz");
		block_cap_sunset = new BlockCap(Material.iron, RefStrings.MODID + ":block_cap_sunset_top").setStepSound(Block.soundTypeMetal).setBlockName("block_cap_sunset").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":block_cap_sunset");
		block_cap_star = new BlockCap(Material.iron, RefStrings.MODID + ":block_cap_star_top").setStepSound(Block.soundTypeMetal).setBlockName("block_cap_star").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":block_cap_star");
		
		deco_titanium = new BlockOre(Material.iron).setBlockName("deco_titanium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":deco_titanium");
		deco_red_copper = new BlockOre(Material.iron).setBlockName("deco_red_copper").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":deco_red_copper");
		deco_tungsten = new BlockOre(Material.iron).setBlockName("deco_tungsten").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":deco_tungsten");
		deco_aluminium = new BlockOre(Material.iron).setBlockName("deco_aluminium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":deco_aluminium");
		deco_steel = new BlockOre(Material.iron).setBlockName("deco_steel").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":deco_steel");
		deco_lead = new BlockOre(Material.iron).setBlockName("deco_lead").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":deco_lead");
		deco_beryllium = new BlockOre(Material.iron).setBlockName("deco_beryllium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":deco_beryllium");
		deco_asbestos = new BlockOutgas(Material.cloth, true, 5, true).setBlockName("deco_asbestos").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":deco_asbestos");
		
		hazmat = new BlockGeneric(Material.cloth).setBlockName("hazmat").setStepSound(Block.soundTypeCloth).setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(100.0F).setBlockTextureName(RefStrings.MODID + ":hazmat");
		
		gravel_obsidian = new BlockFalling(Material.iron).setBlockName("gravel_obsidian").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeGravel).setHardness(5.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":gravel_obsidian");
		gravel_diamond = new BlockFalling(Material.sand).setBlockName("gravel_diamond").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeGravel).setHardness(0.6F).setBlockTextureName(RefStrings.MODID + ":gravel_diamond");
		asphalt = new BlockSpeedy(Material.rock, 1.15).setBlockName("asphalt").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(100.0F).setBlockTextureName(RefStrings.MODID + ":asphalt");
		asphalt_light = new BlockSpeedy(Material.rock, 1.15).setBlockName("asphalt_light").setCreativeTab(MainRegistry.blockTab).setLightLevel(1F).setHardness(15.0F).setResistance(100.0F).setBlockTextureName(RefStrings.MODID + ":asphalt_light");

		reinforced_brick = new BlockGeneric(Material.rock).setBlockName("reinforced_brick").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(8000.0F).setBlockTextureName(RefStrings.MODID + ":reinforced_brick");
		reinforced_glass = new BlockNTMGlass(0, RefStrings.MODID + ":reinforced_glass", Material.rock).setBlockName("reinforced_glass").setCreativeTab(MainRegistry.blockTab).setLightOpacity(0).setHardness(15.0F).setResistance(200.0F);
		reinforced_light = new BlockGeneric(Material.rock).setBlockName("reinforced_light").setCreativeTab(MainRegistry.blockTab).setLightLevel(1.0F).setHardness(15.0F).setResistance(300.0F).setBlockTextureName(RefStrings.MODID + ":reinforced_light");
		reinforced_sand = new BlockGeneric(Material.rock).setBlockName("reinforced_sand").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(400.0F).setBlockTextureName(RefStrings.MODID + ":reinforced_sand");
		reinforced_lamp_off = new ReinforcedLamp(Material.rock, false).setBlockName("reinforced_lamp_off").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(300.0F).setBlockTextureName(RefStrings.MODID + ":reinforced_lamp_off");
		reinforced_lamp_on = new ReinforcedLamp(Material.rock, true).setBlockName("reinforced_lamp_on").setHardness(15.0F).setResistance(300.0F).setBlockTextureName(RefStrings.MODID + ":reinforced_lamp_on");

		lamp_tritium_green_off = new ReinforcedLamp(Material.redstoneLight, false).setBlockName("lamp_tritium_green_off").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(3.0F).setBlockTextureName(RefStrings.MODID + ":lamp_tritium_green_off");
		lamp_tritium_green_on = new ReinforcedLamp(Material.redstoneLight, true).setBlockName("lamp_tritium_green_on").setStepSound(Block.soundTypeGlass).setHardness(3.0F).setBlockTextureName(RefStrings.MODID + ":lamp_tritium_green_on");
		lamp_tritium_blue_off = new ReinforcedLamp(Material.redstoneLight, false).setBlockName("lamp_tritium_blue_off").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(3.0F).setBlockTextureName(RefStrings.MODID + ":lamp_tritium_blue_off");
		lamp_tritium_blue_on = new ReinforcedLamp(Material.redstoneLight, true).setBlockName("lamp_tritium_blue_on").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(3.0F).setBlockTextureName(RefStrings.MODID + ":lamp_tritium_blue_on");
		
		lamp_demon = new DemonLamp().addRadiation(100000F).addFire(25).toBlock().setBlockName("lamp_demon").setStepSound(Block.soundTypeMetal).setCreativeTab(MainRegistry.blockTab).setLightLevel(1F).setHardness(3.0F).setBlockTextureName(RefStrings.MODID + ":lamp_demon");

		reinforced_stone = new BlockGeneric(Material.rock).setBlockName("reinforced_stone").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(3000.0F).setBlockTextureName(RefStrings.MODID + ":reinforced_stone");
		concrete_smooth = new BlockGeneric(Material.rock).setBlockName("concrete_smooth").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(4000.0F).setBlockTextureName(RefStrings.MODID + ":concrete");
		concrete_colored = new BlockConcreteColored(Material.rock).setBlockName("concrete_colored").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(4000.0F).setBlockTextureName(RefStrings.MODID + ":concrete");
		concrete = new BlockGeneric(Material.rock).setBlockName("concrete").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(4000.0F).setBlockTextureName(RefStrings.MODID + ":concrete_tile");
		concrete_asbestos = new BlockGeneric(Material.rock).setBlockName("concrete_asbestos").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(4000.0F).setBlockTextureName(RefStrings.MODID + ":concrete_asbestos");
		concrete_pillar = new BlockRotatablePillar(Material.rock, RefStrings.MODID + ":concrete_pillar_top").setBlockName("concrete_pillar").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(4000.0F).setBlockTextureName(RefStrings.MODID + ":concrete_pillar_side");
		brick_concrete = new BlockGeneric(Material.rock).setBlockName("brick_concrete").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":brick_concrete");
		brick_concrete_mossy = new BlockGeneric(Material.rock).setBlockName("brick_concrete_mossy").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":brick_concrete_mossy");
		brick_concrete_cracked = new BlockGeneric(Material.rock).setBlockName("brick_concrete_cracked").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(2000.0F).setBlockTextureName(RefStrings.MODID + ":brick_concrete_cracked");
		brick_concrete_broken = new BlockGeneric(Material.rock).setBlockName("brick_concrete_broken").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(1500.0F).setBlockTextureName(RefStrings.MODID + ":brick_concrete_broken");
		brick_concrete_marked = new BlockWriting(Material.rock, RefStrings.MODID + ":brick_concrete").setBlockName("brick_concrete_marked").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(1500.0F).setBlockTextureName(RefStrings.MODID + ":brick_concrete_marked");
		brick_obsidian = new BlockGeneric(Material.rock).setBlockName("brick_obsidian").setCreativeTab(MainRegistry.blockTab).setLightOpacity(15).setHardness(15.0F).setResistance(8000.0F).setBlockTextureName(RefStrings.MODID + ":brick_obsidian");
		brick_light = new BlockGeneric(Material.rock).setBlockName("brick_light").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(1000.0F).setBlockTextureName(RefStrings.MODID + ":brick_light");
		brick_compound = new BlockGeneric(Material.rock).setBlockName("brick_compound").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(10000.0F).setBlockTextureName(RefStrings.MODID + ":brick_compound");
		cmb_brick = new BlockGeneric(Material.rock).setBlockName("cmb_brick").setCreativeTab(MainRegistry.blockTab).setHardness(25.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":cmb_brick");
		cmb_brick_reinforced = new BlockGeneric(Material.rock).setBlockName("cmb_brick_reinforced").setCreativeTab(MainRegistry.blockTab).setHardness(25.0F).setResistance(60000.0F).setBlockTextureName(RefStrings.MODID + ":cmb_brick_reinforced");
		brick_asbestos = new BlockOutgas(Material.rock, true, 5, true).addAsbestos().toBlock().setBlockName("brick_asbestos").setCreativeTab(MainRegistry.blockTab).setResistance(1000.0F).setBlockTextureName(RefStrings.MODID + ":brick_asbestos");
		
		tile_lab = new BlockOutgas(Material.rock, false, 5, true).setBlockName("tile_lab").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(1.0F).setResistance(20.0F).setBlockTextureName(RefStrings.MODID + ":tile_lab");
		tile_lab_cracked = new BlockOutgas(Material.rock, false, 5, true).setBlockName("tile_lab_cracked").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(1.0F).setResistance(20.0F).setBlockTextureName(RefStrings.MODID + ":tile_lab_cracked");
		tile_lab_broken = new BlockOutgas(Material.rock, true, 5, true).addAsbestos().toBlock().setBlockName("tile_lab_broken").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(1.0F).setResistance(20.0F).setBlockTextureName(RefStrings.MODID + ":tile_lab_broken");

		block_meteor = new BlockOre(Material.rock).setBlockName("block_meteor").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor");
		block_meteor_cobble = new BlockOre(Material.rock).setBlockName("block_meteor_cobble").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_cobble");
		block_meteor_broken = new BlockOre(Material.rock).setBlockName("block_meteor_broken").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_crushed");
		block_meteor_molten = new BlockOre(Material.rock, true).setBlockName("block_meteor_molten").setLightLevel(0.75F).setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_cobble_molten");
		block_meteor_treasure = new BlockOre(Material.rock).setBlockName("block_meteor_treasure").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_treasure");
		meteor_polished = new BlockGeneric(Material.rock).setBlockName("meteor_polished").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_polished");
		meteor_brick = new BlockGeneric(Material.rock).setBlockName("meteor_brick").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_brick");
		meteor_brick_mossy = new BlockGeneric(Material.rock).setBlockName("meteor_brick_mossy").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_brick_mossy");
		meteor_brick_cracked = new BlockGeneric(Material.rock).setBlockName("meteor_brick_cracked").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_brick_cracked");
		meteor_brick_chiseled = new BlockGeneric(Material.rock).setBlockName("meteor_brick_chiseled").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_brick_chiseled");
		meteor_pillar = new BlockRotatablePillar(Material.rock, RefStrings.MODID + ":meteor_pillar_top").setBlockName("meteor_pillar").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_pillar");
		meteor_spawner = new BlockCybercrab(Material.rock).setBlockName("meteor_spawner").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F);
		meteor_battery = new BlockPillar(Material.rock, RefStrings.MODID + ":meteor_power").setBlockName("meteor_battery").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":meteor_spawner_side");

		brick_jungle = new BlockGeneric(Material.rock).setBlockName("brick_jungle").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":brick_jungle");
		brick_jungle_cracked = new BlockGeneric(Material.rock).setBlockName("brick_jungle_cracked").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":brick_jungle_cracked");
		brick_jungle_fragile = new FragileBrick(Material.rock).setBlockName("brick_jungle_fragile").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":brick_jungle_fragile");
		brick_jungle_lava = new BlockGeneric(Material.rock).setBlockName("brick_jungle_lava").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setLightLevel(5F/15F).setBlockTextureName(RefStrings.MODID + ":brick_jungle_lava");
		brick_jungle_ooze = new BlockOre(Material.rock).setBlockName("brick_jungle_ooze").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setLightLevel(5F/15F).setBlockTextureName(RefStrings.MODID + ":brick_jungle_ooze");
		brick_jungle_mystic = new BlockOre(Material.rock).setBlockName("brick_jungle_mystic").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setLightLevel(5F/15F).setBlockTextureName(RefStrings.MODID + ":brick_jungle_mystic");
		brick_jungle_trap = new TrappedBrick(Material.rock).setBlockName("brick_jungle_trap").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":brick_jungle_trap");
		brick_jungle_glyph = new BlockGlyph(Material.rock).setBlockName("brick_jungle_glyph").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F);
		brick_jungle_circle = new BlockBallsSpawner(Material.rock).setBlockName("brick_jungle_circle").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":brick_jungle_circle");

		brick_dungeon = new BlockGeneric(Material.rock).setBlockName("brick_dungeon").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":brick_dungeon");
		brick_dungeon_flat = new BlockGeneric(Material.rock).setBlockName("brick_dungeon_flat").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":brick_dungeon_flat");
		brick_dungeon_tile = new BlockGeneric(Material.rock).setBlockName("brick_dungeon_tile").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":brick_dungeon_tile");
		brick_dungeon_circle = new BlockGeneric(Material.rock).setBlockName("brick_dungeon_circle").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(900.0F).setBlockTextureName(RefStrings.MODID + ":brick_dungeon_circle");

		tape_recorder = new DecoTapeRecorder(Material.iron).setBlockName("tape_recorder").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":deco_tape_recorder");
		steel_poles = new DecoSteelPoles(Material.iron).setBlockName("steel_poles").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":steel_beam");
		pole_top = new DecoPoleTop(Material.iron).setBlockName("pole_top").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":deco_pole_top");
		pole_satellite_receiver = new DecoPoleSatelliteReceiver(Material.iron).setBlockName("pole_satellite_receiver").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":deco_satellite_receiver");
		steel_wall = new DecoBlock(Material.iron).setBlockName("steel_wall").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":steel_wall");
		steel_corner = new DecoBlock(Material.iron).setBlockName("steel_corner").setCreativeTab(MainRegistry.blockTab).setHardness(15.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":steel_corner");
		steel_roof = new DecoBlock(Material.iron).setBlockName("steel_roof").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":steel_roof");
		steel_beam = new DecoBlock(Material.iron).setBlockName("steel_beam").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":steel_beam");
		steel_scaffold = new DecoBlock(Material.iron).setBlockName("steel_scaffold").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":deco_steel");
		steel_grate = new BlockGrate(Material.iron).setBlockName("steel_grate").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F);
		
		deco_pipe = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side", 0).setBlockName("deco_pipe").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top");
		deco_pipe_rusted = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_rusty", 0).setBlockName("deco_pipe_rusted").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_rusty");
		deco_pipe_green = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_green", 0).setBlockName("deco_pipe_green").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_green");
		deco_pipe_green_rusted = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_green_rusty", 0).setBlockName("deco_pipe_green_rusted").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_green_rusty");
		deco_pipe_red = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_red", 0).setBlockName("deco_pipe_red").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_red");
		deco_pipe_marked = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_marked", 0).setBlockName("deco_pipe_marked").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_marked");
		deco_pipe_rim = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side", 1).setBlockName("deco_pipe_rim").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top");
		deco_pipe_rim_rusted = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_rusty", 1).setBlockName("deco_pipe_rim_rusted").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_rusty");
		deco_pipe_rim_green = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_green", 1).setBlockName("deco_pipe_rim_green").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_green");
		deco_pipe_rim_green_rusted = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_green_rusty", 1).setBlockName("deco_pipe_rim_green_rusted").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_green_rusty");
		deco_pipe_rim_red = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_red", 1).setBlockName("deco_pipe_rim_red").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_red");
		deco_pipe_rim_marked = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_marked", 1).setBlockName("deco_pipe_rim_marked").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_marked");
		deco_pipe_framed = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side", 3).setBlockName("deco_pipe_framed").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top");
		deco_pipe_framed_rusted = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_rusty", 3).setBlockName("deco_pipe_framed_rusted").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_rusty");
		deco_pipe_framed_green = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_green", 3).setBlockName("deco_pipe_framed_green").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_green");
		deco_pipe_framed_green_rusted = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_green_rusty", 3).setBlockName("deco_pipe_framed_green_rusted").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_green_rusty");
		deco_pipe_framed_red = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_red", 3).setBlockName("deco_pipe_framed_red").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_red");
		deco_pipe_framed_marked = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_marked", 3).setBlockName("deco_pipe_framed_marked").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_marked");
		deco_pipe_quad = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side", 2).setBlockName("deco_pipe_quad").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top");
		deco_pipe_quad_rusted = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_rusty", 2).setBlockName("deco_pipe_quad_rusted").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_rusty");
		deco_pipe_quad_green = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_green", 2).setBlockName("deco_pipe_quad_green").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_green");
		deco_pipe_quad_green_rusted = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_green_rusty", 2).setBlockName("deco_pipe_quad_green_rusted").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_green_rusty");
		deco_pipe_quad_red = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_red", 2).setBlockName("deco_pipe_quad_red").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_red");
		deco_pipe_quad_marked = new BlockPipe(Material.iron, RefStrings.MODID + ":pipe_side_marked", 2).setBlockName("deco_pipe_quad_marked").setStepSound(soundTypeGrate).setCreativeTab(MainRegistry.blockTab).setHardness(2.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":pipe_top_marked");
		
		broadcaster_pc = new PinkCloudBroadcaster(Material.iron).setBlockName("broadcaster_pc").setCreativeTab(MainRegistry.machineTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(RefStrings.MODID + ":broadcaster_pc");
		geiger = new GeigerCounter(Material.iron).setBlockName("geiger").setCreativeTab(MainRegistry.machineTab).setHardness(15.0F).setResistance(0.25F).setBlockTextureName(RefStrings.MODID + ":geiger");
		hev_battery = new HEVBattery(Material.iron).setBlockName("hev_battery").setCreativeTab(MainRegistry.machineTab).setLightLevel(10F/15F).setHardness(0.5F).setResistance(0.25F).setBlockTextureName(RefStrings.MODID + ":hev_battery");
		
		fence_metal = new BlockMetalFence(Material.iron).setBlockName("fence_metal").setCreativeTab(MainRegistry.machineTab).setHardness(15.0F).setResistance(0.25F).setBlockTextureName(RefStrings.MODID + ":fence_metal");
		
		sand_boron = new BlockFalling(Material.sand).setBlockName("sand_boron").setStepSound(Block.soundTypeSand).setCreativeTab(MainRegistry.machineTab).setHardness(0.5F).setBlockTextureName(RefStrings.MODID + ":sand_boron");
		sand_uranium = new BlockFalling(Material.sand).setBlockName("sand_uranium").setStepSound(Block.soundTypeSand).setCreativeTab(MainRegistry.machineTab).setHardness(0.5F).setBlockTextureName(RefStrings.MODID + ":sand_uranium");
		sand_polonium = new BlockFalling(Material.sand).setBlockName("sand_polonium").setStepSound(Block.soundTypeSand).setCreativeTab(MainRegistry.machineTab).setHardness(0.5F).setBlockTextureName(RefStrings.MODID + ":sand_polonium");
		glass_boron = new BlockNTMGlass(0, RefStrings.MODID + ":glass_boron", Material.glass).setBlockName("glass_boron").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.machineTab).setHardness(0.3F);
		glass_uranium = new BlockNTMGlass(1, RefStrings.MODID + ":glass_uranium", Material.glass).setBlockName("glass_uranium").setLightLevel(5F/15F).setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.machineTab).setHardness(0.3F);
		glass_trinitite = new BlockNTMGlass(1, RefStrings.MODID + ":glass_trinitite", Material.glass).setBlockName("glass_trinitite").setLightLevel(5F/15F).setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.machineTab).setHardness(0.3F);
		glass_polonium = new BlockNTMGlass(1, RefStrings.MODID + ":glass_polonium", Material.glass).setBlockName("glass_polonium").setLightLevel(5F/15F).setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.machineTab).setHardness(0.3F);

		mush = new BlockMush(Material.plants).setBlockName("mush").setCreativeTab(MainRegistry.blockTab).setLightLevel(0.5F).setStepSound(Block.soundTypeGrass).setBlockTextureName(RefStrings.MODID + ":mush");
		mush_block = new BlockMushHuge(Material.plants).setBlockName("mush_block").setLightLevel(1.0F).setStepSound(Block.soundTypeGrass).setHardness(0.2F).setBlockTextureName(RefStrings.MODID + ":mush_block_skin");
		mush_block_stem = new BlockMushHuge(Material.plants).setBlockName("mush_block_stem").setLightLevel(1.0F).setStepSound(Block.soundTypeGrass).setHardness(0.2F).setBlockTextureName(RefStrings.MODID + ":mush_block_stem");

		waste_earth = new WasteEarth(Material.ground, false).setBlockName("waste_earth").setStepSound(Block.soundTypeGrass).setCreativeTab(MainRegistry.blockTab).setHardness(0.6F).setBlockTextureName(RefStrings.MODID + ":waste_earth");
		waste_mycelium = new WasteEarth(Material.ground, true).setBlockName("waste_mycelium").setStepSound(Block.soundTypeGrass).setLightLevel(1F).setCreativeTab(MainRegistry.blockTab).setHardness(0.6F).setBlockTextureName(RefStrings.MODID + ":waste_mycelium_side");
		waste_trinitite = new BlockOre(Material.sand).setBlockName("waste_trinitite").setStepSound(Block.soundTypeSand).setCreativeTab(MainRegistry.blockTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":waste_trinitite");
		waste_trinitite_red = new BlockOre(Material.sand).setBlockName("waste_trinitite_red").setStepSound(Block.soundTypeSand).setCreativeTab(MainRegistry.blockTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":waste_trinitite_red");
		waste_log = new WasteLog(Material.wood).setBlockName("waste_log").setStepSound(Block.soundTypeWood).setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(2.5F);
		waste_planks = new BlockOre(Material.wood).setBlockName("waste_planks").setStepSound(Block.soundTypeWood).setCreativeTab(MainRegistry.blockTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":waste_planks");
		frozen_dirt = new BlockOre(Material.ground).setBlockName("frozen_dirt").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":frozen_dirt");
		frozen_grass = new WasteEarth(Material.ground, false).setBlockName("frozen_grass").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(0.5F).setResistance(2.5F);
		frozen_log = new WasteLog(Material.wood).setBlockName("frozen_log").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(0.5F).setResistance(2.5F);
		frozen_planks = new BlockOre(Material.wood).setBlockName("frozen_planks").setStepSound(Block.soundTypeGlass).setCreativeTab(MainRegistry.blockTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":frozen_planks");
		fallout = new BlockFallout(Material.snow).addRadiation(ItemHazard.fo * ItemHazard.powder * 2).toBlock().setBlockName("fallout").setStepSound(Block.soundTypeGravel).setCreativeTab(MainRegistry.blockTab).setHardness(0.1F).setLightOpacity(0).setBlockTextureName(RefStrings.MODID + ":ash");
		foam_layer = new BlockLayering(Material.snow).setBlockName("foam_layer").setStepSound(Block.soundTypeSnow).setCreativeTab(MainRegistry.blockTab).setHardness(0.1F).setLightOpacity(0).setBlockTextureName(RefStrings.MODID + ":foam");
		sand_boron_layer = new BlockLayering(Material.sand).setBlockName("sand_boron_layer").setStepSound(Block.soundTypeSand).setCreativeTab(MainRegistry.blockTab).setHardness(0.1F).setLightOpacity(0).setBlockTextureName(RefStrings.MODID + ":sand_boron");

		sellafield_slaked = new BlockGeneric(Material.rock).setBlockName("sellafield_slaked").setStepSound(Block.soundTypeStone).setHardness(5.0F).setBlockTextureName(RefStrings.MODID + ":sellafield_slaked");
		sellafield_0 = new BlockOre(Material.rock, 0.5F, 10F).setBlockName("sellafield_0").setStepSound(Block.soundTypeStone).setHardness(5.0F).setBlockTextureName(RefStrings.MODID + ":sellafield_0");
		sellafield_1 = new BlockOre(Material.rock, 1F, 15F).setBlockName("sellafield_1").setStepSound(Block.soundTypeStone).setHardness(5.0F).setBlockTextureName(RefStrings.MODID + ":sellafield_1");
		sellafield_2 = new BlockOre(Material.rock, 2.5F, 25F).setBlockName("sellafield_2").setStepSound(Block.soundTypeStone).setHardness(5.0F).setBlockTextureName(RefStrings.MODID + ":sellafield_2");
		sellafield_3 = new BlockOre(Material.rock, 4F, 40F).setBlockName("sellafield_3").setStepSound(Block.soundTypeStone).setHardness(5.0F).setBlockTextureName(RefStrings.MODID + ":sellafield_3");
		sellafield_4 = new BlockOre(Material.rock, 5, 50F).setBlockName("sellafield_4").setStepSound(Block.soundTypeStone).setHardness(5.0F).setBlockTextureName(RefStrings.MODID + ":sellafield_4");
		sellafield_core = new BlockOre(Material.rock, 10F, 150F).setBlockName("sellafield_core").setStepSound(Block.soundTypeStone).setHardness(10.0F).setBlockTextureName(RefStrings.MODID + ":sellafield_core");

		geysir_water = new BlockGeysir(Material.rock).setBlockName("geysir_water").setStepSound(Block.soundTypeStone).setHardness(5.0F);
		geysir_chlorine = new BlockGeysir(Material.rock).setBlockName("geysir_chlorine").setStepSound(Block.soundTypeStone).setHardness(5.0F);
		geysir_vapor = new BlockGeysir(Material.rock).setBlockName("geysir_vapor").setStepSound(Block.soundTypeStone).setHardness(5.0F);
		geysir_nether = new BlockGeysir(Material.rock).setBlockName("geysir_nether").setLightLevel(1.0F).setStepSound(Block.soundTypeStone).setHardness(2.0F);
		
		nuke_gadget = new NukeGadget(Material.iron).setBlockName("nuke_gadget").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":theGadget");
		nuke_boy = new NukeBoy(Material.iron).setBlockName("nuke_boy").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":lilBoy");
		nuke_man = new NukeMan(Material.iron).setBlockName("nuke_man").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":fatMan");
		nuke_mike = new NukeMike(Material.iron).setBlockName("nuke_mike").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":ivyMike");
		nuke_tsar = new NukeTsar(Material.iron).setBlockName("nuke_tsar").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":tsarBomba");
		nuke_fleija = new NukeFleija(Material.iron).setBlockName("nuke_fleija").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":fleija");
		nuke_prototype = new NukePrototype(Material.iron).setBlockName("nuke_prototype").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":prototype");
		nuke_custom = new NukeCustom(Material.iron).setBlockName("nuke_custom").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":custom");
		nuke_solinium = new NukeSolinium(Material.iron).setBlockName("nuke_solinium").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":nuke_solinium");
		nuke_n2 = new NukeN2(Material.iron).setBlockName("nuke_n2").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":nuke_n2");
		nuke_n45 = new NukeN45(Material.iron).setBlockName("nuke_n45").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":code");
		nuke_fstbmb = new NukeBalefire(Material.iron, guiID_nuke_fstbmb).addDigamma(0.01F).toBlock().setBlockName("nuke_fstbmb").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":nuke_fstbmb");
		
		cel_prime = new CelPrime(Material.iron).setBlockName("cel_prime").setCreativeTab(null).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":code");
		cel_prime_terminal = new CelPrimePart(Material.iron).setBlockName("cel_prime_terminal").setCreativeTab(null).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":code");
		cel_prime_battery = new CelPrimePart(Material.iron).setBlockName("cel_prime_battery").setCreativeTab(null).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":code");
		cel_prime_port = new CelPrimePart(Material.iron).setBlockName("cel_prime_port").setCreativeTab(null).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":code");
		cel_prime_tanks = new CelPrimePart(Material.iron).setBlockName("cel_prime_tanks").setCreativeTab(null).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":code");

		bomb_multi = new BombMulti(Material.iron).setBlockName("bomb_multi").setCreativeTab(MainRegistry.nukeTab).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":bomb_multi1");
		//bomb_multi_large = new BombMultiLarge(Material.iron).setBlockName("bomb_multi_large").setCreativeTab(MainRegistry.tabNuke).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":bomb_multi_large");
		
		flame_war = new BombFlameWar(Material.iron).setBlockName("flame_war").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":flame_war");
		float_bomb = new BombFloat(Material.iron).setBlockName("float_bomb").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F);
		therm_endo = new BombThermo(Material.iron).setBlockName("therm_endo").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F);
		therm_exo = new BombThermo(Material.iron).setBlockName("therm_exo").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F);
		emp_bomb = new BombFloat(Material.iron).setBlockName("emp_bomb").setCreativeTab(MainRegistry.nukeTab).setHardness(5.0F).setResistance(6000.0F);
		det_cord = new DetCord(Material.iron).setBlockName("det_cord").setCreativeTab(MainRegistry.nukeTab).setHardness(0.1F).setResistance(0.0F).setBlockTextureName(RefStrings.MODID + ":det_cord");
		det_charge = new DetCord(Material.iron).setBlockName("det_charge").setCreativeTab(MainRegistry.nukeTab).setHardness(0.1F).setResistance(0.0F).setBlockTextureName(RefStrings.MODID + ":det_charge");
		det_nuke = new DetCord(Material.iron).setBlockName("det_nuke").setCreativeTab(MainRegistry.nukeTab).setHardness(0.1F).setResistance(0.0F).setBlockTextureName(RefStrings.MODID + ":det_nuke");
		det_miner = new DetMiner(Material.iron, RefStrings.MODID + ":det_miner_top").setBlockName("det_miner").setCreativeTab(MainRegistry.nukeTab).setHardness(0.1F).setResistance(0.0F).setBlockTextureName(RefStrings.MODID + ":det_miner_side");
		red_barrel = new RedBarrel(Material.iron).setBlockName("red_barrel").setCreativeTab(MainRegistry.nukeTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":barrel_red");
		pink_barrel = new RedBarrel(Material.iron).setBlockName("pink_barrel").setCreativeTab(MainRegistry.nukeTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":barrel_pink");
		yellow_barrel = new YellowBarrel(Material.iron).setBlockName("yellow_barrel").setCreativeTab(MainRegistry.nukeTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":barrel_yellow");
		vitrified_barrel = new YellowBarrel(Material.iron).setBlockName("vitrified_barrel").setCreativeTab(MainRegistry.nukeTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":barrel_vitrified");
		lox_barrel = new RedBarrel(Material.iron).setBlockName("lox_barrel").setCreativeTab(MainRegistry.nukeTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":barrel_lox");
		taint_barrel = new RedBarrel(Material.iron).setBlockName("taint_barrel").setCreativeTab(MainRegistry.nukeTab).setHardness(0.5F).setResistance(2.5F).setBlockTextureName(RefStrings.MODID + ":barrel_taint");
		crashed_balefire = new BlockCrashedBomb(Material.iron).setBlockName("crashed_bomb").setCreativeTab(MainRegistry.nukeTab).setBlockUnbreakable().setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":crashed_balefire");
		rejuvinator = new BombRejuvinator(Material.iron).setBlockName("rejuvinator").setCreativeTab(MainRegistry.nukeTab).setResistance(6000.0F).setBlockTextureName(RefStrings.MODID + ":inserter_side");
		fireworks = new BlockFireworks(Material.iron).setBlockName("fireworks").setCreativeTab(MainRegistry.nukeTab).setResistance(5.0F);
		mine_ap = new Landmine(Material.iron).setBlockName("mine_ap").setCreativeTab(MainRegistry.nukeTab).setHardness(1.0F).setBlockTextureName(RefStrings.MODID + ":mine_ap");
		mine_he = new Landmine(Material.iron).setBlockName("mine_he").setCreativeTab(MainRegistry.nukeTab).setHardness(1.0F).setBlockTextureName(RefStrings.MODID + ":mine_he");
		mine_shrap = new Landmine(Material.iron).setBlockName("mine_shrap").setCreativeTab(MainRegistry.nukeTab).setHardness(1.0F).setBlockTextureName(RefStrings.MODID + ":mine_shrap");
		mine_fat = new Landmine(Material.iron).setBlockName("mine_fat").setCreativeTab(MainRegistry.nukeTab).setHardness(1.0F).setBlockTextureName(RefStrings.MODID + ":mine_fat");
		
		machine_difurnace_off = new MachineDiFurnace(false).setBlockName("machine_difurnace_off").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_difurnace_on = new MachineDiFurnace(true).setBlockName("machine_difurnace_on").setHardness(5.0F).setLightLevel(1.0F).setResistance(10.0F);
		
		machine_centrifuge = new MachineCentrifuge(Material.iron).setBlockName("machine_centrifuge").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_gascent = new MachineGasCent(Material.iron).setBlockName("machine_gascent").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_fel = new MachineFEL(Material.iron).setBlockName("machine_fel").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":block_steel");
		machine_silex = new MachineSILEX(Material.iron).setBlockName("machine_silex").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":block_steel");
		machine_crystallizer = new MachineCrystallizer(Material.iron).setBlockName("machine_crystallizer").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_crystallizer");
		
		machine_uf6_tank = new MachineUF6Tank(Material.iron).setBlockName("machine_uf6_tank").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		
		machine_puf6_tank = new MachinePuF6Tank(Material.iron).setBlockName("machine_puf6_tank").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		
		machine_reactor = new MachineReactor(Material.iron).setBlockName("machine_reactor").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_reactor");
		machine_reactor_on = new MachineReactor(Material.iron).setBlockName("machine_reactor_on").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":machine_reactor_on");
		
		machine_nuke_furnace_off = new MachineNukeFurnace(false).setBlockName("machine_nuke_furnace_off").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_nuke_furnace_on = new MachineNukeFurnace(true).setBlockName("machine_nuke_furnace_on").setHardness(5.0F).setLightLevel(1.0F).setResistance(10.0F);
		
		machine_rtg_furnace_off = new MachineRtgFurnace(false).setBlockName("machine_rtg_furnace_off").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_rtg_furnace_on = new MachineRtgFurnace(true).setBlockName("machine_rtg_furnace_on").setHardness(5.0F).setLightLevel(1.0F).setResistance(10.0F);

		machine_generator = new MachineGenerator(Material.iron).setBlockName("machine_generator").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null);
		machine_industrial_generator = new MachineIGenerator(Material.iron).setBlockName("machine_industrial_generator").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":industrial_generator");
		machine_cyclotron = new MachineCyclotron(Material.iron).setBlockName("machine_cyclotron").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":cyclotron");
		machine_radgen = new MachineRadGen(Material.iron).setBlockName("machine_radgen").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_radgen");

		hadron_plating = new BlockHadronPlating(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_plating").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_plating");
		hadron_plating_blue = new BlockHadronPlating(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_plating_blue").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_plating_blue");
		hadron_plating_black = new BlockHadronPlating(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_plating_black").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_plating_black");
		hadron_plating_yellow = new BlockHadronPlating(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_plating_yellow").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_plating_yellow");
		hadron_plating_striped = new BlockHadronPlating(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_plating_striped").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_plating_striped");
		hadron_plating_voltz = new BlockHadronPlating(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_plating_voltz").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_plating_voltz");
		hadron_plating_glass = new BlockNTMGlass(0, RefStrings.MODID + ":hadron_plating_glass", Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_plating_glass").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_plating_glass");
		hadron_coil_alloy = new BlockHadronCoil(Material.iron, 10).setStepSound(Block.soundTypeMetal).setBlockName("hadron_coil_alloy").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_coil_alloy");
		hadron_coil_gold = new BlockHadronCoil(Material.iron, 25).setStepSound(Block.soundTypeMetal).setBlockName("hadron_coil_gold").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_coil_gold");
		hadron_coil_neodymium = new BlockHadronCoil(Material.iron, 50).setStepSound(Block.soundTypeMetal).setBlockName("hadron_coil_neodymium").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_coil_neodymium");
		hadron_coil_magtung = new BlockHadronCoil(Material.iron, 100).setStepSound(Block.soundTypeMetal).setBlockName("hadron_coil_magtung").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_coil_magtung");
		hadron_coil_schrabidium = new BlockHadronCoil(Material.iron, 250).setStepSound(Block.soundTypeMetal).setBlockName("hadron_coil_schrabidium").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_coil_schrabidium");
		hadron_coil_schrabidate = new BlockHadronCoil(Material.iron, 500).setStepSound(Block.soundTypeMetal).setBlockName("hadron_coil_schrabidate").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_coil_schrabidate");
		hadron_coil_starmetal = new BlockHadronCoil(Material.iron, 1000).setStepSound(Block.soundTypeMetal).setBlockName("hadron_coil_starmetal").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_coil_starmetal");
		hadron_coil_chlorophyte = new BlockHadronCoil(Material.iron, 2500).setStepSound(Block.soundTypeMetal).setBlockName("hadron_coil_chlorophyte").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_coil_chlorophyte");
		hadron_coil_mese = new BlockHadronCoil(Material.iron, 10000).setStepSound(Block.soundTypeMetal).setBlockName("hadron_coil_mese").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_coil_mese");
		hadron_power = new BlockHadronPower(Material.iron, 1000000L).setStepSound(Block.soundTypeMetal).setBlockName("hadron_power").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_power");
		hadron_power_10m = new BlockHadronPower(Material.iron, 10000000L).setStepSound(Block.soundTypeMetal).setBlockName("hadron_power_10m").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_power");
		hadron_power_100m = new BlockHadronPower(Material.iron, 100000000L).setStepSound(Block.soundTypeMetal).setBlockName("hadron_power_100m").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_power");
		hadron_power_1g = new BlockHadronPower(Material.iron, 1000000000L).setStepSound(Block.soundTypeMetal).setBlockName("hadron_power_1g").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_power");
		hadron_power_10g = new BlockHadronPower(Material.iron, 10000000000L).setStepSound(Block.soundTypeMetal).setBlockName("hadron_power_10g").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_power");
		hadron_diode = new BlockHadronDiode(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_diode").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		hadron_analysis = new BlockHadronPlating(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_analysis").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_analysis");
		hadron_analysis_glass = new BlockNTMGlass(0, RefStrings.MODID + ":hadron_analysis_glass", Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_analysis_glass").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_analysis_glass");
		hadron_access = new BlockHadronAccess(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_access").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_access");
		hadron_core = new BlockHadronCore(Material.iron).setStepSound(Block.soundTypeMetal).setBlockName("hadron_core").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":hadron_core");
		
		machine_electric_furnace_off = new MachineElectricFurnace(false).setBlockName("machine_electric_furnace_off").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_electric_furnace_on = new MachineElectricFurnace(true).setBlockName("machine_electric_furnace_on").setHardness(5.0F).setLightLevel(1.0F).setResistance(10.0F);
		machine_arc_furnace_off = new MachineArcFurnace(false).setBlockName("machine_arc_furnace_off").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_arc_furnace_on = new MachineArcFurnace(true).setBlockName("machine_arc_furnace_on").setHardness(5.0F).setLightLevel(1.0F).setResistance(10.0F);
		machine_microwave = new MachineMicrowave(Material.iron).setBlockName("machine_microwave").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_microwave");

		//machine_deuterium = new MachineDeuterium(Material.iron).setBlockName("machine_deuterium").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);

		machine_battery_potato = new MachineBattery(Material.iron, 10000).setBlockName("machine_battery_potato").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_battery = new MachineBattery(Material.iron, 1000000).setBlockName("machine_battery").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_lithium_battery = new MachineBattery(Material.iron, 50000000).setBlockName("machine_lithium_battery").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_schrabidium_battery = new MachineBattery(Material.iron, 25000000000L).setBlockName("machine_schrabidium_battery").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_dineutronium_battery = new MachineBattery(Material.iron, 1000000000000L).setBlockName("machine_dineutronium_battery").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_fensu = new MachineFENSU(Material.iron).setBlockName("machine_fensu").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_fensu");
		
		machine_coal_off = new MachineCoal(false).setBlockName("machine_coal_off").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_coal_on = new MachineCoal(true).setBlockName("machine_coal_on").setHardness(5.0F).setLightLevel(1.0F).setResistance(10.0F);

		machine_diesel = new MachineDiesel(Material.iron).setBlockName("machine_diesel").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);

		machine_shredder = new MachineShredder(Material.iron).setBlockName("machine_shredder").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_shredder_large = new MachineShredderLarge(Material.iron).setBlockName("machine_shredder_large").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":code");

		machine_combine_factory = new MachineCMBFactory(Material.iron).setBlockName("machine_combine_factory").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);

		machine_teleporter = new MachineTeleporter(Material.iron).setBlockName("machine_teleporter").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);

		machine_rtg_grey = new MachineRTG(Material.iron).setBlockName("machine_rtg_grey").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rtg");
		//machine_rtg_red = new MachineRTG(Material.iron).setBlockName("machine_rtg_red").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		//machine_rtg_orange = new MachineRTG(Material.iron).setBlockName("machine_rtg_orange").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		//machine_rtg_yellow = new MachineRTG(Material.iron).setBlockName("machine_rtg_yellow").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		//machine_rtg_green = new MachineRTG(Material.iron).setBlockName("machine_rtg_green").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_rtg_cyan = new MachineRTG(Material.iron).setBlockName("machine_rtg_cyan").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		//machine_rtg_blue = new MachineRTG(Material.iron).setBlockName("machine_rtg_blue").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		//machine_rtg_purple = new MachineRTG(Material.iron).setBlockName("machine_rtg_purple").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_amgen = new MachineAmgen(Material.iron).setBlockName("machine_amgen").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_geo = new MachineAmgen(Material.iron).setBlockName("machine_geo").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_minirtg = new MachineMiniRTG(Material.iron).setBlockName("machine_minirtg").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rtg_cell");
		machine_powerrtg = new MachineMiniRTG(Material.iron).setBlockName("machine_powerrtg").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rtg_polonium");

		red_wire_coated = new WireCoated(Material.iron).setBlockName("red_wire_coated").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":red_wire_coated");
		red_cable = new BlockCable(Material.iron).setBlockName("red_cable").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":red_cable_icon");
		rf_cable = new BlockRFCable(Material.iron).setBlockName("rf_cable").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":rf_cable_icon");
		red_pylon = new PylonRedWire(Material.iron).setBlockName("red_pylon").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":red_pylon");
		cable_switch = new CableSwitch(Material.iron).setBlockName("cable_switch").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":cable_switch_off");
		machine_detector = new PowerDetector(Material.iron).setBlockName("machine_detector").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_detector_off");
		oil_duct_solid = new OilDuctSolid(Material.iron).setBlockName("oil_duct_solid").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":oil_duct_solid_alt");
		oil_duct = new BlockOilDuct(Material.iron).setBlockName("oil_duct").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":oil_duct_icon_alt");
		gas_duct_solid = new GasDuctSolid(Material.iron).setBlockName("gas_duct_solid").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":gas_duct_solid");
		gas_duct = new BlockGasDuct(Material.iron).setBlockName("gas_duct").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":gas_duct_icon");
		fluid_duct = new BlockFluidDuct(Material.iron).setBlockName("fluid_duct").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fluid_duct_icon");
		conveyor = new BlockConveyor(Material.iron).setBlockName("conveyor").setHardness(0.0F).setResistance(2.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":conveyor");
		
		chain = new BlockChain(Material.iron).setBlockName("dungeon_chain").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":chain");

		ladder_sturdy = new BlockNTMLadder().setBlockName("ladder_sturdy").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_sturdy");
		ladder_iron = new BlockNTMLadder().setBlockName("ladder_iron").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_iron");
		ladder_gold = new BlockNTMLadder().setBlockName("ladder_gold").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_gold");
		ladder_aluminium = new BlockNTMLadder().setBlockName("ladder_aluminium").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_aluminium");
		ladder_copper = new BlockNTMLadder().setBlockName("ladder_copper").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_copper");
		ladder_titanium = new BlockNTMLadder().setBlockName("ladder_titanium").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_titanium");
		ladder_lead = new BlockNTMLadder().setBlockName("ladder_lead").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_lead");
		ladder_cobalt = new BlockNTMLadder().setBlockName("ladder_cobalt").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_cobalt");
		ladder_steel = new BlockNTMLadder().setBlockName("ladder_steel").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_steel");
		ladder_tungsten = new BlockNTMLadder().setBlockName("ladder_tungsten").setHardness(0.25F).setResistance(2.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":ladder_tungsten");
		
		barrel_plastic = new BlockFluidBarrel(Material.iron, 12000).setBlockName("barrel_plastic").setStepSound(Block.soundTypeStone).setHardness(2.0F).setResistance(5.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":barrel_plastic");
		barrel_corroded = new BlockFluidBarrel(Material.iron, 6000).setBlockName("barrel_corroded").setStepSound(Block.soundTypeMetal).setHardness(2.0F).setResistance(5.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":barrel_corroded");
		barrel_iron = new BlockFluidBarrel(Material.iron, 8000).setBlockName("barrel_iron").setStepSound(Block.soundTypeMetal).setHardness(2.0F).setResistance(5.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":barrel_iron");
		barrel_steel = new BlockFluidBarrel(Material.iron, 16000).setBlockName("barrel_steel").setStepSound(Block.soundTypeMetal).setHardness(2.0F).setResistance(5.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":barrel_steel");
		barrel_antimatter = new BlockFluidBarrel(Material.iron, 16000).setBlockName("barrel_antimatter").setStepSound(Block.soundTypeMetal).setHardness(2.0F).setResistance(5.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":barrel_antimatter");

		machine_transformer = new MachineTransformer(Material.iron, 10000L, 1).setBlockName("machine_transformer").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_transformer_iron");
		machine_transformer_dnt = new MachineTransformer(Material.iron, 1000000000000000L, 1).setBlockName("machine_transformer_dnt").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_transformer");
		machine_transformer_20 = new MachineTransformer(Material.iron, 10000L, 20).setBlockName("machine_transformer_20").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_transformer_iron");
		machine_transformer_dnt_20 = new MachineTransformer(Material.iron, 1000000000000000L, 20).setBlockName("machine_transformer_dnt_20").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_transformer");
		
		machine_satlinker = new MachineSatLinker(Material.iron).setBlockName("machine_satlinker").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":machine_satlinker_side");
		machine_telelinker = new MachineTeleLinker(Material.iron).setBlockName("machine_telelinker").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.nukeTab).setBlockTextureName(RefStrings.MODID + ":machine_telelinker_side");
		machine_keyforge = new MachineKeyForge(Material.iron).setBlockName("machine_keyforge").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.consumableTab).setBlockTextureName(RefStrings.MODID + ":machine_keyforge_side");
		machine_armor_table = new BlockArmorTable(Material.iron).setBlockName("machine_armor_table").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.consumableTab);

		machine_solar_boiler = new MachineSolarBoiler(Material.iron).setBlockName("machine_solar_boiler").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_solar_boiler");
		solar_mirror = new SolarMirror(Material.iron).setBlockName("solar_mirror").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":solar_mirror");
		
		struct_launcher = new BlockGeneric(Material.iron).setBlockName("struct_launcher").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":struct_launcher");
		struct_scaffold = new BlockGeneric(Material.iron).setBlockName("struct_scaffold").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":struct_scaffold");
		struct_launcher_core = new BlockStruct(Material.iron).setBlockName("struct_launcher_core").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":struct_launcher_core");
		struct_launcher_core_large = new BlockStruct(Material.iron).setBlockName("struct_launcher_core_large").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":struct_launcher_core_large");
		struct_soyuz_core = new BlockSoyuzStruct(Material.iron).setBlockName("struct_soyuz_core").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":struct_soyuz_core");
		struct_iter_core = new BlockITERStruct(Material.iron).setBlockName("struct_iter_core").setLightLevel(1F).setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":struct_iter_core");
		struct_plasma_core = new BlockPlasmaStruct(Material.iron).setBlockName("struct_plasma_core").setLightLevel(1F).setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":struct_plasma_core");
		
		factory_titanium_hull = new BlockGeneric(Material.iron).setBlockName("factory_titanium_hull").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":factory_titanium_hull");
		factory_titanium_furnace = new FactoryHatch(Material.iron).setBlockName("factory_titanium_furnace").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":factory_titanium_furnace");
		factory_titanium_conductor = new BlockPillar(Material.iron, RefStrings.MODID + ":factory_titanium_conductor").setBlockName("factory_titanium_conductor").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":factory_titanium_hull");
		factory_titanium_core = new FactoryCoreTitanium(Material.iron).setBlockName("factory_titanium_core").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":factory_titanium_core");
		factory_advanced_hull = new BlockGeneric(Material.iron).setBlockName("factory_advanced_hull").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":factory_advanced_hull");
		factory_advanced_furnace = new FactoryHatch(Material.iron).setBlockName("factory_advanced_furnace").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":factory_advanced_furnace");
		factory_advanced_conductor = new BlockPillar(Material.iron, RefStrings.MODID + ":factory_advanced_conductor").setBlockName("factory_advanced_conductor").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":factory_advanced_hull");
		factory_advanced_core = new FactoryCoreAdvanced(Material.iron).setBlockName("factory_advanced_core").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":factory_advanced_core");

		reactor_element = new BlockPillar(Material.iron, RefStrings.MODID + ":reactor_element_top", RefStrings.MODID + ":reactor_element_base").setBlockName("reactor_element").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":reactor_element_side");
		reactor_control = new BlockPillar(Material.iron, RefStrings.MODID + ":reactor_control_top").setBlockName("reactor_control").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":reactor_control_side");
		reactor_hatch = new ReactorHatch(Material.iron).setBlockName("reactor_hatch").setHardness(5.0F).setResistance(1000.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":brick_concrete");
		reactor_ejector = new BlockRotatable(Material.iron).setBlockName("reactor_ejector").setHardness(5.0F).setResistance(1000.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":brick_concrete");
		reactor_inserter = new BlockRotatable(Material.iron).setBlockName("reactor_inserter").setHardness(5.0F).setResistance(1000.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":brick_concrete");
		reactor_conductor = new BlockPillar(Material.iron, RefStrings.MODID + ":reactor_conductor_top").setBlockName("reactor_conductor").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":reactor_conductor_side");
		reactor_computer = new ReactorCore(Material.iron).setBlockName("reactor_computer").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":reactor_computer");

		fusion_conductor = new BlockPillar(Material.iron, RefStrings.MODID + ":fusion_conductor_top_alt").setBlockName("fusion_conductor").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fusion_conductor_side_alt");
		fusion_center = new BlockPillar(Material.iron, RefStrings.MODID + ":fusion_center_top_alt").setBlockName("fusion_center").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fusion_center_side_alt");
		fusion_motor = new BlockPillar(Material.iron, RefStrings.MODID + ":fusion_motor_top_alt").setBlockName("fusion_motor").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fusion_motor_side_alt");
		fusion_heater = new BlockPillar(Material.iron, RefStrings.MODID + ":fusion_heater_top").setBlockName("fusion_heater").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fusion_heater_side");
		fusion_hatch = new FusionHatch(Material.iron).setBlockName("fusion_hatch").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fusion_hatch");
		fusion_core = new FusionCore(Material.iron).setBlockName("fusion_core").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fusion_core_side");
		plasma = new BlockPlasma(Material.iron).setBlockName("plasma").setHardness(5.0F).setResistance(6000.0F).setLightLevel(1.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":plasma");
		iter = new MachineITER().setBlockName("iter").setHardness(5.0F).setResistance(60.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":iter");
		plasma_heater = new MachinePlasmaHeater().setBlockName("plasma_heater").setHardness(5.0F).setResistance(60.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":plasma_heater");

		watz_element = new BlockPillar(Material.iron, RefStrings.MODID + ":watz_element_top").setBlockName("watz_element").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":watz_element_side");
		watz_control = new BlockPillar(Material.iron, RefStrings.MODID + ":watz_control_top").setBlockName("watz_control").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":watz_control_side");
		watz_cooler = new BlockGeneric(Material.iron).setBlockName("watz_cooler").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":watz_cooler");
		watz_end = new BlockGeneric(Material.iron).setBlockName("watz_end").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":watz_end");
		watz_hatch = new WatzHatch(Material.iron).setBlockName("watz_hatch").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":watz_hatch");
		watz_conductor = new BlockPillar(Material.iron, RefStrings.MODID + ":watz_conductor_top").setBlockName("watz_conductor").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":watz_conductor_side");
		watz_core = new WatzCore(Material.iron).setBlockName("watz_core").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":watz_computer");

		fwatz_conductor = new BlockPillar(Material.iron, RefStrings.MODID + ":block_combine_steel").setBlockName("fwatz_conductor").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fwatz_conductor_side");
		fwatz_cooler = new BlockPillar(Material.iron, RefStrings.MODID + ":fwatz_cooler_top").setBlockName("fwatz_cooler").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fwatz_cooler");
		fwatz_tank = new BlockNTMGlass(0, RefStrings.MODID + ":fwatz_tank", Material.iron).setBlockName("fwatz_tank").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		fwatz_scaffold = new BlockGeneric(Material.iron).setBlockName("fwatz_scaffold").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fwatz_scaffold");
		fwatz_hatch = new FWatzHatch(Material.iron).setBlockName("fwatz_hatch").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fwatz_computer");
		fwatz_computer = new BlockGeneric(Material.iron).setBlockName("fwatz_computer").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fwatz_computer");
		fwatz_core = new FWatzCore(Material.iron).setBlockName("fwatz_core").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fwatz_core");
		fwatz_plasma = new BlockPlasma(Material.iron).setBlockName("fwatz_plasma").setHardness(5.0F).setResistance(6000.0F).setLightLevel(1.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":fwatz_plasma");
		
		balefire = new Balefire().setBlockName("balefire").setHardness(0.0F).setLightLevel(1.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":balefire");

		ams_base = new BlockAMSBase(Material.iron).setBlockName("ams_base").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":ams_base");
		ams_emitter = new BlockAMSEmitter(Material.iron).setBlockName("ams_emitter").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":ams_emitter");
		ams_limiter = new BlockAMSLimiter(Material.iron).setBlockName("ams_limiter").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":ams_limiter");

		machine_converter_he_rf = new BlockConverterHeRf(Material.iron).setBlockName("machine_converter_he_rf").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_converter_he_rf");
		machine_converter_rf_he = new BlockConverterRfHe(Material.iron).setBlockName("machine_converter_rf_he").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_converter_rf_he");

		dfc_emitter = new CoreComponent(Material.iron).setBlockName("dfc_emitter").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":dfc_emitter");
		dfc_injector = new CoreComponent(Material.iron).setBlockName("dfc_injector").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":dfc_injector");
		dfc_receiver = new CoreComponent(Material.iron).setBlockName("dfc_receiver").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":dfc_receiver");
		dfc_stabilizer = new CoreComponent(Material.iron).setBlockName("dfc_stabilizer").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":dfc_stabilizer");
		dfc_core = new CoreCore(Material.iron).setBlockName("dfc_core").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":dfc_core");

		seal_frame = new BlockGeneric(Material.iron).setBlockName("seal_frame").setHardness(10.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":seal_frame");
		seal_controller = new BlockSeal(Material.iron).setBlockName("seal_controller").setHardness(10.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab);
		seal_hatch = new BlockHatch(Material.iron).setBlockName("seal_hatch").setHardness(Float.POSITIVE_INFINITY).setResistance(Float.POSITIVE_INFINITY).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":seal_hatch_3");
		
		vault_door = new VaultDoor(Material.iron).setBlockName("vault_door").setHardness(10.0F).setResistance(10000.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":vault_door");
		blast_door = new BlastDoor(Material.iron).setBlockName("blast_door").setHardness(10.0F).setResistance(10000.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":blast_door");

		door_metal = new BlockModDoor(Material.iron).setBlockName("door_metal").setHardness(5.0F).setResistance(5.0F).setBlockTextureName(RefStrings.MODID + ":door_metal");
		door_office = new BlockModDoor(Material.iron).setBlockName("door_office").setHardness(10.0F).setResistance(10.0F).setBlockTextureName(RefStrings.MODID + ":door_office");
		door_bunker = new BlockModDoor(Material.iron).setBlockName("door_bunker").setHardness(10.0F).setResistance(100.0F).setBlockTextureName(RefStrings.MODID + ":door_bunker");

		barbed_wire = new BarbedWire(Material.iron).setBlockName("barbed_wire").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":barbed_wire_model");
		barbed_wire_fire = new BarbedWire(Material.iron).setBlockName("barbed_wire_fire").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":barbed_wire_fire_model");
		barbed_wire_poison = new BarbedWire(Material.iron).setBlockName("barbed_wire_poison").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":barbed_wire_poison_model");
		barbed_wire_acid = new BarbedWire(Material.iron).setBlockName("barbed_wire_acid").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":barbed_wire_acid_model");
		barbed_wire_wither = new BarbedWire(Material.iron).setBlockName("barbed_wire_wither").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":barbed_wire_wither_model");
		barbed_wire_ultradeath = new BarbedWire(Material.iron).setBlockName("barbed_wire_ultradeath").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":barbed_wire_ultradeath_model");
		spikes = new Spikes(Material.iron).setBlockName("spikes").setHardness(2.5F).setResistance(5.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":spikes");
		
		tesla = new MachineTesla(Material.iron).setBlockName("tesla").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":tesla");

		marker_structure = new BlockMarker(Material.iron).setBlockName("marker_structure").setHardness(0.0F).setResistance(0.0F).setLightLevel(1.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":marker_structure");

		muffler = new BlockGeneric(Material.cloth).setBlockName("muffler").setHardness(0.8F).setStepSound(Block.soundTypeCloth).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":muffler");
		
		launch_pad = new LaunchPad(Material.iron).setBlockName("launch_pad").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":launch_pad");
		machine_radar = new MachineRadar(Material.iron).setBlockName("machine_radar").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":machine_radar");

		machine_missile_assembly = new MachineMissileAssembly(Material.iron).setBlockName("machine_missile_assembly").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":machine_missile_assembly");
		compact_launcher = new CompactLauncher(Material.iron).setBlockName("compact_launcher").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":compact_launcher");
		launch_table = new LaunchTable(Material.iron).setBlockName("launch_table").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":launch_table");
		soyuz_launcher = new SoyuzLauncher(Material.iron).setBlockName("soyuz_launcher").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":soyuz_launcher");
		
		sat_mapper = new DecoBlock(Material.iron).setBlockName("sat_mapper").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":sat_mapper");
		sat_radar = new DecoBlock(Material.iron).setBlockName("sat_radar").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":sat_radar");
		sat_scanner = new DecoBlock(Material.iron).setBlockName("sat_scanner").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":sat_scanner");
		sat_laser = new DecoBlock(Material.iron).setBlockName("sat_laser").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":sat_laser");
		sat_foeq = new DecoBlock(Material.iron).setBlockName("sat_foeq").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":sat_foeq");
		sat_resonator = new DecoBlock(Material.iron).setBlockName("sat_resonator").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":sat_resonator");
		
		sat_dock = new MachineSatDock(Material.iron).setBlockName("sat_dock").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":sat_dock");
		soyuz_capsule = new SoyuzCapsule(Material.iron).setBlockName("soyuz_capsule").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":soyuz_capsule");
		
		turret_light = new TurretLight(Material.iron).setBlockName("turret_light").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":turret_light");
		turret_heavy = new TurretHeavy(Material.iron).setBlockName("turret_heavy").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":turret_heavy");
		turret_rocket = new TurretRocket(Material.iron).setBlockName("turret_rocket").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":turret_rocket");
		turret_flamer = new TurretFlamer(Material.iron).setBlockName("turret_flamer").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":turret_flamer");
		turret_tau = new TurretTau(Material.iron).setBlockName("turret_tau").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":turret_tau");
		turret_spitfire = new TurretSpitfire(Material.iron).setBlockName("turret_spitfire").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.weaponTab).setBlockTextureName(RefStrings.MODID + ":code");
		turret_cwis = new TurretCIWS(Material.iron).setBlockName("turret_cwis").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":turret_cwis");
		turret_cheapo = new TurretCheapo(Material.iron).setBlockName("turret_cheapo").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.weaponTab).setBlockTextureName(RefStrings.MODID + ":turret_cheapo");
		
		turret_chekhov = new TurretChekhov(Material.iron).setBlockName("turret_chekhov").setHardness(5.0F).setResistance(600.0F).setCreativeTab(MainRegistry.weaponTab).setBlockTextureName(RefStrings.MODID + ":block_steel");
		turret_friendly = new TurretFriendly(Material.iron).setBlockName("turret_friendly").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.weaponTab).setBlockTextureName(RefStrings.MODID + ":block_steel");
		turret_jeremy = new TurretJeremy(Material.iron).setBlockName("turret_jeremy").setHardness(5.0F).setResistance(600.0F).setCreativeTab(MainRegistry.weaponTab).setBlockTextureName(RefStrings.MODID + ":block_steel");
		turret_tauon = new TurretTauon(Material.iron).setBlockName("turret_tauon").setHardness(5.0F).setResistance(600.0F).setCreativeTab(MainRegistry.weaponTab).setBlockTextureName(RefStrings.MODID + ":block_steel");
		turret_richard = new TurretRichard(Material.iron).setBlockName("turret_richard").setHardness(5.0F).setResistance(600.0F).setCreativeTab(MainRegistry.weaponTab).setBlockTextureName(RefStrings.MODID + ":block_steel");
		turret_howard = new TurretHoward(Material.iron).setBlockName("turret_howard").setHardness(5.0F).setResistance(600.0F).setCreativeTab(MainRegistry.weaponTab).setBlockTextureName(RefStrings.MODID + ":block_steel");

		rbmk_rod = new RBMKRod().setBlockName("rbmk_rod").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_element");
		rbmk_control = new RBMKControl().setBlockName("rbmk_control").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_control");
		rbmk_control_auto = new RBMKControlAuto().setBlockName("rbmk_control_auto").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_control_auto");
		rbmk_blank = new RBMKBlank().setBlockName("rbmk_blank").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_blank");
		rbmk_boiler = new RBMKBoiler().setBlockName("rbmk_boiler").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_boiler");
		rbmk_reflector = new RBMKReflector().setBlockName("rbmk_reflector").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_reflector");
		rbmk_absorber = new RBMKAbsorber().setBlockName("rbmk_absorber").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_absorber");
		rbmk_moderator = new RBMKModerator().setBlockName("rbmk_moderator").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_moderator");
		rbmk_outgasser = new RBMKOutgasser().setBlockName("rbmk_outgasser").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_outgasser");
		rbmk_console = new RBMKConsole().setBlockName("rbmk_console").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_console");
		rbmk_loader = new BlockGeneric(Material.iron).setBlockName("rbmk_loader").setCreativeTab(MainRegistry.machineTab).setHardness(50.0F).setResistance(60.0F).setBlockTextureName(RefStrings.MODID + ":rbmk_loader");
		pribris = new RBMKDebris().setBlockName("pribris").setCreativeTab(MainRegistry.machineTab).setHardness(50.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_debris");
		pribris_burning = new RBMKDebrisBurning().setBlockName("pribris_burning").setCreativeTab(MainRegistry.machineTab).setHardness(50.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_debris_burning");
		pribris_radiating = new RBMKDebrisRadiating().setBlockName("pribris_radiating").setCreativeTab(MainRegistry.machineTab).setHardness(50.0F).setResistance(600.0F).setBlockTextureName(RefStrings.MODID + ":rbmk/rbmk_debris_radiating");
		
		book_guide = new Guide(Material.iron).setBlockName("book_guide").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.nukeTab);
		
		rail_highspeed = new RailHighspeed().setBlockName("rail_highspeed").setHardness(5.0F).setResistance(10.0F).setCreativeTab(CreativeTabs.tabTransport).setBlockTextureName(RefStrings.MODID + ":rail_highspeed");
		rail_booster = new RailBooster().setBlockName("rail_booster").setHardness(5.0F).setResistance(10.0F).setCreativeTab(CreativeTabs.tabTransport).setBlockTextureName(RefStrings.MODID + ":rail_booster");

		crate = new BlockCrate(Material.wood).setBlockName("crate").setStepSound(Block.soundTypeWood).setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.consumableTab).setBlockTextureName(RefStrings.MODID + ":crate");
		crate_weapon = new BlockCrate(Material.wood).setBlockName("crate_weapon").setStepSound(Block.soundTypeWood).setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.consumableTab).setBlockTextureName(RefStrings.MODID + ":crate_weapon");
		crate_lead = new BlockCrate(Material.iron).setBlockName("crate_lead").setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.consumableTab).setBlockTextureName(RefStrings.MODID + ":crate_lead");
		crate_metal = new BlockCrate(Material.iron).setBlockName("crate_metal").setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.consumableTab).setBlockTextureName(RefStrings.MODID + ":crate_metal");
		crate_red = new BlockCrate(Material.iron).setBlockName("crate_red").setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":crate_red");
		crate_can = new BlockCanCrate(Material.wood).setBlockName("crate_can").setStepSound(Block.soundTypeWood).setHardness(1.0F).setResistance(2.5F).setCreativeTab(MainRegistry.consumableTab).setBlockTextureName(RefStrings.MODID + ":crate_can");
		crate_ammo = new BlockAmmoCrate(Material.iron).setBlockName("crate_ammo").setStepSound(Block.soundTypeMetal).setHardness(1.0F).setResistance(2.5F).setCreativeTab(MainRegistry.consumableTab);
		crate_jungle = new BlockJungleCrate(Material.rock).setBlockName("crate_jungle").setStepSound(Block.soundTypeStone).setHardness(1.0F).setResistance(2.5F).setCreativeTab(MainRegistry.consumableTab).setBlockTextureName(RefStrings.MODID + ":crate_jungle");
		crate_iron = new BlockStorageCrate(Material.iron).setBlockName("crate_iron").setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		crate_steel = new BlockStorageCrate(Material.iron).setBlockName("crate_steel").setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		crate_tungsten = new BlockStorageCrate(Material.iron).setBlockName("crate_tungsten").setStepSound(Block.soundTypeMetal).setHardness(7.5F).setResistance(60.0F).setCreativeTab(MainRegistry.machineTab);
		safe = new BlockStorageCrate(Material.iron).setBlockName("safe").setStepSound(Block.soundTypeMetal).setHardness(7.5F).setResistance(10000.0F).setCreativeTab(MainRegistry.machineTab);
		
		boxcar = new DecoBlock(Material.iron).setBlockName("boxcar").setStepSound(Block.soundTypeMetal).setHardness(10.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":boxcar");
		boat = new DecoBlock(Material.iron).setBlockName("boat").setStepSound(Block.soundTypeMetal).setHardness(10.0F).setResistance(10.0F).setCreativeTab(MainRegistry.blockTab).setBlockTextureName(RefStrings.MODID + ":boat");
		bomber = new DecoBlock(Material.iron).setBlockName("bomber").setStepSound(Block.soundTypeMetal).setHardness(10.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":code");

		machine_well = new MachineOilWell(Material.iron).setBlockName("machine_well").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_well");
		machine_pumpjack = new MachinePumpjack(Material.iron).setBlockName("machine_pumpjack").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_pumpjack");
		oil_pipe = new BlockNoDrop(Material.iron).setBlockName("oil_pipe").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":oil_pipe");
		machine_flare = new MachineGasFlare(Material.iron).setBlockName("machine_flare").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_flare");
		machine_refinery = new MachineRefinery(Material.iron).setBlockName("machine_refinery").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_refinery");
		machine_drill = new MachineMiningDrill(Material.iron).setBlockName("machine_drill").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_drill");
		drill_pipe = new BlockNoDrop(Material.iron).setBlockName("drill_pipe").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":drill_pipe");
		machine_mining_laser = new MachineMiningLaser(Material.iron).setBlockName("machine_mining_laser").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_mining_laser");
		barricade = new BlockNoDrop(Material.sand).setBlockName("barricade").setHardness(1.0F).setResistance(2.5F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":barricade");
		machine_assembler = new MachineAssembler(Material.iron).setBlockName("machine_assembler").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_assembler");
		machine_chemplant = new MachineChemplant(Material.iron).setBlockName("machine_chemplant").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_chemplant");
		machine_fluidtank = new MachineFluidTank(Material.iron).setBlockName("machine_fluidtank").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_fluidtank");
		machine_turbofan = new MachineTurbofan(Material.iron).setBlockName("machine_turbofan").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_turbofan");
		machine_press = new MachinePress(Material.iron).setBlockName("machine_press").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_press");
		machine_epress = new MachineEPress(Material.iron).setBlockName("machine_epress").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_epress");
		machine_selenium = new MachineSeleniumEngine(Material.iron).setBlockName("machine_selenium").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_selenium");
		machine_reactor_small = new MachineReactorSmall(Material.iron).setBlockName("machine_reactor_small").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_reactor_small");
		machine_controller = new MachineReactorControl(Material.iron).setBlockName("machine_controller").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);

		machine_boiler_off = new MachineBoiler(false).setBlockName("machine_boiler_off").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_boiler_off");
		machine_boiler_on = new MachineBoiler(true).setBlockName("machine_boiler_on").setHardness(5.0F).setResistance(10.0F).setLightLevel(1.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":machine_boiler_on");
		machine_boiler_electric_off = new MachineBoiler(false).setBlockName("machine_boiler_electric_off").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_boiler_electric_off");
		machine_boiler_electric_on = new MachineBoiler(true).setBlockName("machine_boiler_electric_on").setHardness(5.0F).setResistance(10.0F).setLightLevel(1.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":machine_boiler_electric_on");
		
		machine_turbine = new MachineTurbine(Material.iron).setBlockName("machine_turbine").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_turbine");
		machine_large_turbine = new MachineLargeTurbine(Material.iron).setBlockName("machine_large_turbine").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_large_turbine");
		
		machine_deaerator = new MachineDeaerator(Material.iron).setBlockName("machine_deaerator").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_deaerator");
		
		machine_waste_drum = new WasteDrum(Material.iron).setBlockName("machine_waste_drum").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":waste_drum");
		machine_storage_drum = new StorageDrum(Material.iron, guiID_storage_drum).setBlockName("machine_storage_drum").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_storage_drum");

		machine_schrabidium_transmutator = new MachineSchrabidiumTransmutator(Material.iron).setBlockName("machine_schrabidium_transmutator").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab);

		machine_reix_mainframe = new MachineReiXMainframe(Material.iron).setBlockName("machine_reix_mainframe").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.machineTab);
		
		machine_siren = new MachineSiren(Material.iron).setBlockName("machine_siren").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":machine_siren");
		
		machine_spp_bottom = new SPPBottom(Material.iron).setBlockName("machine_spp_bottom").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		machine_spp_top = new SPPTop(Material.iron).setBlockName("machine_spp_top").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		
		radiobox = new Radiobox(Material.iron).setBlockName("radiobox").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":radiobox");
		radiorec = new RadioRec(Material.iron).setBlockName("radiorec").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":radiorec");
		
		machine_forcefield = new MachineForceField(Material.iron).setBlockName("machine_forcefield").setHardness(5.0F).setResistance(100.0F).setCreativeTab(MainRegistry.missileTab).setBlockTextureName(RefStrings.MODID + ":machine_forcefield");

		cheater_virus = new CheaterVirus(Material.iron).setBlockName("cheater_virus").setHardness(Float.POSITIVE_INFINITY).setResistance(Float.POSITIVE_INFINITY).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":cheater_virus");
		cheater_virus_seed = new CheaterVirusSeed(Material.iron).setBlockName("cheater_virus_seed").setHardness(Float.POSITIVE_INFINITY).setResistance(Float.POSITIVE_INFINITY).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":cheater_virus_seed");
		crystal_virus = new CrystalVirus(Material.iron).setBlockName("crystal_virus").setHardness(15.0F).setResistance(Float.POSITIVE_INFINITY).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":crystal_virus");
		crystal_hardened = new BlockGeneric(Material.iron).setBlockName("crystal_hardened").setHardness(15.0F).setResistance(Float.POSITIVE_INFINITY).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":crystal_hardened");
		crystal_pulsar = new CrystalPulsar(Material.iron).setBlockName("crystal_pulsar").setHardness(15.0F).setResistance(Float.POSITIVE_INFINITY).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":crystal_pulsar");
		taint = new BlockTaint(Material.iron).setBlockName("taint").setHardness(15.0F).setResistance(10.0F).setCreativeTab(null);
		residue = new BlockCloudResidue(Material.iron).setBlockName("residue").setHardness(0.5F).setResistance(0.5F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":residue");

		vent_chlorine = new BlockVent(Material.iron).setBlockName("vent_chlorine").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":vent_chlorine");
		vent_cloud = new BlockVent(Material.iron).setBlockName("vent_cloud").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":vent_cloud");
		vent_pink_cloud = new BlockVent(Material.iron).setBlockName("vent_pink_cloud").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":vent_pink_cloud");
		vent_chlorine_seal = new BlockClorineSeal(Material.iron).setBlockName("vent_chlorine_seal").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab);
		chlorine_gas = new BlockGasClorine().setBlockName("chlorine_gas").setHardness(0.0F).setResistance(0.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":chlorine_gas");
		
		gas_radon = new BlockGasRadon().setBlockName("gas_radon").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":gas_radon");
		gas_radon_dense = new BlockGasRadonDense().setBlockName("gas_radon_dense").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":gas_radon_dense");
		gas_radon_tomb = new BlockGasRadonTomb().setBlockName("gas_radon_tomb").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":gas_radon_tomb");
		gas_monoxide = new BlockGasMonoxide().setBlockName("gas_monoxide").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":gas_monoxide");
		gas_asbestos = new BlockGasAsbestos().setBlockName("gas_asbestos").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":gas_asbestos");
		gas_flammable = new BlockGasFlammable().setBlockName("gas_flammable").setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":gas_flammable");

		absorber = new BlockAbsorber(Material.iron, 2.5F).setBlockName("absorber").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":absorber");
		absorber_red = new BlockAbsorber(Material.iron, 10F).setBlockName("absorber_red").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":absorber_red");
		absorber_green = new BlockAbsorber(Material.iron, 100F).setBlockName("absorber_green").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":absorber_green");
		absorber_pink = new BlockAbsorber(Material.iron, 10000F).setBlockName("absorber_pink").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":absorber_pink");
		decon = new BlockDecon(Material.iron).setBlockName("decon").setHardness(5.0F).setResistance(10.0F).setCreativeTab(MainRegistry.machineTab).setBlockTextureName(RefStrings.MODID + ":decon_side");

		statue_elb = new DecoBlockAlt(Material.iron).setBlockName("#null").setHardness(Float.POSITIVE_INFINITY).setResistance(Float.POSITIVE_INFINITY);
		statue_elb_g = new DecoBlockAlt(Material.iron).setBlockName("#void").setHardness(Float.POSITIVE_INFINITY).setResistance(Float.POSITIVE_INFINITY);
		statue_elb_w = new DecoBlockAlt(Material.iron).setBlockName("#ngtv").setHardness(Float.POSITIVE_INFINITY).setResistance(Float.POSITIVE_INFINITY);
		statue_elb_f = new DecoBlockAlt(Material.iron).setBlockName("#undef").setHardness(Float.POSITIVE_INFINITY).setLightLevel(1.0F).setResistance(Float.POSITIVE_INFINITY);

		mud_fluid = new MudFluid().setDensity(2500).setViscosity(3000).setLuminosity(5).setTemperature(2773).setUnlocalizedName("mud_fluid");
		FluidRegistry.registerFluid(mud_fluid);
		mud_block = new MudBlock(mud_fluid, fluidmud.setReplaceable(), ModDamageSource.mudPoisoning).setBlockName("mud_block").setResistance(500F);

		acid_fluid = new AcidFluid().setDensity(2500).setViscosity(1500).setLuminosity(5).setTemperature(2773).setUnlocalizedName("acid_fluid");
		FluidRegistry.registerFluid(acid_fluid);
		acid_block = new AcidBlock(acid_fluid, fluidacid.setReplaceable(), ModDamageSource.acid).setBlockName("acid_block").setResistance(500F);

		toxic_fluid = new ToxicFluid().setDensity(2500).setViscosity(2000).setLuminosity(15).setTemperature(2773).setUnlocalizedName("toxic_fluid");
		FluidRegistry.registerFluid(toxic_fluid);
		toxic_block = new ToxicBlock(toxic_fluid, fluidtoxic.setReplaceable(), ModDamageSource.radiation).setBlockName("toxic_block").setResistance(500F);

		schrabidic_fluid = new SchrabidicFluid().setDensity(31200).setViscosity(500).setTemperature(273).setUnlocalizedName("schrabidic_fluid");
		FluidRegistry.registerFluid(schrabidic_fluid);
		schrabidic_block = new SchrabidicBlock(schrabidic_fluid, fluidschrabidic.setReplaceable(), ModDamageSource.radiation).setBlockName("schrabidic_block").setResistance(500F);

		corium_fluid = new CoriumFluid().setDensity(6000).setViscosity(500).setLuminosity(10).setTemperature(600).setUnlocalizedName("corium_fluid");
		FluidRegistry.registerFluid(corium_fluid);
		corium_block = new CoriumBlock(corium_fluid, fluidcorium).setBlockName("corium_block").setResistance(500F);

		dummy_block_igenerator = new DummyBlockIGenerator(Material.iron).setBlockName("dummy_block_igenerator").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_igenerator = new DummyBlockIGenerator(Material.iron).setBlockName("dummy_port_igenerator").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_centrifuge = new DummyBlockCentrifuge(Material.iron).setBlockName("dummy_block_centrifuge").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_cyclotron = new DummyBlockCyclotron(Material.iron).setBlockName("dummy_block_cyclotron").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_titanium");
		dummy_port_cyclotron = new DummyBlockCyclotron(Material.iron).setBlockName("dummy_port_cyclotron").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_titanium");
		dummy_block_well = new DummyBlockWell(Material.iron).setBlockName("dummy_block_well").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_well = new DummyBlockWell(Material.iron).setBlockName("dummy_port_well").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_flare = new DummyBlockFlare(Material.iron).setBlockName("dummy_block_flare").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_aluminium");
		dummy_port_flare = new DummyBlockFlare(Material.iron).setBlockName("dummy_port_flare").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_aluminium");
		dummy_block_drill = new DummyBlockDrill(Material.iron).setBlockName("dummy_block_drill").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_lead");
		dummy_port_drill = new DummyBlockDrill(Material.iron).setBlockName("dummy_port_drill").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_lead");
		dummy_block_assembler = new DummyBlockAssembler(Material.iron).setBlockName("dummy_block_assembler").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_assembler = new DummyBlockAssembler(Material.iron).setBlockName("dummy_port_assembler").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_chemplant = new DummyBlockChemplant(Material.iron).setBlockName("dummy_block_chemplant").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_chemplant = new DummyBlockChemplant(Material.iron).setBlockName("dummy_port_chemplant").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_fluidtank = new DummyBlockFluidTank(Material.iron).setBlockName("dummy_block_fluidtank").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_fluidtank = new DummyBlockFluidTank(Material.iron).setBlockName("dummy_port_fluidtank").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_refinery = new DummyBlockRefinery(Material.iron).setBlockName("dummy_block_refinery").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_titanium");
		dummy_port_refinery = new DummyBlockRefinery(Material.iron).setBlockName("dummy_port_refinery").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_titanium");
		dummy_block_pumpjack = new DummyBlockPumpjack(Material.iron).setBlockName("dummy_block_pumpjack").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_titanium");
		dummy_port_pumpjack = new DummyBlockPumpjack(Material.iron).setBlockName("dummy_port_pumpjack").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_titanium");
		dummy_block_turbofan = new DummyBlockTurbofan(Material.iron).setBlockName("dummy_block_turbofan").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_turbofan = new DummyBlockTurbofan(Material.iron).setBlockName("dummy_port_turbofan").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_ams_limiter = new DummyBlockAMSLimiter(Material.iron).setBlockName("dummy_block_ams_limiter").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_copper");
		dummy_port_ams_limiter = new DummyBlockAMSLimiter(Material.iron).setBlockName("dummy_port_ams_limiter").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_copper");
		dummy_block_ams_emitter = new DummyBlockAMSEmitter(Material.iron).setBlockName("dummy_block_ams_emitter").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_copper");
		dummy_port_ams_emitter = new DummyBlockAMSEmitter(Material.iron).setBlockName("dummy_port_ams_emitter").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_copper");
		dummy_block_ams_base = new DummyBlockAMSBase(Material.iron).setBlockName("dummy_block_ams_base").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_copper");
		dummy_port_ams_base = new DummyBlockAMSBase(Material.iron).setBlockName("dummy_port_ams_base").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_copper");
		dummy_block_radgen = new DummyBlockRadGen(Material.iron).setBlockName("dummy_block_radgen").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_radgen = new DummyBlockRadGen(Material.iron).setBlockName("dummy_port_radgen").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_reactor_small = new DummyBlockMachine(Material.iron, guiID_reactor_small, machine_reactor_small).setBlockName("dummy_block_reactor_small").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_reactor_small = new DummyBlockMachine(Material.iron, guiID_reactor_small, machine_reactor_small).setBlockName("dummy_port_reactor_small").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_vault = new DummyBlockVault(Material.iron).setBlockName("dummy_block_vault").setHardness(10.0F).setResistance(10000.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_blast = new DummyBlockBlast(Material.iron).setBlockName("dummy_block_blast").setHardness(10.0F).setResistance(10000.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_gascent = new DummyBlockMachine(Material.iron, guiID_gascent, machine_gascent).setBlockName("dummy_block_gascent").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_block_uf6 = new DummyBlockMachine(Material.iron, guiID_uf6_tank, machine_uf6_tank).setBlockName("dummy_block_uf6").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_titanium");
		dummy_block_puf6 = new DummyBlockMachine(Material.iron, guiID_puf6_tank, machine_puf6_tank).setBlockName("dummy_block_puf6").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_plate_compact_launcher = new DummyBlockMachine(Material.iron, guiID_compact_launcher, compact_launcher).setBounds(0, 16, 0, 16, 16, 16).setBlockName("dummy_plate_compact_launcher").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_compact_launcher = new DummyBlockMachine(Material.iron, guiID_compact_launcher, compact_launcher).setBlockName("dummy_port_compact_launcher").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_plate_launch_table = new DummyBlockMachine(Material.iron, guiID_launch_table, launch_table).setBounds(0, 16, 0, 16, 16, 16).setBlockName("dummy_plate_launch_table").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_port_launch_table = new DummyBlockMachine(Material.iron, guiID_launch_table, launch_table).setBlockName("dummy_port_launch_table").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		dummy_plate_cargo = new DummyBlockMachine(Material.iron, guiID_dock, sat_dock).setBounds(0, 0, 0, 16, 8, 16).setBlockName("dummy_plate_cargo").setHardness(5.0F).setResistance(10.0F).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":block_steel");
		
		ntm_dirt = new BlockNTMDirt().setBlockName("ntm_dirt").setHardness(0.5F).setStepSound(Block.soundTypeGravel).setCreativeTab(null).setBlockTextureName("dirt");

		pink_log = new BlockPinkLog().setBlockName("pink_log").setHardness(0.5F).setStepSound(Block.soundTypeWood).setCreativeTab(null);
		pink_planks = new BlockGeneric(Material.wood).setBlockName("pink_planks").setStepSound(Block.soundTypeWood).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":pink_planks");
		pink_slab = new BlockPinkSlab(false, Material.wood).setBlockName("pink_slab").setStepSound(Block.soundTypeWood).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":pink_planks");
		pink_double_slab = new BlockPinkSlab(true, Material.wood).setBlockName("pink_double_slab").setStepSound(Block.soundTypeWood).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":pink_planks");
		pink_stairs = new BlockPinkStairs(pink_planks, 0).setBlockName("pink_stairs").setStepSound(Block.soundTypeWood).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":pink_planks");
		
		ff = new BlockFF(Material.iron).setBlockName("ff").setHardness(0.5F).setStepSound(Block.soundTypeGravel).setCreativeTab(null).setBlockTextureName(RefStrings.MODID + ":code");
	}

	private static void registerBlock() {
		//Test
		GameRegistry.registerBlock(test_render, test_render.getUnlocalizedName());
		//GameRegistry.registerBlock(test_container, test_container.getUnlocalizedName());
		GameRegistry.registerBlock(test_bomb, test_bomb.getUnlocalizedName());
		GameRegistry.registerBlock(test_bomb_advanced, test_bomb_advanced.getUnlocalizedName());
		
		GameRegistry.registerBlock(test_nuke, test_nuke.getUnlocalizedName());
		
		GameRegistry.registerBlock(event_tester, event_tester.getUnlocalizedName());
		GameRegistry.registerBlock(rotation_tester, rotation_tester.getUnlocalizedName());
		GameRegistry.registerBlock(obj_tester, obj_tester.getUnlocalizedName());
		GameRegistry.registerBlock(test_ticker, test_ticker.getUnlocalizedName());
		GameRegistry.registerBlock(test_missile, test_missile.getUnlocalizedName());
		GameRegistry.registerBlock(test_core, test_core.getUnlocalizedName());
		GameRegistry.registerBlock(test_charge, test_charge.getUnlocalizedName());

		//Ores
		GameRegistry.registerBlock(ore_uranium, ore_uranium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_uranium_scorched, ore_uranium_scorched.getUnlocalizedName());
		GameRegistry.registerBlock(ore_thorium, ore_thorium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_titanium, ore_titanium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_sulfur, ore_sulfur.getUnlocalizedName());
		GameRegistry.registerBlock(ore_niter, ore_niter.getUnlocalizedName());
		GameRegistry.registerBlock(ore_copper, ore_copper.getUnlocalizedName());
		GameRegistry.registerBlock(ore_tungsten, ore_tungsten.getUnlocalizedName());
		GameRegistry.registerBlock(ore_aluminium, ore_aluminium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_fluorite, ore_fluorite.getUnlocalizedName());
		GameRegistry.registerBlock(ore_beryllium, ore_beryllium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_lead, ore_lead.getUnlocalizedName());
		GameRegistry.registerBlock(ore_oil, ItemBlockLore.class, ore_oil.getUnlocalizedName());
		GameRegistry.registerBlock(ore_oil_empty, ore_oil_empty.getUnlocalizedName());
		GameRegistry.registerBlock(ore_oil_sand, ore_oil_sand.getUnlocalizedName());
		GameRegistry.registerBlock(ore_lignite, ore_lignite.getUnlocalizedName());
		GameRegistry.registerBlock(ore_asbestos, ore_asbestos.getUnlocalizedName());
		GameRegistry.registerBlock(ore_schrabidium, ItemBlockLore.class, ore_schrabidium.getUnlocalizedName());
		
		//Rare Minerals
		GameRegistry.registerBlock(ore_australium, ItemOreBlock.class, ore_australium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_weidanium, ItemOreBlock.class, ore_weidanium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_reiium, ItemOreBlock.class, ore_reiium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_unobtainium, ItemOreBlock.class, ore_unobtainium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_daffergon, ItemOreBlock.class, ore_daffergon.getUnlocalizedName());
		GameRegistry.registerBlock(ore_verticium, ItemOreBlock.class, ore_verticium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_rare, ItemOreBlock.class, ore_rare.getUnlocalizedName());
		GameRegistry.registerBlock(ore_cinnebar, ore_cinnebar.getUnlocalizedName());
		
		//Stone clusters
		GameRegistry.registerBlock(cluster_iron, ItemBlockCluster.class, cluster_iron.getUnlocalizedName());
		GameRegistry.registerBlock(cluster_titanium, ItemBlockCluster.class, cluster_titanium.getUnlocalizedName());
		GameRegistry.registerBlock(cluster_aluminium, ItemBlockCluster.class, cluster_aluminium.getUnlocalizedName());
		
		//Nice Meme
		GameRegistry.registerBlock(ore_coal_oil, ore_coal_oil.getUnlocalizedName());
		GameRegistry.registerBlock(ore_coal_oil_burning, ore_coal_oil_burning.getUnlocalizedName());
		
		//Nether Ores
		GameRegistry.registerBlock(ore_nether_coal, ore_nether_coal.getUnlocalizedName());
		GameRegistry.registerBlock(ore_nether_smoldering, ore_nether_smoldering.getUnlocalizedName());
		GameRegistry.registerBlock(ore_nether_uranium, ore_nether_uranium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_nether_uranium_scorched, ore_nether_uranium_scorched.getUnlocalizedName());
		GameRegistry.registerBlock(ore_nether_plutonium, ore_nether_plutonium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_nether_tungsten, ore_nether_tungsten.getUnlocalizedName());
		GameRegistry.registerBlock(ore_nether_sulfur, ore_nether_sulfur.getUnlocalizedName());
		GameRegistry.registerBlock(ore_nether_fire, ore_nether_fire.getUnlocalizedName());
		GameRegistry.registerBlock(ore_nether_schrabidium, ItemBlockLore.class, ore_nether_schrabidium.getUnlocalizedName());
		
		//Meteor Ores
		GameRegistry.registerBlock(ore_meteor_uranium, ore_meteor_uranium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_meteor_thorium, ore_meteor_thorium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_meteor_titanium, ore_meteor_titanium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_meteor_sulfur, ore_meteor_sulfur.getUnlocalizedName());
		GameRegistry.registerBlock(ore_meteor_copper, ore_meteor_copper.getUnlocalizedName());
		GameRegistry.registerBlock(ore_meteor_tungsten, ore_meteor_tungsten.getUnlocalizedName());
		GameRegistry.registerBlock(ore_meteor_aluminium, ore_meteor_aluminium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_meteor_lead, ore_meteor_lead.getUnlocalizedName());
		GameRegistry.registerBlock(ore_meteor_lithium, ore_meteor_lithium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_meteor_starmetal, ore_meteor_starmetal.getUnlocalizedName());
		
		//Gneiss Ores
		GameRegistry.registerBlock(ore_gneiss_iron, ore_gneiss_iron.getUnlocalizedName());
		GameRegistry.registerBlock(ore_gneiss_gold, ore_gneiss_gold.getUnlocalizedName());
		GameRegistry.registerBlock(ore_gneiss_uranium, ore_gneiss_uranium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_gneiss_uranium_scorched, ore_gneiss_uranium_scorched.getUnlocalizedName());
		GameRegistry.registerBlock(ore_gneiss_copper, ore_gneiss_copper.getUnlocalizedName());
		GameRegistry.registerBlock(ore_gneiss_asbestos, ore_gneiss_asbestos.getUnlocalizedName());
		GameRegistry.registerBlock(ore_gneiss_lithium, ore_gneiss_lithium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_gneiss_schrabidium, ItemBlockLore.class, ore_gneiss_schrabidium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_gneiss_rare, ItemOreBlock.class, ore_gneiss_rare.getUnlocalizedName());
		GameRegistry.registerBlock(ore_gneiss_gas, ore_gneiss_gas.getUnlocalizedName());
		
		//Depth ores
		GameRegistry.registerBlock(ore_depth_cinnebar, ItemBlockDepth.class, ore_depth_cinnebar.getUnlocalizedName());
		GameRegistry.registerBlock(ore_depth_zirconium, ItemBlockDepth.class, ore_depth_zirconium.getUnlocalizedName());
		GameRegistry.registerBlock(cluster_depth_iron, ItemBlockDepth.class, cluster_depth_iron.getUnlocalizedName());
		GameRegistry.registerBlock(cluster_depth_titanium, ItemBlockDepth.class, cluster_depth_titanium.getUnlocalizedName());
		GameRegistry.registerBlock(cluster_depth_tungsten, ItemBlockDepth.class, cluster_depth_tungsten.getUnlocalizedName());
		
		//End Ores
		GameRegistry.registerBlock(ore_tikite, ore_tikite.getUnlocalizedName());
		
		//Stone Variants
		GameRegistry.registerBlock(stone_gneiss, stone_gneiss.getUnlocalizedName());
		GameRegistry.registerBlock(stone_depth, ItemBlockDepth.class, stone_depth.getUnlocalizedName());
		
		//Blocks
		GameRegistry.registerBlock(block_uranium, ItemBlockHazard.class, block_uranium.getUnlocalizedName());
		GameRegistry.registerBlock(block_u233, ItemBlockHazard.class, block_u233.getUnlocalizedName());
		GameRegistry.registerBlock(block_u235, ItemBlockHazard.class, block_u235.getUnlocalizedName());
		GameRegistry.registerBlock(block_u238, ItemBlockHazard.class, block_u238.getUnlocalizedName());
		GameRegistry.registerBlock(block_uranium_fuel, ItemBlockHazard.class, block_uranium_fuel.getUnlocalizedName());
		GameRegistry.registerBlock(block_neptunium, ItemBlockHazard.class, block_neptunium.getUnlocalizedName());
		GameRegistry.registerBlock(block_polonium, ItemBlockHazard.class, block_polonium.getUnlocalizedName());
		GameRegistry.registerBlock(block_mox_fuel, ItemBlockHazard.class, block_mox_fuel.getUnlocalizedName());
		GameRegistry.registerBlock(block_plutonium, ItemBlockHazard.class, block_plutonium.getUnlocalizedName());
		GameRegistry.registerBlock(block_pu238, ItemBlockHazard.class, block_pu238.getUnlocalizedName());
		GameRegistry.registerBlock(block_pu239, ItemBlockHazard.class, block_pu239.getUnlocalizedName());
		GameRegistry.registerBlock(block_pu240, ItemBlockHazard.class, block_pu240.getUnlocalizedName());
		GameRegistry.registerBlock(block_pu_mix, ItemBlockHazard.class, block_pu_mix.getUnlocalizedName());
		GameRegistry.registerBlock(block_plutonium_fuel, ItemBlockHazard.class, block_plutonium_fuel.getUnlocalizedName());
		GameRegistry.registerBlock(block_thorium, ItemBlockHazard.class, block_thorium.getUnlocalizedName());
		GameRegistry.registerBlock(block_thorium_fuel, ItemBlockHazard.class, block_thorium_fuel.getUnlocalizedName());
		GameRegistry.registerBlock(block_titanium, block_titanium.getUnlocalizedName());
		GameRegistry.registerBlock(block_sulfur, block_sulfur.getUnlocalizedName());
		GameRegistry.registerBlock(block_niter, block_niter.getUnlocalizedName());
		GameRegistry.registerBlock(block_copper, block_copper.getUnlocalizedName());
		GameRegistry.registerBlock(block_red_copper, block_red_copper.getUnlocalizedName());
		GameRegistry.registerBlock(block_advanced_alloy, block_advanced_alloy.getUnlocalizedName());
		GameRegistry.registerBlock(block_tungsten, block_tungsten.getUnlocalizedName());
		GameRegistry.registerBlock(block_aluminium, block_aluminium.getUnlocalizedName());
		GameRegistry.registerBlock(block_fluorite, block_fluorite.getUnlocalizedName());
		GameRegistry.registerBlock(block_beryllium, block_beryllium.getUnlocalizedName());
		GameRegistry.registerBlock(block_cobalt, block_cobalt.getUnlocalizedName());
		GameRegistry.registerBlock(block_steel, block_steel.getUnlocalizedName());
		GameRegistry.registerBlock(block_lead, block_lead.getUnlocalizedName());
		GameRegistry.registerBlock(block_lithium, ItemBlockHazard.class, block_lithium.getUnlocalizedName());
		GameRegistry.registerBlock(block_zirconium, block_zirconium.getUnlocalizedName());
		GameRegistry.registerBlock(block_white_phosphorus, ItemBlockHazard.class, block_white_phosphorus.getUnlocalizedName());
		GameRegistry.registerBlock(block_red_phosphorus, ItemBlockHazard.class, block_red_phosphorus.getUnlocalizedName());
		GameRegistry.registerBlock(block_yellowcake, ItemBlockHazard.class, block_yellowcake.getUnlocalizedName());
		GameRegistry.registerBlock(block_scrap, block_scrap.getUnlocalizedName());
		GameRegistry.registerBlock(block_electrical_scrap, block_electrical_scrap.getUnlocalizedName());
		GameRegistry.registerBlock(block_fallout, ItemBlockHazard.class, block_fallout.getUnlocalizedName());
		GameRegistry.registerBlock(block_foam, block_foam.getUnlocalizedName());
		GameRegistry.registerBlock(block_graphite, block_graphite.getUnlocalizedName());
		GameRegistry.registerBlock(block_boron, block_boron.getUnlocalizedName());
		GameRegistry.registerBlock(block_insulator, block_insulator.getUnlocalizedName());
		GameRegistry.registerBlock(block_fiberglass, block_fiberglass.getUnlocalizedName());
		GameRegistry.registerBlock(block_asbestos, ItemBlockHazard.class, block_asbestos.getUnlocalizedName());
		GameRegistry.registerBlock(block_trinitite, ItemBlockHazard.class, block_trinitite.getUnlocalizedName());
		GameRegistry.registerBlock(block_waste, ItemBlockHazard.class, block_waste.getUnlocalizedName());
		GameRegistry.registerBlock(block_waste_painted, ItemBlockHazard.class, block_waste_painted.getUnlocalizedName());
		GameRegistry.registerBlock(ancient_scrap, ItemBlockHazard.class, ancient_scrap.getUnlocalizedName());
		GameRegistry.registerBlock(block_corium, ItemBlockHazard.class, block_corium.getUnlocalizedName());
		GameRegistry.registerBlock(block_schraranium, ItemBlockSchrabidium.class, block_schraranium.getUnlocalizedName());
		GameRegistry.registerBlock(block_schrabidium, ItemBlockSchrabidium.class, block_schrabidium.getUnlocalizedName());
		GameRegistry.registerBlock(block_schrabidate, ItemBlockSchrabidium.class, block_schrabidate.getUnlocalizedName());
		GameRegistry.registerBlock(block_solinium, ItemBlockSchrabidium.class, block_solinium.getUnlocalizedName());
		GameRegistry.registerBlock(block_schrabidium_fuel, ItemBlockSchrabidium.class, block_schrabidium_fuel.getUnlocalizedName());
		GameRegistry.registerBlock(block_euphemium, ItemBlockLore.class, block_euphemium.getUnlocalizedName());
		GameRegistry.registerBlock(block_schrabidium_cluster, ItemBlockSchrabidium.class, block_schrabidium_cluster.getUnlocalizedName());
		GameRegistry.registerBlock(block_euphemium_cluster, ItemBlockLore.class, block_euphemium_cluster.getUnlocalizedName());
		GameRegistry.registerBlock(block_dineutronium, block_dineutronium.getUnlocalizedName());
		GameRegistry.registerBlock(block_magnetized_tungsten, block_magnetized_tungsten.getUnlocalizedName());
		GameRegistry.registerBlock(block_combine_steel, block_combine_steel.getUnlocalizedName());
		GameRegistry.registerBlock(block_desh, block_desh.getUnlocalizedName());
		GameRegistry.registerBlock(block_dura_steel, block_dura_steel.getUnlocalizedName());
		GameRegistry.registerBlock(block_starmetal, block_starmetal.getUnlocalizedName());
		GameRegistry.registerBlock(block_australium, ItemOreBlock.class, block_australium.getUnlocalizedName());
		GameRegistry.registerBlock(block_weidanium, ItemOreBlock.class, block_weidanium.getUnlocalizedName());
		GameRegistry.registerBlock(block_reiium, ItemOreBlock.class, block_reiium.getUnlocalizedName());
		GameRegistry.registerBlock(block_unobtainium, ItemOreBlock.class, block_unobtainium.getUnlocalizedName());
		GameRegistry.registerBlock(block_daffergon, ItemOreBlock.class, block_daffergon.getUnlocalizedName());
		GameRegistry.registerBlock(block_verticium, ItemOreBlock.class, block_verticium.getUnlocalizedName());
		GameRegistry.registerBlock(block_lanthanium, block_lanthanium.getUnlocalizedName());
		GameRegistry.registerBlock(block_actinium, block_actinium.getUnlocalizedName());
		GameRegistry.registerBlock(block_tritium, block_tritium.getUnlocalizedName());

		//Bottlecap Blocks
		GameRegistry.registerBlock(block_cap_nuka, block_cap_nuka.getUnlocalizedName());
		GameRegistry.registerBlock(block_cap_quantum, block_cap_quantum.getUnlocalizedName());
		GameRegistry.registerBlock(block_cap_rad, block_cap_rad.getUnlocalizedName());
		GameRegistry.registerBlock(block_cap_sparkle, block_cap_sparkle.getUnlocalizedName());
		GameRegistry.registerBlock(block_cap_korl, block_cap_korl.getUnlocalizedName());
		GameRegistry.registerBlock(block_cap_fritz, block_cap_fritz.getUnlocalizedName());
		GameRegistry.registerBlock(block_cap_sunset, block_cap_sunset.getUnlocalizedName());
		GameRegistry.registerBlock(block_cap_star, block_cap_star.getUnlocalizedName());
		
		//Deco Blocks
		GameRegistry.registerBlock(deco_titanium, deco_titanium.getUnlocalizedName());
		GameRegistry.registerBlock(deco_red_copper, deco_red_copper.getUnlocalizedName());
		GameRegistry.registerBlock(deco_tungsten, deco_tungsten.getUnlocalizedName());
		GameRegistry.registerBlock(deco_aluminium, deco_aluminium.getUnlocalizedName());
		GameRegistry.registerBlock(deco_steel, deco_steel.getUnlocalizedName());
		GameRegistry.registerBlock(deco_lead, deco_lead.getUnlocalizedName());
		GameRegistry.registerBlock(deco_beryllium, deco_beryllium.getUnlocalizedName());
		GameRegistry.registerBlock(deco_asbestos, deco_asbestos.getUnlocalizedName());
		GameRegistry.registerBlock(hazmat, hazmat.getUnlocalizedName());
		
		//Gravel
		GameRegistry.registerBlock(gravel_obsidian, gravel_obsidian.getUnlocalizedName());
		GameRegistry.registerBlock(gravel_diamond, ItemBlockLore.class, gravel_diamond.getUnlocalizedName());
		
		//Lamps
		GameRegistry.registerBlock(lamp_tritium_green_off, lamp_tritium_green_off.getUnlocalizedName());
		GameRegistry.registerBlock(lamp_tritium_green_on, lamp_tritium_green_on.getUnlocalizedName());
		GameRegistry.registerBlock(lamp_tritium_blue_off, lamp_tritium_blue_off.getUnlocalizedName());
		GameRegistry.registerBlock(lamp_tritium_blue_on, lamp_tritium_blue_on.getUnlocalizedName());
		GameRegistry.registerBlock(lamp_demon, ItemBlockHazard.class, lamp_demon.getUnlocalizedName());

		//Reinforced Blocks
		GameRegistry.registerBlock(asphalt, asphalt.getUnlocalizedName());
		GameRegistry.registerBlock(asphalt_light, asphalt_light.getUnlocalizedName());
		GameRegistry.registerBlock(reinforced_brick, reinforced_brick.getUnlocalizedName());
		GameRegistry.registerBlock(reinforced_glass, reinforced_glass.getUnlocalizedName());
		GameRegistry.registerBlock(reinforced_light, reinforced_light.getUnlocalizedName());
		GameRegistry.registerBlock(reinforced_sand, reinforced_sand.getUnlocalizedName());
		GameRegistry.registerBlock(reinforced_lamp_off, reinforced_lamp_off.getUnlocalizedName());
		GameRegistry.registerBlock(reinforced_lamp_on, reinforced_lamp_on.getUnlocalizedName());

		//Bricks
		GameRegistry.registerBlock(reinforced_stone, reinforced_stone.getUnlocalizedName());
		GameRegistry.registerBlock(concrete_smooth, concrete_smooth.getUnlocalizedName());
		GameRegistry.registerBlock(concrete_colored, ItemBlockColored.class, concrete_colored.getUnlocalizedName());
		GameRegistry.registerBlock(concrete, concrete.getUnlocalizedName());
		GameRegistry.registerBlock(concrete_asbestos, concrete_asbestos.getUnlocalizedName());
		GameRegistry.registerBlock(concrete_pillar, concrete_pillar.getUnlocalizedName());
		GameRegistry.registerBlock(brick_concrete, brick_concrete.getUnlocalizedName());
		GameRegistry.registerBlock(brick_concrete_mossy, brick_concrete_mossy.getUnlocalizedName());
		GameRegistry.registerBlock(brick_concrete_cracked, brick_concrete_cracked.getUnlocalizedName());
		GameRegistry.registerBlock(brick_concrete_broken, brick_concrete_broken.getUnlocalizedName());
		GameRegistry.registerBlock(brick_concrete_marked, brick_concrete_marked.getUnlocalizedName());
		GameRegistry.registerBlock(brick_obsidian, brick_obsidian.getUnlocalizedName());
		GameRegistry.registerBlock(brick_compound, brick_compound.getUnlocalizedName());
		GameRegistry.registerBlock(brick_light, brick_light.getUnlocalizedName());
		GameRegistry.registerBlock(brick_asbestos, ItemBlockHazard.class, brick_asbestos.getUnlocalizedName());
		
		//CMB Building Elements
		GameRegistry.registerBlock(cmb_brick, cmb_brick.getUnlocalizedName());
		GameRegistry.registerBlock(cmb_brick_reinforced, cmb_brick_reinforced.getUnlocalizedName());
		
		//Tiles
		GameRegistry.registerBlock(tile_lab, ItemBlockHazard.class, tile_lab.getUnlocalizedName());
		GameRegistry.registerBlock(tile_lab_cracked, ItemBlockHazard.class, tile_lab_cracked.getUnlocalizedName());
		GameRegistry.registerBlock(tile_lab_broken, ItemBlockHazard.class, tile_lab_broken.getUnlocalizedName());
		
		//Other defensive stuff
		GameRegistry.registerBlock(barbed_wire, barbed_wire.getUnlocalizedName());
		GameRegistry.registerBlock(barbed_wire_fire, barbed_wire_fire.getUnlocalizedName());
		GameRegistry.registerBlock(barbed_wire_poison, barbed_wire_poison.getUnlocalizedName());
		GameRegistry.registerBlock(barbed_wire_acid, barbed_wire_acid.getUnlocalizedName());
		GameRegistry.registerBlock(barbed_wire_wither, barbed_wire_wither.getUnlocalizedName());
		GameRegistry.registerBlock(barbed_wire_ultradeath, barbed_wire_ultradeath.getUnlocalizedName());
		GameRegistry.registerBlock(spikes, spikes.getUnlocalizedName());
		GameRegistry.registerBlock(tesla, tesla.getUnlocalizedName());
		
		//Decoration Blocks
		GameRegistry.registerBlock(block_meteor, block_meteor.getUnlocalizedName());
		GameRegistry.registerBlock(block_meteor_cobble, block_meteor_cobble.getUnlocalizedName());
		GameRegistry.registerBlock(block_meteor_broken, block_meteor_broken.getUnlocalizedName());
		GameRegistry.registerBlock(block_meteor_molten, block_meteor_molten.getUnlocalizedName());
		GameRegistry.registerBlock(block_meteor_treasure, block_meteor_treasure.getUnlocalizedName());
		GameRegistry.registerBlock(meteor_polished, meteor_polished.getUnlocalizedName());
		GameRegistry.registerBlock(meteor_brick, meteor_brick.getUnlocalizedName());
		GameRegistry.registerBlock(meteor_brick_mossy, meteor_brick_mossy.getUnlocalizedName());
		GameRegistry.registerBlock(meteor_brick_cracked, meteor_brick_cracked.getUnlocalizedName());
		GameRegistry.registerBlock(meteor_brick_chiseled, meteor_brick_chiseled.getUnlocalizedName());
		GameRegistry.registerBlock(meteor_pillar, meteor_pillar.getUnlocalizedName());
		GameRegistry.registerBlock(meteor_spawner, meteor_spawner.getUnlocalizedName());
		GameRegistry.registerBlock(meteor_battery, ItemBlockLore.class, meteor_battery.getUnlocalizedName());
		GameRegistry.registerBlock(brick_jungle, brick_jungle.getUnlocalizedName());
		GameRegistry.registerBlock(brick_jungle_cracked, brick_jungle_cracked.getUnlocalizedName());
		GameRegistry.registerBlock(brick_jungle_fragile, brick_jungle_fragile.getUnlocalizedName());
		GameRegistry.registerBlock(brick_jungle_lava, brick_jungle_lava.getUnlocalizedName());
		GameRegistry.registerBlock(brick_jungle_ooze, brick_jungle_ooze.getUnlocalizedName());
		GameRegistry.registerBlock(brick_jungle_mystic, brick_jungle_mystic.getUnlocalizedName());
		GameRegistry.registerBlock(brick_jungle_trap, ItemTrapBlock.class, brick_jungle_trap.getUnlocalizedName());
		GameRegistry.registerBlock(brick_jungle_glyph, ItemGlyphBlock.class, brick_jungle_glyph.getUnlocalizedName());
		GameRegistry.registerBlock(brick_jungle_circle, brick_jungle_circle.getUnlocalizedName());
		GameRegistry.registerBlock(brick_dungeon, brick_dungeon.getUnlocalizedName());
		GameRegistry.registerBlock(brick_dungeon_flat, brick_dungeon_flat.getUnlocalizedName());
		GameRegistry.registerBlock(brick_dungeon_tile, brick_dungeon_tile.getUnlocalizedName());
		GameRegistry.registerBlock(brick_dungeon_circle, brick_dungeon_circle.getUnlocalizedName());
		GameRegistry.registerBlock(tape_recorder, tape_recorder.getUnlocalizedName());
		GameRegistry.registerBlock(steel_poles, steel_poles.getUnlocalizedName());
		GameRegistry.registerBlock(pole_top, pole_top.getUnlocalizedName());
		GameRegistry.registerBlock(pole_satellite_receiver, pole_satellite_receiver.getUnlocalizedName());
		GameRegistry.registerBlock(steel_wall, steel_wall.getUnlocalizedName());
		GameRegistry.registerBlock(steel_corner, steel_corner.getUnlocalizedName());
		GameRegistry.registerBlock(steel_roof, steel_roof.getUnlocalizedName());
		GameRegistry.registerBlock(steel_beam, steel_beam.getUnlocalizedName());
		GameRegistry.registerBlock(steel_scaffold, steel_scaffold.getUnlocalizedName());
		GameRegistry.registerBlock(steel_grate, steel_grate.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe, ItemBlockDecoPipe.class, deco_pipe.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_rusted, ItemBlockDecoPipe.class, deco_pipe_rusted.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_green, ItemBlockDecoPipe.class, deco_pipe_green.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_green_rusted, ItemBlockDecoPipe.class, deco_pipe_green_rusted.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_red, ItemBlockDecoPipe.class, deco_pipe_red.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_marked, ItemBlockDecoPipe.class, deco_pipe_marked.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_rim, ItemBlockDecoPipe.class, deco_pipe_rim.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_rim_rusted, ItemBlockDecoPipe.class, deco_pipe_rim_rusted.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_rim_green, ItemBlockDecoPipe.class, deco_pipe_rim_green.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_rim_green_rusted, ItemBlockDecoPipe.class, deco_pipe_rim_green_rusted.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_rim_red, ItemBlockDecoPipe.class, deco_pipe_rim_red.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_rim_marked, ItemBlockDecoPipe.class, deco_pipe_rim_marked.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_framed, ItemBlockDecoPipe.class, deco_pipe_framed.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_framed_rusted, ItemBlockDecoPipe.class, deco_pipe_framed_rusted.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_framed_green, ItemBlockDecoPipe.class, deco_pipe_framed_green.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_framed_green_rusted, ItemBlockDecoPipe.class, deco_pipe_framed_green_rusted.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_framed_red, ItemBlockDecoPipe.class, deco_pipe_framed_red.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_framed_marked, ItemBlockDecoPipe.class, deco_pipe_framed_marked.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_quad, ItemBlockDecoPipe.class, deco_pipe_quad.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_quad_rusted, ItemBlockDecoPipe.class, deco_pipe_quad_rusted.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_quad_green, ItemBlockDecoPipe.class, deco_pipe_quad_green.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_quad_green_rusted, ItemBlockDecoPipe.class, deco_pipe_quad_green_rusted.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_quad_red, ItemBlockDecoPipe.class, deco_pipe_quad_red.getUnlocalizedName());
		GameRegistry.registerBlock(deco_pipe_quad_marked, ItemBlockDecoPipe.class, deco_pipe_quad_marked.getUnlocalizedName());
		GameRegistry.registerBlock(mush, mush.getUnlocalizedName());
		GameRegistry.registerBlock(mush_block, mush_block.getUnlocalizedName());
		GameRegistry.registerBlock(mush_block_stem, mush_block_stem.getUnlocalizedName());
		
		//Nuclear Waste
		GameRegistry.registerBlock(waste_earth, waste_earth.getUnlocalizedName());
		GameRegistry.registerBlock(waste_mycelium, waste_mycelium.getUnlocalizedName());
		GameRegistry.registerBlock(waste_trinitite, waste_trinitite.getUnlocalizedName());
		GameRegistry.registerBlock(waste_trinitite_red, waste_trinitite_red.getUnlocalizedName());
		GameRegistry.registerBlock(waste_log, waste_log.getUnlocalizedName());
		GameRegistry.registerBlock(waste_planks, waste_planks.getUnlocalizedName());
		GameRegistry.registerBlock(frozen_grass, frozen_grass.getUnlocalizedName());
		GameRegistry.registerBlock(frozen_dirt, frozen_dirt.getUnlocalizedName());
		GameRegistry.registerBlock(frozen_log, frozen_log.getUnlocalizedName());
		GameRegistry.registerBlock(frozen_planks, frozen_planks.getUnlocalizedName());
		GameRegistry.registerBlock(fallout, ItemBlockHazard.class, fallout.getUnlocalizedName());
		GameRegistry.registerBlock(foam_layer, foam_layer.getUnlocalizedName());
		GameRegistry.registerBlock(sand_boron_layer, sand_boron_layer.getUnlocalizedName());
		
		//RAD
		GameRegistry.registerBlock(sellafield_slaked, sellafield_slaked.getUnlocalizedName());
		GameRegistry.registerBlock(sellafield_0, ItemBlockHazard.class, sellafield_0.getUnlocalizedName());
		GameRegistry.registerBlock(sellafield_1, ItemBlockHazard.class, sellafield_1.getUnlocalizedName());
		GameRegistry.registerBlock(sellafield_2, ItemBlockHazard.class, sellafield_2.getUnlocalizedName());
		GameRegistry.registerBlock(sellafield_3, ItemBlockHazard.class, sellafield_3.getUnlocalizedName());
		GameRegistry.registerBlock(sellafield_4, ItemBlockHazard.class, sellafield_4.getUnlocalizedName());
		GameRegistry.registerBlock(sellafield_core, ItemBlockHazard.class, sellafield_core.getUnlocalizedName());

		//Geysirs
		GameRegistry.registerBlock(geysir_water, geysir_water.getUnlocalizedName());
		GameRegistry.registerBlock(geysir_chlorine, geysir_chlorine.getUnlocalizedName());
		GameRegistry.registerBlock(geysir_vapor, geysir_vapor.getUnlocalizedName());
		GameRegistry.registerBlock(geysir_nether, geysir_nether.getUnlocalizedName());

		//Nukes
		GameRegistry.registerBlock(nuke_gadget, nuke_gadget.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_boy, nuke_boy.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_man, nuke_man.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_mike, nuke_mike.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_tsar, nuke_tsar.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_prototype, ItemPrototypeBlock.class, nuke_prototype.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_fleija, nuke_fleija.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_solinium, nuke_solinium.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_n2, nuke_n2.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_n45, nuke_n45.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_fstbmb, ItemBlockHazard.class, nuke_fstbmb.getUnlocalizedName());
		GameRegistry.registerBlock(nuke_custom, nuke_custom.getUnlocalizedName());
		
		//Generic Bombs
		GameRegistry.registerBlock(bomb_multi, bomb_multi.getUnlocalizedName());
		GameRegistry.registerBlock(crashed_balefire, crashed_balefire.getUnlocalizedName());
		GameRegistry.registerBlock(fireworks, fireworks.getUnlocalizedName());
		//GameRegistry.registerBlock(bomb_multi_large, bomb_multi_large.getUnlocalizedName());
		
		//Turrets
		GameRegistry.registerBlock(turret_light, turret_light.getUnlocalizedName());
		GameRegistry.registerBlock(turret_heavy, turret_heavy.getUnlocalizedName());
		GameRegistry.registerBlock(turret_rocket, turret_rocket.getUnlocalizedName());
		GameRegistry.registerBlock(turret_flamer, turret_flamer.getUnlocalizedName());
		GameRegistry.registerBlock(turret_tau, turret_tau.getUnlocalizedName());
		GameRegistry.registerBlock(turret_spitfire, turret_spitfire.getUnlocalizedName());
		GameRegistry.registerBlock(turret_cwis, ItemBlockLore.class, turret_cwis.getUnlocalizedName());
		GameRegistry.registerBlock(turret_cheapo, turret_cheapo.getUnlocalizedName());
		GameRegistry.registerBlock(turret_chekhov, turret_chekhov.getUnlocalizedName());
		GameRegistry.registerBlock(turret_friendly, turret_friendly.getUnlocalizedName());
		GameRegistry.registerBlock(turret_jeremy, turret_jeremy.getUnlocalizedName());
		GameRegistry.registerBlock(turret_tauon, turret_tauon.getUnlocalizedName());
		GameRegistry.registerBlock(turret_richard, turret_richard.getUnlocalizedName());
		GameRegistry.registerBlock(turret_howard, turret_howard.getUnlocalizedName());
		
		//Mines
		GameRegistry.registerBlock(mine_ap, mine_ap.getUnlocalizedName());
		GameRegistry.registerBlock(mine_he, mine_he.getUnlocalizedName());
		GameRegistry.registerBlock(mine_shrap, mine_shrap.getUnlocalizedName());
		GameRegistry.registerBlock(mine_fat, mine_fat.getUnlocalizedName());
		
		//Wot
		GameRegistry.registerBlock(cel_prime, cel_prime.getUnlocalizedName());
		GameRegistry.registerBlock(cel_prime_terminal, cel_prime_terminal.getUnlocalizedName());
		GameRegistry.registerBlock(cel_prime_battery, cel_prime_battery.getUnlocalizedName());
		GameRegistry.registerBlock(cel_prime_port, cel_prime_port.getUnlocalizedName());
		GameRegistry.registerBlock(cel_prime_tanks, cel_prime_tanks.getUnlocalizedName());
		
		//Block Bombs
		GameRegistry.registerBlock(flame_war, flame_war.getUnlocalizedName());
		GameRegistry.registerBlock(float_bomb, float_bomb.getUnlocalizedName());
		GameRegistry.registerBlock(therm_endo, therm_endo.getUnlocalizedName());
		GameRegistry.registerBlock(therm_exo, therm_exo.getUnlocalizedName());
		GameRegistry.registerBlock(emp_bomb, emp_bomb.getUnlocalizedName());
		//GameRegistry.registerBlock(rejuvinator, rejuvinator.getUnlocalizedName());
		GameRegistry.registerBlock(det_cord, det_cord.getUnlocalizedName());
		GameRegistry.registerBlock(det_charge, det_charge.getUnlocalizedName());
		GameRegistry.registerBlock(det_nuke, det_nuke.getUnlocalizedName());
		GameRegistry.registerBlock(det_miner, det_miner.getUnlocalizedName());
		GameRegistry.registerBlock(red_barrel, ItemBlockLore.class, red_barrel.getUnlocalizedName());
		GameRegistry.registerBlock(pink_barrel, ItemBlockLore.class, pink_barrel.getUnlocalizedName());
		GameRegistry.registerBlock(lox_barrel, ItemBlockLore.class, lox_barrel.getUnlocalizedName());
		GameRegistry.registerBlock(taint_barrel, taint_barrel.getUnlocalizedName());
		GameRegistry.registerBlock(yellow_barrel, yellow_barrel.getUnlocalizedName());
		GameRegistry.registerBlock(vitrified_barrel, vitrified_barrel.getUnlocalizedName());
		
		//Siren
		GameRegistry.registerBlock(machine_siren, machine_siren.getUnlocalizedName());
		
		//This Thing
		GameRegistry.registerBlock(broadcaster_pc, broadcaster_pc.getUnlocalizedName());
		
		//Geiger Counter
		GameRegistry.registerBlock(geiger, geiger.getUnlocalizedName());
		
		//HEV Battery
		GameRegistry.registerBlock(hev_battery, hev_battery.getUnlocalizedName());
		
		//Chainlink Fence
		GameRegistry.registerBlock(fence_metal, fence_metal.getUnlocalizedName());
		
		//Sands, Glass
		GameRegistry.registerBlock(sand_boron, sand_boron.getUnlocalizedName());
		GameRegistry.registerBlock(sand_uranium, sand_uranium.getUnlocalizedName());
		GameRegistry.registerBlock(sand_polonium, sand_polonium.getUnlocalizedName());
		GameRegistry.registerBlock(glass_boron, glass_boron.getUnlocalizedName());
		GameRegistry.registerBlock(glass_uranium, glass_uranium.getUnlocalizedName());
		GameRegistry.registerBlock(glass_trinitite, glass_trinitite.getUnlocalizedName());
		GameRegistry.registerBlock(glass_polonium, glass_polonium.getUnlocalizedName());
		
		//Silo Hatch
		GameRegistry.registerBlock(seal_frame, seal_frame.getUnlocalizedName());
		GameRegistry.registerBlock(seal_controller, seal_controller.getUnlocalizedName());
		GameRegistry.registerBlock(seal_hatch, seal_hatch.getUnlocalizedName());
		
		//Vault Door
		GameRegistry.registerBlock(vault_door, vault_door.getUnlocalizedName());
		GameRegistry.registerBlock(blast_door, blast_door.getUnlocalizedName());
		
		//Doors
		GameRegistry.registerBlock(door_metal, door_metal.getUnlocalizedName());
		GameRegistry.registerBlock(door_office, door_office.getUnlocalizedName());
		GameRegistry.registerBlock(door_bunker, door_bunker.getUnlocalizedName());
		
		//Crates
		GameRegistry.registerBlock(crate_iron, crate_iron.getUnlocalizedName());
		GameRegistry.registerBlock(crate_steel, crate_steel.getUnlocalizedName());
		GameRegistry.registerBlock(crate_tungsten, crate_tungsten.getUnlocalizedName());
		GameRegistry.registerBlock(safe, safe.getUnlocalizedName());
		
		//Junk
		GameRegistry.registerBlock(boxcar, boxcar.getUnlocalizedName());
		GameRegistry.registerBlock(boat, boat.getUnlocalizedName());
		GameRegistry.registerBlock(bomber, bomber.getUnlocalizedName());
		
		//Machines
		GameRegistry.registerBlock(machine_press, machine_press.getUnlocalizedName());
		GameRegistry.registerBlock(machine_epress, machine_epress.getUnlocalizedName());
		GameRegistry.registerBlock(machine_difurnace_off, machine_difurnace_off.getUnlocalizedName());
		GameRegistry.registerBlock(machine_difurnace_on, machine_difurnace_on.getUnlocalizedName());
		GameRegistry.registerBlock(machine_centrifuge, machine_centrifuge.getUnlocalizedName());
		GameRegistry.registerBlock(machine_gascent, machine_gascent.getUnlocalizedName());
		GameRegistry.registerBlock(machine_fel, machine_fel.getUnlocalizedName());
		GameRegistry.registerBlock(machine_silex, machine_silex.getUnlocalizedName());
		GameRegistry.registerBlock(machine_crystallizer, machine_crystallizer.getUnlocalizedName());
		GameRegistry.registerBlock(machine_uf6_tank, machine_uf6_tank.getUnlocalizedName());
		GameRegistry.registerBlock(machine_puf6_tank, machine_puf6_tank.getUnlocalizedName());
		GameRegistry.registerBlock(machine_reactor, machine_reactor.getUnlocalizedName());
		//GameRegistry.registerBlock(machine_reactor_on, machine_reactor_on.getUnlocalizedName());
		GameRegistry.registerBlock(machine_nuke_furnace_off, machine_nuke_furnace_off.getUnlocalizedName());
		GameRegistry.registerBlock(machine_nuke_furnace_on, machine_nuke_furnace_on.getUnlocalizedName());
		GameRegistry.registerBlock(machine_rtg_furnace_off, machine_rtg_furnace_off.getUnlocalizedName());
		GameRegistry.registerBlock(machine_rtg_furnace_on, machine_rtg_furnace_on.getUnlocalizedName());
		GameRegistry.registerBlock(machine_coal_off, machine_coal_off.getUnlocalizedName());
		GameRegistry.registerBlock(machine_coal_on, machine_coal_on.getUnlocalizedName());
		GameRegistry.registerBlock(machine_diesel, machine_diesel.getUnlocalizedName());
		GameRegistry.registerBlock(machine_selenium, machine_selenium.getUnlocalizedName());
		GameRegistry.registerBlock(machine_generator, machine_generator.getUnlocalizedName());
		GameRegistry.registerBlock(machine_controller, machine_controller.getUnlocalizedName());
		GameRegistry.registerBlock(machine_reactor_small, machine_reactor_small.getUnlocalizedName());
		GameRegistry.registerBlock(machine_industrial_generator, machine_industrial_generator.getUnlocalizedName());
		GameRegistry.registerBlock(machine_radgen, machine_radgen.getUnlocalizedName());
		GameRegistry.registerBlock(machine_cyclotron, machine_cyclotron.getUnlocalizedName());
		GameRegistry.registerBlock(machine_rtg_grey, machine_rtg_grey.getUnlocalizedName());
		GameRegistry.registerBlock(machine_geo, machine_geo.getUnlocalizedName());
		GameRegistry.registerBlock(machine_amgen, machine_amgen.getUnlocalizedName());
		GameRegistry.registerBlock(machine_minirtg, machine_minirtg.getUnlocalizedName());
		GameRegistry.registerBlock(machine_powerrtg, machine_powerrtg.getUnlocalizedName());
		GameRegistry.registerBlock(machine_spp_bottom, machine_spp_bottom.getUnlocalizedName());
		GameRegistry.registerBlock(machine_spp_top, machine_spp_top.getUnlocalizedName());

		GameRegistry.registerBlock(hadron_plating, hadron_plating.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_plating_blue, hadron_plating_blue.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_plating_black, hadron_plating_black.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_plating_yellow, hadron_plating_yellow.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_plating_striped, hadron_plating_striped.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_plating_glass, hadron_plating_glass.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_plating_voltz, hadron_plating_voltz.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_coil_alloy, ItemHadronCoil.class, hadron_coil_alloy.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_coil_gold, ItemHadronCoil.class, hadron_coil_gold.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_coil_neodymium, ItemHadronCoil.class, hadron_coil_neodymium.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_coil_magtung, ItemHadronCoil.class, hadron_coil_magtung.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_coil_schrabidium, ItemHadronCoil.class, hadron_coil_schrabidium.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_coil_schrabidate, ItemHadronCoil.class, hadron_coil_schrabidate.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_coil_starmetal, ItemHadronCoil.class, hadron_coil_starmetal.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_coil_chlorophyte, ItemHadronCoil.class, hadron_coil_chlorophyte.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_coil_mese, ItemHadronCoil.class, hadron_coil_mese.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_power, hadron_power.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_power_10m, hadron_power_10m.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_power_100m, hadron_power_100m.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_power_1g, hadron_power_1g.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_power_10g, hadron_power_10g.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_diode, hadron_diode.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_analysis, hadron_analysis.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_analysis_glass, hadron_analysis_glass.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_access, hadron_access.getUnlocalizedName());
		GameRegistry.registerBlock(hadron_core, hadron_core.getUnlocalizedName());
		
		GameRegistry.registerBlock(rbmk_rod, rbmk_rod.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_control, rbmk_control.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_control_auto, rbmk_control_auto.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_blank, rbmk_blank.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_boiler, rbmk_boiler.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_reflector, rbmk_reflector.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_absorber, rbmk_absorber.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_moderator, rbmk_moderator.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_outgasser, rbmk_outgasser.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_console, rbmk_console.getUnlocalizedName());
		GameRegistry.registerBlock(rbmk_loader, rbmk_loader.getUnlocalizedName());
		GameRegistry.registerBlock(pribris, pribris.getUnlocalizedName());
		GameRegistry.registerBlock(pribris_burning, pribris_burning.getUnlocalizedName());
		GameRegistry.registerBlock(pribris_radiating, pribris_radiating.getUnlocalizedName());
		
		GameRegistry.registerBlock(red_cable, red_cable.getUnlocalizedName());
		GameRegistry.registerBlock(red_wire_coated, red_wire_coated.getUnlocalizedName());
		GameRegistry.registerBlock(red_pylon, red_pylon.getUnlocalizedName());
		GameRegistry.registerBlock(cable_switch, cable_switch.getUnlocalizedName());
		GameRegistry.registerBlock(machine_detector, machine_detector.getUnlocalizedName());
		GameRegistry.registerBlock(rf_cable, rf_cable.getUnlocalizedName());
		GameRegistry.registerBlock(oil_duct, oil_duct.getUnlocalizedName());
		GameRegistry.registerBlock(oil_duct_solid, oil_duct_solid.getUnlocalizedName());
		GameRegistry.registerBlock(gas_duct, gas_duct.getUnlocalizedName());
		GameRegistry.registerBlock(gas_duct_solid, gas_duct_solid.getUnlocalizedName());
		GameRegistry.registerBlock(fluid_duct, fluid_duct.getUnlocalizedName());
		GameRegistry.registerBlock(conveyor, conveyor.getUnlocalizedName());
		GameRegistry.registerBlock(chain, chain.getUnlocalizedName());

		GameRegistry.registerBlock(ladder_sturdy, ladder_sturdy.getUnlocalizedName());
		GameRegistry.registerBlock(ladder_iron, ladder_iron.getUnlocalizedName());
		GameRegistry.registerBlock(ladder_gold, ladder_gold.getUnlocalizedName());
		GameRegistry.registerBlock(ladder_titanium, ladder_titanium.getUnlocalizedName());
		GameRegistry.registerBlock(ladder_copper, ladder_copper.getUnlocalizedName());
		GameRegistry.registerBlock(ladder_tungsten, ladder_tungsten.getUnlocalizedName());
		GameRegistry.registerBlock(ladder_aluminium, ladder_aluminium.getUnlocalizedName());
		GameRegistry.registerBlock(ladder_steel, ladder_steel.getUnlocalizedName());
		GameRegistry.registerBlock(ladder_lead, ladder_lead.getUnlocalizedName());
		GameRegistry.registerBlock(ladder_cobalt, ladder_cobalt.getUnlocalizedName());
		
		GameRegistry.registerBlock(barrel_plastic, ItemBlockLore.class, barrel_plastic.getUnlocalizedName());
		GameRegistry.registerBlock(barrel_corroded, ItemBlockLore.class, barrel_corroded.getUnlocalizedName());
		GameRegistry.registerBlock(barrel_iron, ItemBlockLore.class, barrel_iron.getUnlocalizedName());
		GameRegistry.registerBlock(barrel_steel, ItemBlockLore.class, barrel_steel.getUnlocalizedName());
		GameRegistry.registerBlock(barrel_antimatter, ItemBlockLore.class, barrel_antimatter.getUnlocalizedName());
		GameRegistry.registerBlock(machine_battery_potato, machine_battery_potato.getUnlocalizedName());
		GameRegistry.registerBlock(machine_battery, machine_battery.getUnlocalizedName());
		GameRegistry.registerBlock(machine_lithium_battery, machine_lithium_battery.getUnlocalizedName());
		GameRegistry.registerBlock(machine_schrabidium_battery, machine_schrabidium_battery.getUnlocalizedName());
		GameRegistry.registerBlock(machine_dineutronium_battery, machine_dineutronium_battery.getUnlocalizedName());
		GameRegistry.registerBlock(machine_fensu, machine_fensu.getUnlocalizedName());
		GameRegistry.registerBlock(machine_transformer, machine_transformer.getUnlocalizedName());
		GameRegistry.registerBlock(machine_transformer_20, machine_transformer_20.getUnlocalizedName());
		GameRegistry.registerBlock(machine_transformer_dnt, machine_transformer_dnt.getUnlocalizedName());
		GameRegistry.registerBlock(machine_transformer_dnt_20, machine_transformer_dnt_20.getUnlocalizedName());
		GameRegistry.registerBlock(machine_converter_he_rf, machine_converter_he_rf.getUnlocalizedName());
		GameRegistry.registerBlock(machine_converter_rf_he, machine_converter_rf_he.getUnlocalizedName());
		GameRegistry.registerBlock(machine_electric_furnace_off, machine_electric_furnace_off.getUnlocalizedName());
		GameRegistry.registerBlock(machine_electric_furnace_on, machine_electric_furnace_on.getUnlocalizedName());
		GameRegistry.registerBlock(machine_arc_furnace_off, machine_arc_furnace_off.getUnlocalizedName());
		GameRegistry.registerBlock(machine_arc_furnace_on, machine_arc_furnace_on.getUnlocalizedName());
		GameRegistry.registerBlock(machine_microwave, machine_microwave.getUnlocalizedName());
		GameRegistry.registerBlock(machine_assembler, machine_assembler.getUnlocalizedName());
		GameRegistry.registerBlock(machine_chemplant, machine_chemplant.getUnlocalizedName());
		GameRegistry.registerBlock(machine_fluidtank, machine_fluidtank.getUnlocalizedName());
		GameRegistry.registerBlock(machine_boiler_off, machine_boiler_off.getUnlocalizedName());
		GameRegistry.registerBlock(machine_boiler_on, machine_boiler_on.getUnlocalizedName());
		GameRegistry.registerBlock(machine_boiler_electric_on, machine_boiler_electric_on.getUnlocalizedName());
		GameRegistry.registerBlock(machine_boiler_electric_off, machine_boiler_electric_off.getUnlocalizedName());
		GameRegistry.registerBlock(machine_turbine, machine_turbine.getUnlocalizedName());
		GameRegistry.registerBlock(machine_large_turbine, machine_large_turbine.getUnlocalizedName());
		GameRegistry.registerBlock(machine_deaerator, machine_deaerator.getUnlocalizedName());
		GameRegistry.registerBlock(machine_waste_drum, machine_waste_drum.getUnlocalizedName());
		GameRegistry.registerBlock(machine_storage_drum, machine_storage_drum.getUnlocalizedName());
		GameRegistry.registerBlock(machine_shredder, machine_shredder.getUnlocalizedName());
		GameRegistry.registerBlock(machine_shredder_large, machine_shredder_large.getUnlocalizedName());
		//GameRegistry.registerBlock(machine_deuterium, machine_deuterium.getUnlocalizedName());
		GameRegistry.registerBlock(machine_well, machine_well.getUnlocalizedName());
		GameRegistry.registerBlock(machine_pumpjack, machine_pumpjack.getUnlocalizedName());
		GameRegistry.registerBlock(machine_flare, machine_flare.getUnlocalizedName());
		GameRegistry.registerBlock(machine_refinery, machine_refinery.getUnlocalizedName());
		GameRegistry.registerBlock(machine_drill, machine_drill.getUnlocalizedName());
		GameRegistry.registerBlock(machine_mining_laser, ItemBlockLore.class, machine_mining_laser.getUnlocalizedName());
		GameRegistry.registerBlock(barricade, barricade.getUnlocalizedName());
		GameRegistry.registerBlock(machine_turbofan, machine_turbofan.getUnlocalizedName());
		GameRegistry.registerBlock(machine_schrabidium_transmutator, machine_schrabidium_transmutator.getUnlocalizedName());
		GameRegistry.registerBlock(machine_combine_factory, machine_combine_factory.getUnlocalizedName());
		GameRegistry.registerBlock(machine_teleporter, machine_teleporter.getUnlocalizedName());
		GameRegistry.registerBlock(machine_satlinker, machine_satlinker.getUnlocalizedName());
		GameRegistry.registerBlock(machine_telelinker, machine_telelinker.getUnlocalizedName());
		GameRegistry.registerBlock(machine_keyforge, machine_keyforge.getUnlocalizedName());
		GameRegistry.registerBlock(machine_armor_table, machine_armor_table.getUnlocalizedName());
		GameRegistry.registerBlock(machine_forcefield, machine_forcefield.getUnlocalizedName());
		GameRegistry.registerBlock(radiorec, radiorec.getUnlocalizedName());
		GameRegistry.registerBlock(radiobox, radiobox.getUnlocalizedName());
		
		//ReiX Machines
		//GameRegistry.registerBlock(machine_reix_mainframe, machine_reix_mainframe.getUnlocalizedName());
		
		//Multiblock Helpers
		GameRegistry.registerBlock(marker_structure, marker_structure.getUnlocalizedName());
		
		//The muffler
		GameRegistry.registerBlock(muffler, muffler.getUnlocalizedName());
		
		//Multiblock Parts
		GameRegistry.registerBlock(struct_launcher, struct_launcher.getUnlocalizedName());
		GameRegistry.registerBlock(struct_scaffold, struct_scaffold.getUnlocalizedName());
		GameRegistry.registerBlock(struct_launcher_core, struct_launcher_core.getUnlocalizedName());
		GameRegistry.registerBlock(struct_launcher_core_large, struct_launcher_core_large.getUnlocalizedName());
		GameRegistry.registerBlock(struct_soyuz_core, struct_soyuz_core.getUnlocalizedName());
		GameRegistry.registerBlock(struct_iter_core, struct_iter_core.getUnlocalizedName());
		GameRegistry.registerBlock(struct_plasma_core, struct_plasma_core.getUnlocalizedName());
		
		//Absorbers
		GameRegistry.registerBlock(absorber, absorber.getUnlocalizedName());
		GameRegistry.registerBlock(absorber_red, absorber_red.getUnlocalizedName());
		GameRegistry.registerBlock(absorber_green, absorber_green.getUnlocalizedName());
		GameRegistry.registerBlock(absorber_pink, absorber_pink.getUnlocalizedName());
		GameRegistry.registerBlock(decon, decon.getUnlocalizedName());
		
		//Solar Tower Blocks
		GameRegistry.registerBlock(machine_solar_boiler, machine_solar_boiler.getUnlocalizedName());
		GameRegistry.registerBlock(solar_mirror, solar_mirror.getUnlocalizedName());
		
		//Industrial Factories
		GameRegistry.registerBlock(factory_titanium_hull, factory_titanium_hull.getUnlocalizedName());
		GameRegistry.registerBlock(factory_titanium_furnace, factory_titanium_furnace.getUnlocalizedName());
		GameRegistry.registerBlock(factory_titanium_conductor, factory_titanium_conductor.getUnlocalizedName());
		GameRegistry.registerBlock(factory_titanium_core, factory_titanium_core.getUnlocalizedName());
		GameRegistry.registerBlock(factory_advanced_hull, factory_advanced_hull.getUnlocalizedName());
		GameRegistry.registerBlock(factory_advanced_furnace, factory_advanced_furnace.getUnlocalizedName());
		GameRegistry.registerBlock(factory_advanced_conductor, factory_advanced_conductor.getUnlocalizedName());
		GameRegistry.registerBlock(factory_advanced_core, factory_advanced_core.getUnlocalizedName());
		
		//The Fluid Inserter
		//GameRegistry.registerBlock(machine_inserter, machine_inserter.getUnlocalizedName());
		
		//Multiblock Generators
		GameRegistry.registerBlock(reactor_element, reactor_element.getUnlocalizedName());
		GameRegistry.registerBlock(reactor_control, reactor_control.getUnlocalizedName());
		GameRegistry.registerBlock(reactor_hatch, reactor_hatch.getUnlocalizedName());
		GameRegistry.registerBlock(reactor_ejector, reactor_ejector.getUnlocalizedName());
		GameRegistry.registerBlock(reactor_inserter, reactor_inserter.getUnlocalizedName());
		GameRegistry.registerBlock(reactor_conductor, reactor_conductor.getUnlocalizedName());
		GameRegistry.registerBlock(reactor_computer, reactor_computer.getUnlocalizedName());

		GameRegistry.registerBlock(fusion_conductor, fusion_conductor.getUnlocalizedName());
		GameRegistry.registerBlock(fusion_center, fusion_center.getUnlocalizedName());
		GameRegistry.registerBlock(fusion_motor, fusion_motor.getUnlocalizedName());
		GameRegistry.registerBlock(fusion_heater, fusion_heater.getUnlocalizedName());
		GameRegistry.registerBlock(fusion_hatch, fusion_hatch.getUnlocalizedName());
		GameRegistry.registerBlock(fusion_core, fusion_core.getUnlocalizedName());
		GameRegistry.registerBlock(plasma, ItemBlockLore.class, plasma.getUnlocalizedName());
		GameRegistry.registerBlock(iter, iter.getUnlocalizedName());
		GameRegistry.registerBlock(plasma_heater, plasma_heater.getUnlocalizedName());

		GameRegistry.registerBlock(watz_element, watz_element.getUnlocalizedName());
		GameRegistry.registerBlock(watz_control, watz_control.getUnlocalizedName());
		GameRegistry.registerBlock(watz_cooler, watz_cooler.getUnlocalizedName());
		GameRegistry.registerBlock(watz_end, watz_end.getUnlocalizedName());
		GameRegistry.registerBlock(watz_hatch, watz_hatch.getUnlocalizedName());
		GameRegistry.registerBlock(watz_conductor, watz_conductor.getUnlocalizedName());
		GameRegistry.registerBlock(watz_core, watz_core.getUnlocalizedName());

		GameRegistry.registerBlock(fwatz_conductor, fwatz_conductor.getUnlocalizedName());
		GameRegistry.registerBlock(fwatz_scaffold, fwatz_scaffold.getUnlocalizedName());
		GameRegistry.registerBlock(fwatz_hatch, fwatz_hatch.getUnlocalizedName());
		GameRegistry.registerBlock(fwatz_computer, fwatz_computer.getUnlocalizedName());
		GameRegistry.registerBlock(fwatz_core, fwatz_core.getUnlocalizedName());
		GameRegistry.registerBlock(fwatz_cooler, fwatz_cooler.getUnlocalizedName());
		GameRegistry.registerBlock(fwatz_tank, fwatz_tank.getUnlocalizedName());
		GameRegistry.registerBlock(fwatz_plasma, fwatz_plasma.getUnlocalizedName());
		
		//E
		GameRegistry.registerBlock(balefire, balefire.getUnlocalizedName());
		
		//AMS
		GameRegistry.registerBlock(ams_base, ams_base.getUnlocalizedName());
		GameRegistry.registerBlock(ams_emitter, ams_emitter.getUnlocalizedName());
		GameRegistry.registerBlock(ams_limiter, ams_limiter.getUnlocalizedName());
		
		//Dark Fusion Core
		GameRegistry.registerBlock(dfc_emitter, dfc_emitter.getUnlocalizedName());
		GameRegistry.registerBlock(dfc_injector, dfc_injector.getUnlocalizedName());
		GameRegistry.registerBlock(dfc_receiver, dfc_receiver.getUnlocalizedName());
		GameRegistry.registerBlock(dfc_stabilizer, dfc_stabilizer.getUnlocalizedName());
		GameRegistry.registerBlock(dfc_core, dfc_core.getUnlocalizedName());
		
		//Missile Blocks
		GameRegistry.registerBlock(machine_missile_assembly, machine_missile_assembly.getUnlocalizedName());
		GameRegistry.registerBlock(launch_pad, launch_pad.getUnlocalizedName());
		GameRegistry.registerBlock(compact_launcher, compact_launcher.getUnlocalizedName());
		GameRegistry.registerBlock(launch_table, launch_table.getUnlocalizedName());
		GameRegistry.registerBlock(soyuz_launcher, soyuz_launcher.getUnlocalizedName());
		GameRegistry.registerBlock(sat_dock, sat_dock.getUnlocalizedName());
		GameRegistry.registerBlock(soyuz_capsule, soyuz_capsule.getUnlocalizedName());
		GameRegistry.registerBlock(machine_radar, machine_radar.getUnlocalizedName());
		
		//Guide
		GameRegistry.registerBlock(book_guide, book_guide.getUnlocalizedName());
		
		//Sat Blocks
		GameRegistry.registerBlock(sat_mapper, sat_mapper.getUnlocalizedName());
		GameRegistry.registerBlock(sat_scanner, sat_scanner.getUnlocalizedName());
		GameRegistry.registerBlock(sat_radar, sat_radar.getUnlocalizedName());
		GameRegistry.registerBlock(sat_laser, sat_laser.getUnlocalizedName());
		GameRegistry.registerBlock(sat_foeq, sat_foeq.getUnlocalizedName());
		GameRegistry.registerBlock(sat_resonator, sat_resonator.getUnlocalizedName());
		
		//Rails
		GameRegistry.registerBlock(rail_highspeed, rail_highspeed.getUnlocalizedName());
		GameRegistry.registerBlock(rail_booster, rail_booster.getUnlocalizedName());
		
		//Crate
		GameRegistry.registerBlock(crate, crate.getUnlocalizedName());
		GameRegistry.registerBlock(crate_weapon, crate_weapon.getUnlocalizedName());
		GameRegistry.registerBlock(crate_lead, crate_lead.getUnlocalizedName());
		GameRegistry.registerBlock(crate_metal, crate_metal.getUnlocalizedName());
		GameRegistry.registerBlock(crate_red, crate_red.getUnlocalizedName());
		GameRegistry.registerBlock(crate_can, crate_can.getUnlocalizedName());
		GameRegistry.registerBlock(crate_ammo, crate_ammo.getUnlocalizedName());
		GameRegistry.registerBlock(crate_jungle, crate_jungle.getUnlocalizedName());
		
		//ElB
		GameRegistry.registerBlock(statue_elb, statue_elb.getUnlocalizedName());
		GameRegistry.registerBlock(statue_elb_g, statue_elb_g.getUnlocalizedName());
		GameRegistry.registerBlock(statue_elb_w, statue_elb_w.getUnlocalizedName());
		GameRegistry.registerBlock(statue_elb_f, statue_elb_f.getUnlocalizedName());
		
		//Fluids
		GameRegistry.registerBlock(mud_block, mud_block.getUnlocalizedName());
		GameRegistry.registerBlock(acid_block, acid_block.getUnlocalizedName());
		GameRegistry.registerBlock(toxic_block, toxic_block.getUnlocalizedName());
		GameRegistry.registerBlock(schrabidic_block, schrabidic_block.getUnlocalizedName());
		GameRegistry.registerBlock(corium_block, corium_block.getUnlocalizedName());
		
		//Multiblock Dummy Blocks
		GameRegistry.registerBlock(dummy_block_igenerator, dummy_block_igenerator.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_igenerator, dummy_port_igenerator.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_centrifuge, dummy_block_centrifuge.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_cyclotron, dummy_block_cyclotron.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_cyclotron, dummy_port_cyclotron.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_well, dummy_block_well.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_well, dummy_port_well.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_flare, dummy_block_flare.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_flare, dummy_port_flare.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_drill, dummy_block_drill.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_drill, dummy_port_drill.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_assembler, dummy_block_assembler.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_assembler, dummy_port_assembler.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_chemplant, dummy_block_chemplant.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_chemplant, dummy_port_chemplant.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_fluidtank, dummy_block_fluidtank.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_fluidtank, dummy_port_fluidtank.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_refinery, dummy_block_refinery.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_refinery, dummy_port_refinery.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_pumpjack, dummy_block_pumpjack.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_pumpjack, dummy_port_pumpjack.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_turbofan, dummy_block_turbofan.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_turbofan, dummy_port_turbofan.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_ams_limiter, dummy_block_ams_limiter.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_ams_limiter, dummy_port_ams_limiter.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_ams_emitter, dummy_block_ams_emitter.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_ams_emitter, dummy_port_ams_emitter.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_ams_base, dummy_block_ams_base.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_ams_base, dummy_port_ams_base.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_radgen, dummy_block_radgen.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_radgen, dummy_port_radgen.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_reactor_small, dummy_block_reactor_small.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_reactor_small, dummy_port_reactor_small.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_vault, dummy_block_vault.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_blast, dummy_block_blast.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_gascent, dummy_block_gascent.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_uf6, dummy_block_uf6.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_block_puf6, dummy_block_puf6.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_plate_compact_launcher, dummy_plate_compact_launcher.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_compact_launcher, dummy_port_compact_launcher.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_plate_launch_table, dummy_plate_launch_table.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_port_launch_table, dummy_port_launch_table.getUnlocalizedName());
		GameRegistry.registerBlock(dummy_plate_cargo, dummy_plate_cargo.getUnlocalizedName());
		
		//Other Technical Blocks
		GameRegistry.registerBlock(oil_pipe, oil_pipe.getUnlocalizedName());
		GameRegistry.registerBlock(drill_pipe, drill_pipe.getUnlocalizedName());
		GameRegistry.registerBlock(vent_chlorine, vent_chlorine.getUnlocalizedName());
		GameRegistry.registerBlock(vent_cloud, vent_cloud.getUnlocalizedName());
		GameRegistry.registerBlock(vent_pink_cloud, vent_pink_cloud.getUnlocalizedName());
		GameRegistry.registerBlock(vent_chlorine_seal, vent_chlorine_seal.getUnlocalizedName());
		GameRegistry.registerBlock(chlorine_gas, chlorine_gas.getUnlocalizedName());
		GameRegistry.registerBlock(gas_radon, gas_radon.getUnlocalizedName());
		GameRegistry.registerBlock(gas_radon_dense, gas_radon_dense.getUnlocalizedName());
		GameRegistry.registerBlock(gas_radon_tomb, gas_radon_tomb.getUnlocalizedName());
		GameRegistry.registerBlock(gas_monoxide, gas_monoxide.getUnlocalizedName());
		GameRegistry.registerBlock(gas_asbestos, gas_asbestos.getUnlocalizedName());
		GameRegistry.registerBlock(gas_flammable, gas_flammable.getUnlocalizedName());
		
		//???
		GameRegistry.registerBlock(crystal_virus, crystal_virus.getUnlocalizedName());
		GameRegistry.registerBlock(crystal_hardened, crystal_hardened.getUnlocalizedName());
		GameRegistry.registerBlock(crystal_pulsar, crystal_pulsar.getUnlocalizedName());
		GameRegistry.registerBlock(taint, ItemTaintBlock.class, taint.getUnlocalizedName());
		GameRegistry.registerBlock(residue, residue.getUnlocalizedName());
		GameRegistry.registerBlock(cheater_virus, cheater_virus.getUnlocalizedName());
		GameRegistry.registerBlock(cheater_virus_seed, cheater_virus_seed.getUnlocalizedName());
		GameRegistry.registerBlock(ntm_dirt, ntm_dirt.getUnlocalizedName());
		GameRegistry.registerBlock(pink_log, pink_log.getUnlocalizedName());
		GameRegistry.registerBlock(pink_planks, pink_planks.getUnlocalizedName());
		GameRegistry.registerBlock(pink_slab, pink_slab.getUnlocalizedName());
		GameRegistry.registerBlock(pink_double_slab, pink_double_slab.getUnlocalizedName());
		GameRegistry.registerBlock(pink_stairs, pink_stairs.getUnlocalizedName());
		GameRegistry.registerBlock(ff, ff.getUnlocalizedName());
	}
}
