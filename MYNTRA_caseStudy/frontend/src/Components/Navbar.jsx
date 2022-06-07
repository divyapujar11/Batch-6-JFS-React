import styles from "./navbar.module.css";
import LogoutRoundedIcon from '@mui/icons-material/LogoutRounded'; import React from "react";
import SearchIcon from '@mui/icons-material/Search';
import PhoneAndroidIcon from '@mui/icons-material/PhoneAndroid';
import PermIdentityIcon from '@mui/icons-material/PermIdentity';
import ShoppingCartIcon from '@mui/icons-material/ShoppingCart';
import ShoppingBagIcon from '@mui/icons-material/ShoppingBag';
import { ReactComponent as CartLogoIcon } from "../SVG/CartLogoIcon.svg";
import HistoryIcon from '@mui/icons-material/History';
import { Button } from "@mui/material";
import { styled } from '@mui/material/styles';
import axios from "axios";
import { Link } from 'react-router-dom';
import { shallowEqual, useDispatch } from "react-redux";
import { getQuery } from "../Redux/action";
import { useSelector } from "react-redux";
import { useHistory } from "react-router-dom/cjs/react-router-dom.min";
import NavbarFloat from "./NavbarFloat";
import AccountCircleRoundedIcon from '@mui/icons-material/AccountCircleRounded';
import useDebouncer from "../Hooks/useDebouncer";
const NavBar = () => {
    const dispatch = useDispatch();
    const [params, setParms] = React.useState(null);
    const [results, setResults] = React.useState(null);
    const [view, setView] = React.useState(false);
    const [cartTotal, setCartTotal] = React.useState(0);
    const { cart } = useSelector(state => state.cart, shallowEqual);
    const history = useHistory();
    const getNumber = localStorage.getItem("phone")
    const GetItem = () => {
        const data = [];
        for (var i = localStorage.length - 2; i >= 2; i--) {
            let res = JSON.parse(localStorage.getItem(i));
            console.log(res)
            res && res.length > 1 && data.push(res);
        }
        return (
            <div>
                {data.map((item) => (
                    <div className={styles.res}>
                        <HistoryIcon />
                        <div className={styles.rest}>{item}</div>
                    </div>
                ))}
            </div>
        )
    }

    const search = () => {
        const config = {
            method: 'get',
            url: `https://fake-rjson-server-pro.herokuapp.com/products?q=${params}&_limit=5&_page=1`
        }
        axios(config)
        .then((res) => {
            setResults(res.data)
            res.data.map((el, index) => {
                localStorage.setItem(index, JSON.stringify(el.title))
            })
        });
    }
    const debounced = useDebouncer( search ,400);

    React.useEffect(() => {
        debounced();
        let res = 0;
        cart.forEach((curr) => res += curr.qty);
        setCartTotal(res);
    }, [params, cart]);
    const getQ = (name) => {
        dispatch(getQuery(name));
        setView(false);
    }

    const SignUpButton = styled(Button)({
        boxShadow: 'none',
        textTransform: 'none',
        fontSize: 16,
        width: "80%",
        padding: '12px',
        margin: "auto",
        border: '1px solid',
        lineHeight: 1.5,
        backgroundColor: '#f43397',
        borderColor: '#f43397',
        '&:hover': {
            backgroundColor: '#f43397',
            borderColor: '#f43397',
            boxShadow: 'none',
        },
    });
    const logout = () => {
        localStorage.clear("phone");
        window.location.replace("/")
    }
    return (
        <>
            <div className={styles.Main_Header}>
                <div>
                    <div className={styles.upper}>
                        <div className={styles.header_conatainer}>
                            <Link to='/'>
                                <div className={styles.header_logo}>
                                    <CartLogoIcon />
                                </div>
                            </Link>
                            <div className={styles.cards_container}>
                            <div className={styles.links}>
                    <Link onClick={() => getQ("Mens Top Were")} to="/cat">Men </Link>
                    <NavbarFloat key="Mens Top " onClick={() => { getQ("Mens Top Were"); history.push("/cat") }} textArr={[["All Men", "View All"], ["Top Wear", "All Top Wear", "Tshirts", "Shirts"], ["Bottom Wear", "Track Pants", "Jeans", "Trousers"], ["Men Accessories", "All Men Accessories", "Watches", "Belts", "Wallets", "Jewellery", "Sunglasses", "Bags"], ["Men Footwear", "Sports Shoes", "Casual Shoes", "Formal Shoes", "Sandals"], ["Ethnic Wear", "Men Kurtas", "Ethnic Jackets", "Inner & Sleep Wear", "All Inner & Sleep Wear"]]} />
                    <Link onClick={() => getQ("Dresses")} to="/cat">Women </Link>
                    <NavbarFloat key="women" onClick={() => { getQ("Dresses"); history.push("/cat") }} textArr={[["All Women", "View All"], ["All Suits & Dress Material", "Cotton Suits", "Embroidered Suits", "Chanderi Suits"], ["Other Ethnic", "Blouses", "Dupattas", "Lehanga", "Gown", "Ethnic Bottomwear"]]} />
                    
                    <Link onClick={() => getQ("Beauty and health")} to="/cat">Beauty</Link>
                    <NavbarFloat key="Beauty n" onClick={() => { getQ("Beauty and health"); history.push("/cat") }} textArr={[["All Beauty Products", "View All"], ["Make up", "Face", "Eyes", "Lips", "Nails"], ["Wellness", "Sanitizers", "Oral Care", "Feminine Hygiene", "Skincare", "Deodorants"]]} />
                    
                    <Link onClick={() => getQ("Home and Kitchen")} to="/cat">Home & Living</Link>
                    <NavbarFloat key="Home and" onClick={() => { getQ("Home and Kitchen"); history.push("/cat") }} textArr={[["Home Furnishing", "Bedsheets", "Doormats", "Curtains & Sheers", "Cushions & Cushion Covers", "Mattress Protectors"], ["Home Decor", "All Home Decor", "Stickers", "Clocks", "Showpieces", "Kitchen & Dining", "Kitchen Storage", "Cookware & Bakeware"]]} />
                    
                </div>
                                
                                <div className={styles.Search_Input}>
                                <div className={styles.icon}>
                                    <SearchIcon />
                                </div>
                                <input onClick={() => { setView(!view); setResults(null) }} onChange={(e) => { setParms(e.target.value) }} className={styles.search_input} type="text" placeholder="Search for Products, Brands and more" />
                            </div>
                                <div className={styles.profileCard}>
                                    <div className={styles.profile}>
                                        <PermIdentityIcon />
                                        <p>Profile</p>
                                        <div className={styles.profileContent}>
                                            {getNumber ? (
                                                <div style={{ cursor: "default", }}>
                                                    <div style={{ cursor: "text", gap: "0.5rem", display: "flex", justifyContent: "centrer", alignItems: "center" }}>
                                                        <AccountCircleRoundedIcon style={{ cursor: "default", }} fontSize="large" />
                                                        <div>
                                                            <p style={{ fontSize: "18px", marginBlockStart: "0.5em", marginBlockEnd: "0.2em", fontWeight: "bold" }}>WelCome</p>
                                                            <p style={{ fontSize: "16px", marginBlockEnd: "0.5em" }}>+91{getNumber}</p>
                                                        </div>
                                                    </div>
                                                    <div className={styles.dividerLines}></div>
                                                    <h3 style={{ cursor: "pointer", margin: 0, justifyContent: "left", alignItems: "center" }}>Order</h3>
                                                    <h3 style={{ cursor: "pointer", margin: 0, justifyContent: "left", alignItems: "center" }}>WishList</h3>
                                                    <h3 style={{ cursor: "pointer", margin: 0, justifyContent: "left", alignItems: "center" }}>GiftCards</h3>
                                                    <h3 style={{ cursor: "pointer", margin: 0, justifyContent: "left", alignItems: "center" }}>Myntra Insider</h3>
                                                    <div style={{ cursor: "pointer", margin: "auto", width: "100%" }}>
                                                        <div className={styles.dividerLines}></div>
                                                        <h3 onClick={logout} style={{ cursor: "pointer", margin: 0, paddingBottom: 15, justifyContent: "left", alignItems: "center" }}><LogoutRoundedIcon />Logout</h3>
                                                    </div>
                                                </div>
                                            ) :
                                                (
                                                    <>
                                                        <p style={{ fontSize: "18px", marginBlockStart: "0.5em", marginBlockEnd: "0.2em", fontWeight: "bold" }}>Hello User</p>
                                                        {/* <p style={{ fontSize: "12px", marginBlockEnd: "0.5em" }}>To access your Meesho account</p> */}
                                                        <Link style={{ textDecoration: "none" }} to="/signup">
                                                            <SignUpButton variant="contained">SIGN UP</SignUpButton>
                                                        </Link>
                                                        <div className={styles.dividerLines}></div>
                                                        <h4 style={{ alignItems: "center" }}>Orders</h4>
                                                        <h4 style={{ alignItems: "center" }}>WishList</h4>
                                                        <h4 style={{ alignItems: "center" }}>GiftCard</h4>
                                                        <h4 style={{ alignItems: "center" }}>Contact Us</h4>
                                                        <h4 style={{ alignItems: "center" }}>Myntra Insiders</h4>
                                                        <hr/>
                                                        <h4 style={{ alignItems: "center" }}>Credits Cards</h4>
                                                        <h4 style={{ alignItems: "center" }}>Coupons</h4>
                                                        <h4 style={{ alignItems: "center" }}>Saved Cards</h4>
                                                        <h4 style={{ alignItems: "center" }}>Saved address</h4>

                                                    </>
                                                )
                                            }

                                        </div>
                                    </div>
                                </div>
                                

                                <div className={styles.cart} onClick={() => history.push("/cart")}>
                                    <ShoppingCartIcon />
                                    <p>Cart</p>
                                    <div className={styles.cartTotal}>{cartTotal}</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    {/* <div className={styles.dividerLines}></div> */}
                </div>
                <div className={styles.dividerLines}></div>
                
            </div>
            {view ? (
                <div className={styles.url}>
                    {results != null ? (results.map((item) => (
                        <div className={styles.res}><SearchIcon />
                            <div className={styles.rest} onClick={() => { history.push(`/product/${item.id}`); setView(false) }}>{item.title}</div>
                        </div>
                    ))) : (
                        <div>
                            <div className={styles.res} style={{ padding: '1rem', fontSize: '18px', fontWeight: 'bold', color: 'rgb(102, 102, 102)' }}>
                                recent search</div>
                            <GetItem />
                        </div>)}
                </div>) : (<div>

                </div>)}
        </>
    )
}

export default NavBar;