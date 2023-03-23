import React, {useState} from 'react'
import './navbar.scss';
import {GrWorkshop} from 'react-icons/gr'
import {AiFillCloseCircle} from 'react-icons/ai'
import {TbGridDots, TbRuler3} from 'react-icons/tb'
import ModalLogin from '../ModalLogin/ModalLogin';

 

const Navbar = () => {
    const [active, setActive] = useState('navBar');
    // const [navIsShown, setNavIsShown] = useState (false);

    const showNav = () => {
        setActive('navBar activeNavbar');
        // setNavIsShown(true);
    }

    const closeNav = () => {
        setActive('navBar');
        // setNavIsShown(false);
    }

    // const handleClick = () => {
    //     setOpenModal(true);
    //     setNavIsShown(false);
    // }

    

    const[openModel, setOpenModal] = useState(false);
    
    
    return (
   <section className='navbarSection'>
    <header className='header flex'>

        <div className='logoDiv'> 
            <a href="#" className='logo flex'>
                <h1><GrWorkshop className="icon"/> Workshops. </h1>
            </a>
        </div>

        
        <div className={active}>
            <ul className='navLists flex'>
                <li className="navItem">
                    <a href="#" className='navLink'>Home</a>
                </li>

                <li onClick= {() => setOpenModal(true)} className="navItem">
                    <a href="#" className='navLink'>Login</a>
                    <ModalLogin open={openModel}/>
                </li>

                <li className="navItem">
                    <a href="#" className='navLink'>Shop</a> 
                </li>

                <li className="navItem">
                    <a href="#" className='navLink'>Add workshop</a> 
                </li>

                <button className='btn'>
                    <a href="#"> Buy now</a>
                </button>
                </ul>

                <div onClick={closeNav} className='closeNavbar'>
                    <AiFillCloseCircle className="icon" />
                </div>
        </div>
        <div onClick={showNav} className='toggleNavbar'>
            <TbGridDots className="icon" />
        </div>
    </header>
   </section>
  )
}

export default Navbar